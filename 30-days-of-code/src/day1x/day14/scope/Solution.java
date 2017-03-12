package day1x.day14.scope;

import java.util.Scanner;

/**
 * Created by jsong on 12/03/2017.
 * <p>
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 * <p>
 * challenge	: Day 14: Scope
 */
class Difference {
	private int[] elements;
	public int maximumDifference;

	/**
	 *   Class Constructor
	 *
	 *   @param a The book's title.
	 **/
	Difference(int[] a) {
		elements = a;
	}

	/**
	 *   Method Name: computeDifference
	 *
	 *   Print the title, author, and price in the specified format.
	 **/
	public void computeDifference() {
		for(int i = 0; i < elements.length-1; i++) {
			for(int j = i; j < elements.length; j++) {
				int result = Math.abs(elements[i] - elements[j]);

				if(result > maximumDifference) {
					maximumDifference = result;
				}
			}
		}
	}

} // End of Difference class

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		Difference difference = new Difference(a);

		difference.computeDifference();

		System.out.print(difference.maximumDifference);
	}
}
