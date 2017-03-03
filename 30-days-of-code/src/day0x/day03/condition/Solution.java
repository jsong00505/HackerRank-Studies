package day0x.day03.condition;

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
 * challenge	: Day 3: Intro to Conditional Statements
 */
public class Solution {
	public static void main(String[] args) {
		try(
			Scanner in = new Scanner(System.in);
			PrintWriter out = new PrintWriter(System.out);
		) {
			int n = in.nextInt();
			in.close();
			String ans="";

			// if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
			if(n % 2 == 1) {
				ans = "Weird";
			}
			else if(n > 1 && n <= 5) {
				// if 'n' is between 2 and 5
				ans = "Not Weird";
			}
			else if(n > 5 && n <= 20) {
				// if 'n' is between 6 and 20
				ans = "Weird";
			}
			else if(n > 20) {
				// if 'n' is greater than 20
				ans = "Not Weird";
			}
			else{
				throw new Exception("Out of Range");
			}

			System.out.println(ans);
		} catch(Exception e) {

		}
	}
}
