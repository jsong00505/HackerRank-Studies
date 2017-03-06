package introduction.staticinitblock;

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
 * challenge	: Java Static Initializer Block
 */
public class Solution {
	// declare B, H and flag
	public static int B;
	public static int H;
	public static boolean flag;

	static  {
		try (
			Scanner in = new Scanner(System.in);
			PrintWriter out = new PrintWriter(System.out);
		) {
			// get breadth and height
			B = in.nextInt();
			H = in.nextInt();

			// check if breadth and height are positive
			flag = B < 1 || H < 1? false : true;

			// if not, print Exception
			if(!flag) {
				out.println("java.lang.Exception: Breadth and height must be positive");
			}// end of if
		} catch(Exception e) {

		}// end of try-catch
	}// end of static

	public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}

	}// end of main
}// end of class
