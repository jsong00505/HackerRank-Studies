package strings.compare;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by jsong on 03/03/2017.
 * <p>
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 * <p>
 * challenge	: Java String Compare
 */
public class Solution {
	public static void main(String[] args) {
		try(
			Scanner in = new Scanner(System.in);
			PrintWriter out = new PrintWriter(System.out);
		) {
			// get user's input
			String word = in.nextLine();
			int k = in.nextInt();

			// validation
			if(word.length() > 1000) {
				throw new Exception("The string can't be longer than 1000");
			}

			// init maximum and minimum
			String minimum = word.substring(0, k);
			String maximum = word.substring(0, k);

			// searching minimum and maximum string in the word
			for(int i = 0; i <= word.length() - k; i++) {
				// minimum
				if(word.substring(i, i+k).compareTo(minimum) < 0) {
					minimum = word.substring(i, i+k);
				}
				// maximum
				if(word.substring(i, i+k).compareTo(maximum) > 0) {
					maximum = word.substring(i, i+k);
				}
			}

			// print
			out.println(minimum);
			out.println(maximum);
		} catch(Exception e) {

		}
	}
}
