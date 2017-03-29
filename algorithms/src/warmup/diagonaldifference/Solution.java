package warmup.diagonaldifference;

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
 * challenge	: Diagonal Difference
 */
public class Solution {
	public static void main(String[] args) {
		try (
				Scanner in = new Scanner(System.in);
				PrintWriter out = new PrintWriter(System.out);
		) {
			// get N for N * N matrix and declare 'a' array
			int n = in.nextInt();
			int a[][] = new int[n][n];

			// get user input for N * N matrix
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					a[i][j] = in.nextInt();
				}
			}

			// declare variables for getting the diagonals
			int primaryDiagonal = 0;
			int secondDiagonal = 0;

			// get primary diagonal
			for (int i = 0; i < n; i++) {
				primaryDiagonal += a[i][i];
				secondDiagonal += a[i][n - i - 1];
			}

			// get absolute value from abstract between the primary and the second
			int result = Math.abs(primaryDiagonal - secondDiagonal);

			// print
			out.print(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
