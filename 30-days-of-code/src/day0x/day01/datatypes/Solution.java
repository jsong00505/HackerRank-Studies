package day0x.day01.datatypes;/*
 * Created by jsong on 01/03/2017.
 *
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 *
 * challenge	: Day 1: Data Types
 */

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {

		// initialize
		Scanner scan = new Scanner(System.in);

		/* Declare first integer, double, and String variables. */
		int i = 4;
		double d = 4.0;
		String s = "HackerRank ";

	    /* Declare second integer, double, and String variables. */
		int iPrime = Integer.parseInt(scan.next());
		double dPrime = Double.parseDouble(scan.next());
		scan.nextLine(); /* For new line! actually, I am not comfortable with that because it looks bad. */
		String sPrime = scan.nextLine();

	    /* Read and save an integer, double, and String to your variables.*/
		// Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

	    /* Print the sum of both integer variables on a new line. */
		System.out.println(i+iPrime);
	    /* Print the sum of the double variables on a new line. */
		System.out.println(d+dPrime);
	    /* Concatenate and print the String variables on a new line;
	    	the 's' variable above should be printed first. */
		System.out.println(s+sPrime);

		// close
		scan.close();
	}
}
