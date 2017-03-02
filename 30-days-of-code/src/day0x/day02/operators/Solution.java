package day0x.day02.operators;

import java.util.Scanner;

/**
 * Created by jsong on 02/03/2017.
 *
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 *
 * challenge	: Day 2: Operators
 */
public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double mealCost = in.nextDouble(); // original meal price
		int tipPercent = in.nextInt(); // tip percentage
		int taxPercent = in.nextInt(); // tax percentage

		// close
		in.close();

		// Write your calculation code here.
		double calCost = mealCost + mealCost * tipPercent * 0.01 + mealCost * taxPercent * 0.01;
		// cast the result of the rounding operation to an int and save it as totalCost
		int totalCost = (int) Math.round(calCost);

		// Print your result
		System.out.println("The total meal cost is " + totalCost + " dollars.");

		// close

	}
}
