package introduction.stdinout1;

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
 * challenge	: Java Stdin and Stdout I
 */
public class Solution {
	public static void main(String[] args) {
		try(
			Scanner in = new Scanner(System.in);
			PrintWriter out = new PrintWriter(System.out);
		) {
			// just loop three times to print all out
			for(int i = 0; i < 3; i++) {
				int a = in.nextInt();
				out.println(a);
			}
		} catch(Exception e) {

		}
	}
}
