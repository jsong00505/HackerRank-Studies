package bignumber.biginteger;

import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by jsong on 20/03/2017.
 * <p>
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 * <p>
 * challenge	: Java BigInteger
 */
public class Solution {
	public static void main(String[] args) {
		try(
			Scanner in = new Scanner(System.in);
			PrintWriter out = new PrintWriter(System.out);
		) {
			// read from STDIN
			String a = in.nextLine();
			String b = in.nextLine();

			// constraints
			assert (a.length() <= 200 && b.length() <= 200 && !a.startsWith("-") && !b.startsWith("-"));

			// class 'BigInteger'
			BigInteger bigA = new BigInteger(a);
			BigInteger bigB = new BigInteger(b);

			// write to STDOUT
			out.println(bigA.add(bigB));
			out.println(bigA.multiply(bigB));
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
