package strings.tagextractor;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by jsong on 15/03/2017.
 * <p>
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 * <p>
 * challenge	: Tag Content Extractor
 */
public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		// constraints
		assert(testCases < 1 || testCases > 100);

		while(testCases > 0){
			String line = in.nextLine();

			// regex
			/*
4
<h1>Nayeem loves counseling</h1>
<h1><h1>Sanjay has no watch</h1></h1><par>So wait for a while</par>
<Amee>safat codes like a ninja</amee>
<SA premium>Imtiaz has a secret crush</SA premium>
			*/

			String regEx = "(<\\b.+\\b>)\\1";
			Pattern p = Pattern.compile(regEx);
			Matcher m = p.matcher(line);

			while(m.find()) {
				System.out.println(m.group());
			}

			testCases--;
		}

		// close Scanner
		in.close();
	}
}
