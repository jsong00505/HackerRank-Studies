package day0x.day05.loops;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by jsong on 05/03/2017.
 * <p>
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 * <p>
 * challenge	: Day 5: Loops
 */
public class Solution {
	public static void main(String[] args) {
		try (
				Scanner in = new Scanner(System.in);
				PrintWriter out = new PrintWriter(System.out);
		) {
			// get an integer N
			int N = in.nextInt();

			// validation
			if(N < 2 || N > 20) {
				throw new Exception("N is out of range.");
			}

			// iterating
			for(int i = 1; i <= 10; i++) {
				out.printf( "%d x %d = %d\n", N, i, N * i);
			}
		} catch(Exception e) {

		}
	}
}
