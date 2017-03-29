package warmup.simplearraysum;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by jsong on 23/03/2017.
 * <p>
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 * <p>
 * challenge	: Simple Array Sum
 */
public class Solution {
	/**
	 * Method Name: getSimpleArraySum
	 *
	 * @param arr array for sum calculation
	 * @return sum of array simply
	 */
	static int getSimpleArraySum(int[] arr) {
		// declare and init sum variable
		int sum = 0;

		// calculate
		for (int i : arr) {
			sum += i;
		}

		// return
		return sum;
	}

	public static void main(String[] args) {
		try (
				Scanner in = new Scanner(System.in);
				PrintWriter out = new PrintWriter(System.out);
		) {
			// init
			int n = in.nextInt();
			int arr[] = new int[n];

			for (int i = 0; i < n; i++) {
				arr[i] = in.nextInt();
			}

			// get sum of array
			int sum = getSimpleArraySum(arr);

			out.println(sum);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

