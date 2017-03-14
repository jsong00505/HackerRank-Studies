package strings.usernamechecker;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by jsong on 14/03/2017.
 * <p>
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 * <p>
 * challenge	: Java Regex 3 - Username Checker
 */
public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String username = in.nextLine();

			/*
			 * ^			>> matches the starting position within the string
			 * $			>> matches the ending position within the string
			 * \p{Alpha}	>> alphabetic character
			 * \w			>> word
			 * {m}			>> matches the preceding element m times
			 * {m,n}		>> matches the preceding element at least m and not more than n times.
			 */
			String pattern = "^\\p{Alpha}\\w{7}\\w{0,22}$";

			Pattern r = Pattern.compile(pattern);
			Matcher m = r.matcher(username);

			if (m.find( )) {
				System.out.println("Valid");
			} else {
				System.out.println("Invalid");
			}
			testCases--;
		}
	}
}
