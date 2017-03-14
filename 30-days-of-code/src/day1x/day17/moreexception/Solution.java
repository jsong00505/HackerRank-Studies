package day1x.day17.moreexception;

import java.util.Scanner;

/**
 * Created by jsong on 14/03/2017.
 * <p>
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 * <p>
 * challenge	: Day 17: More Exceptions
 */
class Calculator {
	/**
	 *   Method Name: power
	 *
	 *   Calculate n to the power p
	 **/
	int power(int n, int p) throws Exception {
		// init
		int ans = 0;

		// validation
		if(n < 0 || p < 0) {
			// make an exception
			throw new Exception("n and p should be non-negative");
		}

		// calculate
		ans = (int) Math.pow(n, p);

		// return
		return ans;
	}
}

public class Solution {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		while (t-- > 0) {

			int n = in.nextInt();
			int p = in.nextInt();
			Calculator myCalculator = new Calculator();
			try {
				int ans = myCalculator.power(n, p);
				System.out.println(ans);
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		in.close();
	}
}
