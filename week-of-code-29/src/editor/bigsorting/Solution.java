package editor.bigsorting;

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by jsong on 01/03/2017.
 *
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 *
 * challenge	: Week of Code 29 - Big Sorting
 */
public class Solution {
	public static void main(String[] args) {
		new Solution().run();
	}

	void solve(Scanner in, PrintWriter out) {
		String a[] = new String[in.nextInt()];
		for (int i = 0; i < a.length; i++) {
			a[i] = in.next();
		}

		Arrays.sort(a, (left, right) -> {
			if (left.length() != right.length()) {
				return left.length() - right.length();
			} else {
				return left.compareTo(right);
			}
		});
		for (String s : a) {
			out.println(s);
		}
	}

	void run() {
		try (
			Scanner in = new Scanner(System.in);
			PrintWriter out = new PrintWriter(System.out);
		) {
			solve(in, out);
		}
	}
}
