package specificstring;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
/**
 * Created by jsong on 11/03/2017.
 * <p>
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 * <p>
 * challenge	: Matching Specific String
 */
public class Solution {
	public static void main(String[] args) {
		// declare Regex_Test class
		Regex_Test tester = new Regex_Test();

		// count the number of a specific word, 'hackerrank', from a user input
		tester.checker("hackerrank");

	}
}

class Regex_Test {
	public void checker(String Regex_Pattern){
		Scanner Input = new Scanner(System.in);
		String Test_String = Input.nextLine();
		Pattern p = Pattern.compile(Regex_Pattern);
		Matcher m = p.matcher(Test_String);
		int Count = 0;
		while(m.find()){
			Count += 1;
		}
		System.out.format("Number of matches : %d",Count);
		// I'd love to close Scanner.
		Input.close();
	}
}
