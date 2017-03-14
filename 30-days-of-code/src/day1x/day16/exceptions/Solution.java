package day1x.day16.exceptions;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by jsong on 14/03/2017.
 * <p>
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 * <p>
 * challenge	: Day 16: Exceptions - String to Integer
 */
public class Solution {
	public static void main(String[] args) {
		try(
			Scanner in = new Scanner(System.in);
			PrintWriter out = new PrintWriter(System.out);
		) {
			// get string from user input
			String S = in.next();

			/*
			 * parsing
			 * if S is not integer, go to exception
			 */
			int i = Integer.parseInt(S);

			// print parsed variable
			out.println(i);
		} catch(Exception e) {
			System.out.println("Bad String");
		}
	}
}
