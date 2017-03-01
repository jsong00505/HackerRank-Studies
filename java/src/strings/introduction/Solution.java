package strings.introduction;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by jsong on 01/03/2017.
 *
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 *
 * challenge	: Java Strings Introduction
 *
 */
public class Solution {
	public static void main(String[] args) {
		// initiallize
		Scanner in 		= new Scanner(System.in);
		PrintWriter out	= new PrintWriter(System.out);

		// get A and B
		String A = in.nextLine();
		String B = in.nextLine();

		//sum the lengths of A and B and print
		int length = A.length() + B.length();

		// determine if A is lexicographically lager than B
		String answer = (A.compareTo(B) > 0) ? "Yes" : "No";

		// capitalize the first letter in both A and B and print them on a single line, separated by a space.
		StringBuilder concat = new StringBuilder();

		// make A's first letter to uppercase and concat rest of the string
		concat.append(A.substring(0, 1).toUpperCase()).append(A.substring(1));

		// make a space
		concat.append(" ");

		// make B's first letter to uppercase and concat rest of the string
		concat.append(B.substring(0, 1).toUpperCase()).append(B.substring(1));

		// print the answers
		out.print(length);
		out.print(answer);
		out.print(concat.toString());

		// close
		in.close();
		out.close();
	}
}
