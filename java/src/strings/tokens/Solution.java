package strings.tokens;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by jsong on 07/03/2017.
 * <p>
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 * <p>
 * challenge	: Java String Tokens
 */
public class Solution {
	public static void main(String[] args) {
		try(
			Scanner in = new Scanner(System.in);
			PrintWriter out = new PrintWriter(System.out);
		) {
			// get a sentence
			String s = in.nextLine();

			// constraints
			if(s.length() < 1 || s.length() > 4 * Math.pow(10, 5)) {
				throw new Exception("String s is too long or too short");
			}

			// trim the sentence
			s = s.trim();

			// split the string into tokens
			// another regex: "^\\p{Alpha}]+"
			String[] tokens = s.split("[ !,?._\'@ ]+");

			// get the size of tokens
			int size = (s.trim().length() == 0) ? 0 : tokens.length;
			out.println(size);

			// print all tokens in order
			for(String token: tokens) {
				out.println(token);
			}
		} catch(Exception e) {

		}
	}
}
