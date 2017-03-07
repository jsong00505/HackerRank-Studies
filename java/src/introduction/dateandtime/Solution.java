package introduction.dateandtime;

import java.io.PrintWriter;
import java.util.Calendar;
import java.util.Scanner;

/**
 * Created by jsong on 07/03/2017.
 * <p>
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 * <p>
 * challenge	: Java Date and Time
 */
public class Solution {

	public static void main(String[] args) {
		try (
			Scanner in = new Scanner(System.in);
			PrintWriter out = new PrintWriter(System.out);
		) {
			String month = in.next();
			String day = in.next();
			String year = in.next();

			// declare Calender to get the day of week
			Calendar cal = Calendar.getInstance();
			cal.set(Integer.parseInt(year), Integer.parseInt(month)-1, Integer.parseInt(day));

			// get the day of week by using switch statement
			String dayOfWeek = "";
			switch(cal.get(Calendar.DAY_OF_WEEK)) {
				case 1:
					dayOfWeek = "SUNDAY";
					break;
				case 2:
					dayOfWeek = "MONDAY";
					break;
				case 3:
					dayOfWeek = "TUESDAY";
					break;
				case 4:
					dayOfWeek = "WEDNESDAY";
					break;
				case 5:
					dayOfWeek = "THURSDAY";
					break;
				case 6:
					dayOfWeek = "FRIDAY";
					break;
				default:
					dayOfWeek = "SATURDAY";
					break;
			}

			// print
			out.println(dayOfWeek);
		} catch(Exception e) {

		}
	}
}
