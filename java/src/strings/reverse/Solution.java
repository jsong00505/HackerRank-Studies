package strings.reverse;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by jsong on 05/03/2017.
 * <p>
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 * <p>
 * challenge	: Java String Reverse
 */
public class Solution {
	public static void main(String[] args) {
		try (
			Scanner in = new Scanner(System.in);
			PrintWriter out = new PrintWriter(System.out);
		) {
			// get A from user
			String A = in.nextLine();
			// get a length of A
			int len = A.length();
			// initialize the answer
			String answer = "Yes";

			// validation
			if(A.length() > 50) {
				throw new Exception("A will consist at most 50 lower case english letters.");
			}


			// check only half of A's length
			for(int i = 0; i < (A.length() / 2); i++) {
				// check palindrome
				if(A.charAt(i) != A.charAt(len-i-1)) {
					// if not same, change the answer to 'No' for printing
					answer = "No";
					break;
				}
			}

			/*
			 * or using reverse method in StringBuilder class like below
			 * String R = new StringBuilder(A).reverse().toString();
			 */

			// print
			out.println(answer);
		} catch(Exception e) {

		}
	}
}
