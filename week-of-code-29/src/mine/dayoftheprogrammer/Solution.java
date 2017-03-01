package mine.dayoftheprogrammer;/*
 * Created by jsong on 01/03/2017.
 *
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 *
 * challenge	: Week of Code 29 - Day of The Programmer (7.80/10)
 */

import java.io.PrintWriter;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner in		= new Scanner(System.in);
		PrintWriter out	= new PrintWriter(System.out);
		int y = in.nextInt();
		// your code goes here

		/* sum of normal days till August is 243.
		 * 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 = 243
		 * need 13 days more for 256th day
		 *
		 * so normally the day would be 13th of September
		 */


		int theDay = 13;

		/*
		 * Julian
		 *
		 * leap years are divisible by 4.
		 */
		if( y % 4 == 0 && y < 1918 && y >= 1700) {
			theDay -= 1;
		}

		/*
		 * The transition from the Julian to Gregorian calendar system occurred in 1918,
		 * when the next day after January 31st was February 14th.
		 * This means that in 1918, February 14th was the 32nd day of the year in Russia
		 *
		 * need 13+13 days more for 256th day
		 */
		if(y == 1918) {
			theDay += 13;
		}

		/*
		 * Gregorian
		 *
		 * Divisible by 400.
		 * Divisible by 4 and not divisible by 100.
		 */
		if(((y % 400 == 0) || (y % 4 == 0 && y % 100 != 0)) && (y > 1919)) {
			theDay -= 1;
		}

		// result
		out.println(theDay+".09."+y);

		// close
		in.close();
		out.close();
	}
}
