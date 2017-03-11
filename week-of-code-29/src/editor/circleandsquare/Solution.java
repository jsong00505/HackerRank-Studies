package editor.circleandsquare;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by jsong on 11/03/2017.
 * <p>
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 * <p>
 * challenge	: A Circle and a Square
 */
public class Solution {
	static class Point {
		double i;
		double j;

		Point(double i, double j) {
			this.i = i;
			this.j = j;
		}
	}

	static class Circle {
		Point center;
		int r;

		Circle() {}

		Circle(Point center, int r) {
			this.center = center;
			this.r = r;
		}

		Circle read(Scanner in) {
			int j, i, r;

			j = in.nextInt();
			i = in.nextInt();
			r = in.nextInt();

			return new Circle(new Point(i, j), r);
		}

		boolean contains(int i, int j) {
			double di = i - center.i;
			double dj = j - center.j;
			return di * di + dj * dj <= r * r;
		}
	}

	static class Triangle {

		Point p1;
		Point p2;
		Point p3;

		Triangle(Point p1, Point p2, Point p3) {
			this.p1 = p1;
			this.p2 = p2;
			this.p3 = p3;
		}

		boolean contains(Point p) {
			return this.area() == new Triangle(p1, p2, p).area() + new Triangle(p2, p3, p).area() + new Triangle(p3, p1, p).area();
		}

		double area() {
			return Math.abs((p3.i - p1.i) * (p2.j - p1.j) - (p3.j - p1.j) * (p2.i - p1.i)) / 2;
		}
	}


	static class Square {

		Point p1;
		Point p2;
		Point p3;
		Point p4;

		Square() {}

		Square(Point p1, Point p2, Point p3, Point p4) {
			this.p1 = p1;
			this.p2 = p2;
			this.p3 = p3;
			this.p4 = p4;
		}

		Square read(Scanner in) {
			int j1, i1, j3, i3;

			j1 = in.nextInt();
			i1 = in.nextInt();
			j3 = in.nextInt();
			i3 = in.nextInt();

			// get a center point from two points
			double ci = (i1 + i3) / 2.0;
			double cj = (j1 + j3) / 2.0;

			double di = i1 - ci;
			double dj = j1 - cj;
			double pi = -dj;
			double pj = di;
			// pi * di + pj * dj == 0 -> perpendicular
			double i2 = ci + pi;
			double j2 = cj + pj;
			double i4 = ci - pi;
			double j4 = cj - pj;

			return new Square(new Point(i1, j1), new Point(i2, j2), new Point(i3, j3), new Point(i4, j4));
		}

		boolean contains(int i, int j) {
			return new Triangle(p1, p3, p2).contains(new Point(i, j)) || new Triangle(p1, p3, p4).contains(new Point(i, j));
		}
	}

	public static void main(String[] args) throws Exception {
		int sizeJ, sizeI;

		try (
			Scanner in = new Scanner(System.in);
			PrintWriter out = new PrintWriter(System.out);
		) {
			sizeJ = in.nextInt();
			sizeI = in.nextInt();

			Circle circle = new Circle();
			Circle c = circle.read(in);

			Square square = new Square();
			Square s = square.read(in);

			for(int i = 0; i < sizeI; i++) {
				for(int j = 0; j < sizeJ; j++) {
					if(c.contains(i, j) || s.contains(i, j)) {
						out.print("#");
					} else {
						out.print(".");
					}
				}
				out.println();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
