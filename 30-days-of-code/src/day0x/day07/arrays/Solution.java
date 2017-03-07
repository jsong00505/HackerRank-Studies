package day0x.day07.arrays;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by jsong on 07/03/2017.
 * <p>
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 * <p>
 * challenge	: Day 7: Arrays
 */
public class Solution {
	public static void main(String[] main) {
		try(
			Scanner in = new Scanner(System.in);
			PrintWriter out = new PrintWriter(System.out);
		) {
			// get n
			int n = in.nextInt();

			// constraints
			if(n < 1 || n > 1000) {
				throw new Exception("n is out of range.");
			}

			// make n spaces for an array
			int[] arr = new int[n];

			// get 'i'th integer and save
			for(int i=0; i < n; i++){
				arr[i] = in.nextInt();
				// constraints
				if(arr[i] < 1 || arr[i] > 10000) {
					throw new Exception("an element is out of range.");
				}
			}

			// concatenate elements by using StringBuilder
			StringBuilder rev = new StringBuilder();
			for(int i = n; i > 0; i--) {
				rev.append(arr[i-1]).append(" ");
			}

			// print
			out.println(rev.toString());
		} catch(Exception e) {

		}
	}
}
