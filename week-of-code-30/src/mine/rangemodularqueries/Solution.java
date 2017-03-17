package mine.rangemodularqueries;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by jsong on 17/03/2017.
 * <p>
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 * <p>
 * challenge	: Range Modular Queries
 */
public class Solution {
	public static void main(String[] args) {
		try(
			Scanner in = new Scanner(System.in);
			PrintWriter out = new PrintWriter(System.out);
		) {
			// get n and q
			int n = in.nextInt();
			int q = in.nextInt();

			// validation of n and q
			assert(n >= 1 && q >= 1 && n <= (4 * Math.pow(10, 4)) && q <= (4 * Math.pow(10, 4)));

			// get 'a' array
			int[] a = new int[n];
			for(int i = 0; i < n; i++) {
				a[i] = in.nextInt();

				//validation one element of a
				assert(a[i] >= 0 && a[i] <= (4 * Math.pow(10, 4)));

			}

			// solve queries q times
			for(int i = 0; i < q; i++) {
				int left = in.nextInt();
				int right = in.nextInt();
				int x = in.nextInt();
				int y = in.nextInt();

				// validation left, right, x and y
				assert(left >= 0 && right >= left && n > right);
				assert(x >= 1 || x <= (4 * Math.pow(10, 4)));
				assert(y >= 0 || x > y);
				int cnt = 0;
				for(int j = left; j <= right; j++) {
					if(a[j] % x == y) {
						cnt++;
					}
				}

				out.println(cnt);
			}

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
