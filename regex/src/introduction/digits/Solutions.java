package introduction.digits;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by jsong on 12/03/2017.
 * <p>
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 * <p>
 * challenge	: Matching Digits & Non-Digit Characters
 */
public class Solutions {
	public static void main(String[] args) {
		Regex_Test tester = new Regex_Test();
		/*
		 * \d >> digits
		 * \D >> none digits
		 * {n}	>> Matches the preceding element n times.
		 */
		tester.checker("(\\d{2}\\D){2}\\d{4}"); // Use \\ instead of using \
	}
}

class Regex_Test {
	public void checker(String Regex_Pattern){

		Scanner Input = new Scanner(System.in);
		String Test_String = Input.nextLine();
		Pattern p = Pattern.compile(Regex_Pattern);
		Matcher m = p.matcher(Test_String);
		System.out.println(m.find());
	}

}