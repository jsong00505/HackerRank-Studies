package strings.duplicatewords;

import java.io.PrintWriter;
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
 * challenge	: Java Regex 2 - Duplicate Words
 * references	: http://tutorials.jenkov.com/java-regex/matcher.html
 */
public class Solution {
	public static void main(String[] args) {

		/*
		 * \b >> word boundaries
		 * \w >> word
		 * \s >> none word
		 * \1 >> 1st group
		 */
		String regex = "(\\b\\w+\\b)(\\s+\\1\\b)+";
		Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

		try(
			Scanner in = new Scanner(System.in);
			PrintWriter out = new PrintWriter(System.out);
		) {
			int numSentences = Integer.parseInt(in.nextLine());

			while (numSentences-- > 0) {
				String input = in.nextLine();

				Matcher m = p.matcher(input);

				// Check for subsequences of input that match the compiled pattern
				while (m.find()) {
					input = input.replaceAll(m.group(), m.group(1));
				}

				// Prints the modified sentence.
				out.println(input);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
