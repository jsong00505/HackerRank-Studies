package datastructures.twodarray;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by jsong on 29/03/2017.
 * <p>
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 * <p>
 * challenge	: Java 2D Array
 */
public class Solution {
	static int getMax2DArray(int[][] twoDArr) {
		// key point: max value cannot exceed -100
		int max = -100;

		// 0 1 2 7 12 13 14
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				int sum = 0;
				sum += twoDArr[i][j];        // 0
				sum += twoDArr[i][j + 1];        // 1
				sum += twoDArr[i][j + 2];        // 2
				sum += twoDArr[i + 1][j + 1];    // 7
				sum += twoDArr[i + 2][j];        // 12
				sum += twoDArr[i + 2][j + 1];    // 13
				sum += twoDArr[i + 2][j + 2];    // 14

				if (max < sum) {
					max = sum;
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		try (
				Scanner in = new Scanner(System.in);
				PrintWriter out = new PrintWriter(System.out);
		) {
			// declare 6 * 6 2D array
			int arr[][] = new int[6][6];

			// set values in the array
			for (int i = 0; i < 6; i++) {
				for (int j = 0; j < 6; j++) {
					arr[i][j] = in.nextInt();
				}
			}

			out.println(getMax2DArray(arr));

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
