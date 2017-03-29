package day2x.day25.timencomplexity;

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
 * challenge	: Day 25: Running Time and Complexity
 */
public class Solution {
	public static void main(String[] args) {
		try (
				Scanner in = new Scanner(System.in);
				PrintWriter out = new PrintWriter(System.out);
		) {
			int T = in.nextInt();

			for (int i = 0; i < T; i++) {
				int n = in.nextInt();

				// init text will be printed
				String printText = "Prime";

				// constraints
				assert (n >= 1 && n <= (2 * Math.pow(10, 9)));

				if (n == 1) {
					printText = "Not prime";
				}

				// check if the 'n' is prime
				for (int j = 2; j <= Math.sqrt(n); j++) {
					// if 'n' is divided by 'j', the 'n' is not prime
					if (n % j == 0 && n != 2) {
						printText = "Not prime";
						break;
					}
				}

				// print
				out.println(printText);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
