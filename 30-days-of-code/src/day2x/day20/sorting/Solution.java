package day2x.day20.sorting;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by jsong on 20/03/2017.
 * <p>
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 * <p>
 * challenge	: Day 20: Sorting
 */
public class Solution {
	public static void main(String[] args) {
		try(
			Scanner in = new Scanner(System.in);
			PrintWriter out = new PrintWriter(System.out);
		) {
			// get number of elements
			int n = in.nextInt();
			// init array size as the number
			int a[] = new int[n];

			// get element from user
			for(int i = 0; i < n; i++){
				a[i] = in.nextInt();
			}

			// count how many time swap the elements
			int count = 0;
			// bubble sorting
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n-1; j++) {
					// check if it needs swap
					if(a[j] > a[j+1]) {
						int temp = a[j];
						a[j] = a[j+1];
						a[j+1] = temp;

						// increase the count
						count++;
					}
				}
			}

			// print
			out.printf("Array is sorted in %d swaps.\n", count);
			out.printf("First Element: %d\n", a[0]);
			out.printf("First Element: %d\n", a[a.length-1]);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
