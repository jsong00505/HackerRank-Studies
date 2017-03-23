package warmup.averybigsum;

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
 * challenge	: A Very Big Sum
 */
public class Solution {
	static long getBigSum(int[] arr) {
		// declare and init sum
		long sum = 0;

		// iterate for array's length
		for (int e : arr) {
			sum += e;
		}

		// return
		return sum;
	}

	public static void main(String[] args) {
		try (
				Scanner in = new Scanner(System.in);
				PrintWriter out = new PrintWriter(System.out);
		) {
			int n = in.nextInt();
			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = in.nextInt();
			}

			long sum = getBigSum(arr);

			out.println(sum);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
