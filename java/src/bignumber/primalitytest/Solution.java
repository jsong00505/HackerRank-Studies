package bignumber.primalitytest;

import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by jsong on 22/03/2017.
 * <p>
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 * <p>
 * challenge	: Java Primality Test
 */
public class Solution {
	public static void main(String[] args) {
		try (
				Scanner in = new Scanner(System.in);
				PrintWriter out = new PrintWriter(System.out);
		) {
			BigInteger n = in.nextBigInteger();

			// validation(constraints)
			assert (n.toString().length() <= 100);

			/**
			 * check if the number is prime using 'isProbablePrime' method
			 * For reference: if certainty is 10, then 1 - 1/2^10 is approximately 99.9%
			 * I gotta study for Miller-Rabin && Lucas-Lehmer
			 **/
			if (n.isProbablePrime(10)) {
				out.println("prime");
			} else {
				out.println("not prime");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
