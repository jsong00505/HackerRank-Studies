package introduction.datatypes;

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
 * challenge	: Java Datatypes
 */
public class Solution {
	public static void main(String[] args) {
		try (
			Scanner in = new Scanner(System.in);
			PrintWriter out = new PrintWriter(System.out);
		) {
			// get number of problems
			int t = in.nextInt();

			// iterate for number of t
			for (int i = 0; i < t; i++) {
				// set a flag for checking
				boolean fitFlag = false;
				try {
					// set x to Long type first
					long x = in.nextLong();

					// print first statement
					out.println(x + " can be fitted in:");

					// Byte
					if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE) {
						out.println("* byte");
						fitFlag = true;
					}

					// Short
					if (x >= Short.MIN_VALUE && x <= Short.MAX_VALUE) {
						out.println("* short");
						fitFlag = true;
					}

					// Integer
					if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE) {
						out.println("* int");
						fitFlag = true;
					}

					// Long
					if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE) {
						out.println("* long");
						fitFlag = true;
					}

					// If not fit the number in any data types, just throw an exception
					if (!fitFlag) {
						throw new Exception();
					}
					//Complete the code
				} catch (Exception e) {
					out.println(in.next() + " can't be fitted anywhere.");
				}
			}
		} catch(Exception e) {

		}
	}
}
