package day1x.day11.arrays2d;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by jsong on 12/03/2017.
 * <p>
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 * <p>
 * challenge	: Day 11: 2D Arrays
 */
public class Solution {
	public static void main(String[] args) {
		try(
			Scanner in = new Scanner(System.in);
			PrintWriter out = new PrintWriter(System.out);
		) {
			// declare 2d arrays
			int arr[][] = new int[6][6];

			// init
			for(int i=0; i < 6; i++){
				for(int j=0; j < 6; j++){
					arr[i][j] = in.nextInt();

					// validation
					if(arr[i][j] < -9 || arr[i][j] > 9) {
						throw new Exception("A input is out of range.");
					}
				}
			}
			// can't be under -81
			int max = -100;
			int sum;

			/*
			 * iterate
			 * [00] [01] [02]
			 *      [11]
			 * [20] [21] [22]
			 */
			for(int i = 0; i < 4; i++) {
				for(int j = 0; j < 4; j++) {
					sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];

					// check maximum value
					if(sum > max) {
						max = sum;
					}
				}
			}

			// print
			out.println(max);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
