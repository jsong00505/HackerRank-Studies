package strings.substring;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by jsong on 02/03/2017.
 *
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 *
 * challenge	: Java Substring
 */
public class Solution {
	public static void main(String[] main) {
		// initialize
		Scanner in = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);

		String S = in.next();
		int start = in.nextInt();
		int end = in.nextInt();

		// String Substring method
		out.println(S.substring(start, end));

		// close
		in.close();
		out.close();
	}
}
