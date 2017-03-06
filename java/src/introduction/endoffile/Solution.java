package introduction.endoffile;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by jsong on 06/03/2017.
 * <p>
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 * <p>
 * challenge	: Java End-of-file
 */
public class Solution {
	public static void main(String[] args) {
		try (
			Scanner in = new Scanner(System.in);
			PrintWriter out = new PrintWriter(System.out);
		) {
			// count lines
			int count = 1;

			// print line till end-of-file
			while(in.hasNext()) {
				out.println((count++) + " " + in.nextLine());
			}
		} catch(Exception e) {

		}
	}
}
