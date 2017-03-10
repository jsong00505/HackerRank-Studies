package strings.syntaxchecker;

import java.io.PrintWriter;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Created by jsong on 08/03/2017.
 * <p>
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 * <p>
 * challenge	: Java Pattern Syntax Checker
 */
public class Solution {
	public static void main(String[] main) {
		try(
			Scanner in = new Scanner(System.in);
			PrintWriter out = new PrintWriter(System.out);
		) {
			// get the number of test cases
			int testCases = Integer.parseInt(in.nextLine());

			// iterate for the number
			while(testCases > 0){
				String pattern = in.nextLine();
				testCases--;
				//Write your code
				try {
					// compile the pattern
					Pattern.compile(pattern);
					out.println("Valid");
				} catch(Exception e) {
					// exception
					out.println("Invalid");
				}// end of try-catch
			}// end of while
		} catch(Exception e) {

		}// end of try-catch
	}// end of main class
}
