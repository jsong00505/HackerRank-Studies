package strings.regex;

import java.util.Scanner;

/**
 * Created by jsong on 10/03/2017.
 * <p>
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 * <p>
 * challenge	: Java Regex
 */
public class Solution {
	public static void main(String []args){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String IP = in.next();
			System.out.println(IP.matches(new MyRegex().pattern));
		}

	}
}

class MyRegex {
	String pattern;

	MyRegex() {
		/*
		 * ?		>> once or not at all
		 * |		>> The choice (also known as alternation or set union) operator matches either the expression before
		 * 			or the expression after the operator
		 * ()		>> The string matched within the parentheses can be recalled later
		 * []		>> Matches a single character that is contained within the brackets
		 * {m,n}	>> Matches the preceding element at least m and not more than n times.
		 */

		String IPClass = "([01]?[0-9]{0,2}|2([0-4]?[0-9]?|5[0-5]))";
		String literalPeriod = "\\.";
		pattern = IPClass + literalPeriod + IPClass + literalPeriod + IPClass + literalPeriod + IPClass;
	}
}
