package datastructures.subarray;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by jsong on 30/03/2017.
 * <p>
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 * <p>
 * challenge	: Java Subarray
 */
public class Solution {
	public static void main(String[] args) {
		try (
				Scanner in = new Scanner(System.in);
				PrintWriter out = new PrintWriter(System.out);
		) {
			int n = in.nextInt();
			ArrayList<Integer> aList = new ArrayList<>();
			int result = 0;
			assert (n >= 1 && n <= 100);

			// set elements in aList
			for (int i = 0; i < n; i++) {
				int a = in.nextInt();

				// validation and set an element in aList
				if (a >= -1000 && a <= 1000) {
					aList.add(a);
				} else {
					assert (false);
				}
			}

			// solution
			for (int i = 0; i < n; i++) {
				int sum = 0;
				for (int j = i; j < n; j++) {
					sum += aList.get(j);

					// if sum is a negative value, plus one to result value
					if (sum < 0) {
						result++;
					}
				}
			}

			out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
