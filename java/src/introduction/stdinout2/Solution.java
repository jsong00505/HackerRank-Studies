package introduction.stdinout2;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by jsong on 03/03/2017.
 * <p>
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 * <p>
 * challenge	: Java Stdin and Stdout II
 */
public class Solution {
	public static void main(String[] args) {
		try(
			Scanner in = new Scanner(System.in);
			PrintWriter out = new PrintWriter(System.out);
		) {
			int i = in.nextInt();

			// Write your code here.
			double d = in.nextDouble();
			in.nextLine();
			String s = in.nextLine();

			out.println("String: " + s);
			out.println("Double: " + d);
			out.println("Int: " + i);
		}catch(Exception e) {

		}
	}
}
