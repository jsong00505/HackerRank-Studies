package warmup.plusminus;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by jsong on 30/03/2017.
 * <p>
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 * <p>
 * challenge	: Plus Minus
 */
public class Solution {
	static String PLUS = "plus";
	static String MINUS = "minus";
	static String ZERO = "zero";

	public static void main(String[] args) {
		try (
				Scanner in = new Scanner(System.in);
				PrintWriter out = new PrintWriter(System.out);
		) {
			float n = in.nextFloat();

			// init variables
			HashMap<String, Integer> resultMap = new HashMap<>();
			resultMap.put(PLUS, 0);
			resultMap.put(MINUS, 0);
			resultMap.put(ZERO, 0);

			// count and judge the inputs
			for (int i = 0; i < n; i++) {
				int e = in.nextInt();
				if (e > 0) {
					resultMap.put(PLUS, resultMap.get(PLUS) + 1);
				} else if (e == 0) {
					resultMap.put(ZERO, resultMap.get(ZERO) + 1);
				} else {
					resultMap.put(MINUS, resultMap.get(MINUS) + 1);
				}
			}

			// print
			out.printf("%.5f\n", resultMap.get(PLUS) / n);
			out.printf("%.5f\n", resultMap.get(MINUS) / n);
			out.printf("%.5f\n", resultMap.get(ZERO) / n);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
