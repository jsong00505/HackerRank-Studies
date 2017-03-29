package day2x.day26.nestedlogic;

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
 * challenge	: Day 26: Nested Logic
 */
public class Solution {
	public static void main(String[] args) {
		try (
				Scanner in = new Scanner(System.in);
				PrintWriter out = new PrintWriter(System.out);
		) {
			int actualDay = in.nextInt();
			int actualMonth = in.nextInt();
			int actualYear = in.nextInt();

			int expectedDay = in.nextInt();
			int expectedMonth = in.nextInt();
			int expectedYear = in.nextInt();

			int result = 0;

			// constraints
			assert (expectedDay >= 1 && expectedDay <= 31 && actualDay >= 1 && actualDay <= 31);
			assert (expectedMonth >= 1 && expectedMonth <= 12 && actualMonth >= 1 && actualMonth <= 12);
			assert (expectedYear >= 1 && expectedYear <= 3000 && actualYear >= 1 && actualYear <= 3000);

			// calculate late fee
			if (actualYear > expectedYear) {
				result = 10000;
			} else if ((actualMonth > expectedMonth) && (actualYear == expectedYear)) {
				result = 500 * (actualMonth - expectedMonth);
			} else if ((actualDay > expectedDay) && (actualMonth == expectedMonth) && (actualYear == expectedYear)) {
				result = 15 * (actualDay - expectedDay);
			}

			out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
