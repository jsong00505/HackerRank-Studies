package introduction.loops2;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by jsong on 06/03/2017.
 * <p>
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 * <p>
 * challenge	: Java Loops II
 */
public class Solution {
	public static void main(String []argh){
		try (
			Scanner in = new Scanner(System.in);
			PrintWriter out = new PrintWriter(System.out);
		) {
			// get number of problems
			int q=in.nextInt();

			// validation
			if(q > 500 || q < 0) {
				throw new Exception("q is out of range.");
			}
			// iterate for the number
			for(int i=0;i<q;i++){
				int a = in.nextInt();
				int b = in.nextInt();
				int n = in.nextInt();

				// validation
				if(a > 50 || a < 0 || b > 50 || b < 0 || n > 15 || n < 1) {
					throw new Exception("a, b or n is out of range.");
				}

				// set sum first to a first
				int sum = a;
				for(int j = 0; j < n; j++) {
					sum += Math.pow(2, j) * b;
					out.print(sum + " ");
				}

				// make a new line
				out.println();
			}

		} catch(Exception e) {

		}
	}
}
