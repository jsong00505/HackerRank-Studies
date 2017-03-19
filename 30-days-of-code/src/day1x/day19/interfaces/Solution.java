package day1x.day19.interfaces;

import java.util.Scanner;

/**
 * Created by jsong on 20/03/2017.
 * <p>
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 * <p>
 * challenge	: Day 19: Interfaces
 */
interface AdvancedArithmetic{
	int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {

	/**
	 * Method Name: divisorSum
	 *
	 * if n is divided by an integer, do sum
	 * the integer increases from 1 to the number user gives
	 **/
	@Override
	public int divisorSum(int n) {
		// TODO Auto-generated method stub
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				sum += i;
			}
		}
		return sum;
	}
}

public class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		AdvancedArithmetic myCalculator = new Calculator();
		int sum = myCalculator.divisorSum(n);
		System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName() );
		System.out.println(sum);
	}
}
