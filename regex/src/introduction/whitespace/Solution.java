package introduction.whitespace;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by jsong on 13/03/2017.
 * <p>
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 * <p>
 * challenge	: Matching Whitespace & Non-Whitespace Character
 */
public class Solution {
	public static void main(String[] args) {
		Regex_Test tester = new Regex_Test();

		/*
		 * pattern XXxXXxXX
		 * x denotes whitespace characters, and X denotes non-white space characters.
		 * \s >> any whitespace character [ \r\n\t\f ]
		 * \S >> non-whitespace character
		 */
		tester.checker("(\\S{2}\\s){2}\\S{2}"); // Use \\ instead of using \
	}
}

class Regex_Test {
	public void checker(String Regex_Pattern){
		Scanner Input = new Scanner(System.in);
		String Test_String = Input.nextLine();
		Pattern p = Pattern.compile(Regex_Pattern);
		Matcher m = p.matcher(Test_String);
		System.out.println(m.find());

		Input.close();
	}

}
