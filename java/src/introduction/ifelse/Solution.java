package introduction.ifelse;

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
 * challenge	: Java If-Else
 */
public class Solution {
	public static void main(String[] args) {
		try(
			Scanner in = new Scanner(System.in);
			PrintWriter out = new PrintWriter(System.out);
		) {
			int n = in.nextInt();
			String ans = "";

			/*
			 * 1. n is odd -> Weird
			 * 2. n is even and in the inclusive range of 2 to 5 -> Not Weird
			 * 3. n is even and in the inclusive range of 6 to 20 -> Weird
			 * 4. n is even and greater than 20 -> Not Weird
			 */
			if(n % 2 == 1){
				ans = "Weird";
			}
			else{
				if(n >= 2 && n <= 5) {
					ans = "Not Weird";
				} else if(n >= 6 && n <= 20) {
					ans = "Weird";
				} else if(n > 20) {
					ans = "Not Weird";
				}
			}
			out.println(ans);
		}
	}
}
