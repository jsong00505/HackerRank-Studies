package editor.dayoftheprogrammer;/*
 * Created by jsong on 01/03/2017.
 *
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 *
 * challenge	: Week of Code 29 - Day of The Programmer
 */

import java.io.PrintWriter;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in		= new Scanner(System.in);
		PrintWriter out	= new PrintWriter(System.out);
		int y = in.nextInt();

		int daysInFebruary;
		if (y == 1918) {
			daysInFebruary = 28 - 13;
		} else if (y < 1918) {
			if (y % 4 == 0) {
				daysInFebruary = 29;
			} else {
				daysInFebruary = 28;
			}
		} else {
			if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
				daysInFebruary = 29;
			} else {
				daysInFebruary = 28;
			}
		}
		int day = 256 - 31 - daysInFebruary - 31 - 30 - 31 - 30 - 31 - 31;
		assert(1 <= day && day <= 30);


		// result
		out.println(day+".09."+y);

		// close
		in.close();
		out.close();
	}
}
