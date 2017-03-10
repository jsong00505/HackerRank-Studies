package day0x.day09.recursion;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by jsong on 10/03/2017.
 * <p>
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 * <p>
 * challenge	: Day 9: Recursion
 */
public class Solution {
	public static void main(String[] args) {
		try(
			Scanner in = new Scanner(System.in);
			PrintWriter out = new PrintWriter(System.out);
		) {
			// get number
			int numb = in.nextInt();

			// print
			out.println(factorial(numb));
		}
	}

	static int factorial(int numb) {

		if(numb == 1) {
			return 1;
		} else if(numb > 1) {
			// recursive call
			return numb * factorial(numb-1);
		} else {
			// constraints(under zero)
			return -1;
		}
	}
}
