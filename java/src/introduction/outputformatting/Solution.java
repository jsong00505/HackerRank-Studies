package introduction.outputformatting;

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
 * challenge	: Java Output Formatting
 */
public class Solution {
	public static void main(String[] args) {
		try(
			Scanner in = new Scanner(System.in);
			PrintWriter out = new PrintWriter(System.out);
		) {
			out.println("================================");
			for(int i = 0; i < 3; i++){
				String s1 = in.next();
				int x = in.nextInt();
				//Complete this line

				// get s1's length for iterating
				int lenS1 = s1.length();

				// print s1 first
				out.print(s1);

				// fill white space to the rest of s1
				for(int j = 0; j < 15 - lenS1; j++ ) {
					out.print(" ");
				}

				// fill 0 to the rest of x then print
				String strX = x < 10? "00" + x : (x < 100? "0" + x : Integer.toString(x));
				out.println(strX);

				// TODO: this is the editorial solution
				// out.printf( "%-15s%03d %n", s1, x);
			}
			out.println("================================");
		} catch (Exception e) {

		}

	}
}
