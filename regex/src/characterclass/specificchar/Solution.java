package characterclass.specificchar;

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
 * challenge	: Matching Specific Characters
 */
public class Solution {
	public static void main(String[] args) {
		Regex_Test tester = new Regex_Test();
		/*
		 * []	>> matches only one out of several characters placed inside the square brackets
		 * ^	>> matches the position at the start of a string
		 * $	>> matches the position at the end of a string
		 */
		tester.checker("^[123][120][xs0][30Aa][xsu][.,]$"); // Use \\ instead of using \
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

