package day1x.day10.binary;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by jsong on 11/03/2017.
 * <p>
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 * <p>
 * challenge	: Day 10: Binary Numbers
 */
public class Solution {
	// editor's solution
	public static int mostConsecutiveOnes(int n) {
		// convert number->binary string->char array
		char[] binary = Integer.toBinaryString(n).toCharArray();

		// count of current sequence of consecutive ones
		int tmpCount = 0;

		// running maximum count of consecutive ones for any section to left of tmpCount
		int maxCount = 0;
		for(int i = 0; i < binary.length; i++){

			// reset to 0 if we hit a '0' char
			if(binary[i] == '0') {

				// set new max if needed
				if(tmpCount > maxCount){
					maxCount = tmpCount;
				}

				tmpCount = 0;
			}
			else { // current location is a section of consecutive 1's
				// increment tmpCount
				tmpCount =  tmpCount + 1;
			}
		}
		// conditional is necessary here in case the string does not end with a 0
		return (tmpCount > maxCount) ? tmpCount : maxCount;
	}

	public static void main(String[] args) {
		try(
			Scanner in = new Scanner(System.in);
			PrintWriter out = new PrintWriter(System.out);
		) {

			int n = in.nextInt();
			int quotient = n;
			int consecutive = 0;
			int max = 0;

			if(n < 1 || n > Math.pow(10, 6)) {
				throw new Exception("n is out of range.");
			}
			while(quotient > 0) {
				// get remainder
				int remainder = quotient % 2;

				// divided by 2
				quotient /= 2;

				// check if remainder is 1
				if(remainder == 1) {
					consecutive++;
				} else {
					consecutive = 0;
				}

				// check if it is max
				if(max < consecutive) {
					max = consecutive;
				}
			}

			// print
			out.println(max);
		} catch(Exception e) {
			e.printStackTrace();
		}

	}
}
