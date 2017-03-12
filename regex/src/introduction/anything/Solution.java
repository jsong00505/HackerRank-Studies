package introduction.anything;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by jsong on 11/03/2017.
 * <p>
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 * <p>
 * challenge	: Matching Anything But a Newline
 */
public class Solution {
	public static void main(String[] args) {
		// declare Tester class
		Tester tester = new Tester();

		/*
		 * check the pattern matched
		 * .	>> anything
		 * {n}	>> Matches the preceding element n times.
		 * \\.	>> A backslash(\) means escape characters(here, dot)
		 */
		tester.check(".{3}\\..{3}\\..{3}\\..{3}");

	}
}

class Tester {
	public void check(String pattern){
		Scanner scanner = new Scanner(System.in);
		String testString = scanner.nextLine();
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(testString);
		boolean match = m.matches();
		System.out.format("%s", match);

		//I'd love to close Scanner.
		scanner.close();
	}
}