package day0x.day06.letsreview;

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
 * challenge	: Day 6: Let's Review
 */
public class Solution {
	public static void main(String[] args) {
		try (
			Scanner in = new Scanner(System.in);
			PrintWriter out = new PrintWriter(System.out);
		) {
			// get T from user
			int T = in.nextInt();
			// need to move next line
			in.nextLine();

			for(int i = 0; i < T; i++) {
				// get S from user
				String S = in.nextLine();

				// init even and odd StringBuilders
				StringBuilder even = new StringBuilder();
				StringBuilder odd = new StringBuilder();

				// traverse for length of S
				for(int j = 0; j < S.length(); j++) {
					if(j % 2 == 0) {
						// if even position, append characters of even position in even StringBuilder
						even.append(S.charAt(j));
					} else {
						// if odd position, append characters of odd position in even StringBuilder
						odd.append(S.charAt(j));
					}
				}

				// print
				out.println(even + " " + odd);
			}
		} catch(Exception e) {

		}

	}
}
