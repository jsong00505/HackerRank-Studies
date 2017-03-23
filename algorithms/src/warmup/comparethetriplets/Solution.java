package warmup.comparethetriplets;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by jsong on 23/03/2017.
 * <p>
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 * <p>
 * challenge	: Compare the Triplets
 */
public class Solution {
	public static void main(String[] args) {
		try (
				Scanner in = new Scanner(System.in);
				PrintWriter out = new PrintWriter(System.out);
		) {
			int a0 = in.nextInt();
			int a1 = in.nextInt();
			int a2 = in.nextInt();
			int b0 = in.nextInt();
			int b1 = in.nextInt();
			int b2 = in.nextInt();

			// init Alice's and Bob's score
			int alice = 0;
			int bob = 0;

			// first round
			if (a0 > b0) {
				alice += 1;
			} else if (a0 < b0) {
				bob += 1;
			}

			// second round
			if (a1 > b1) {
				alice += 1;
			} else if (a1 < b1) {
				bob += 1;
			}

			// third round
			if (a2 > b2) {
				alice += 1;
			} else if (a2 < b2) {
				bob += 1;
			}

			out.println(alice + " " + bob);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
