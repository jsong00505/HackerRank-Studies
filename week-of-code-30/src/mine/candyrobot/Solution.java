package mine.candyrobot;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by jsong on 13/03/2017.
 * <p>
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 * <p>
 * challenge	: Candy Replenishing Robot
 */
public class Solution {
	public static void main(String[] args) {
		try(
			Scanner in = new Scanner(System.in);
			PrintWriter out = new PrintWriter(System.out);
		) {
			int n = in.nextInt();
			int t = in.nextInt();
			int[] c = new int[t];

			// validation
			if(n < 5 || n > 100) {
				throw new Exception("n is out of range.");
			} else if(t < 1 || t > 100) {
				throw new Exception("t is out of range.");
			}

			for(int i = 0; i < t; i++){
				c[i] = in.nextInt();

				// validation
				if(c[i] < 1 || c[i] > n) {
					throw new Exception("c[i] is out of range.");
				}
			}

			// declare remained candies in the bowl at begin
			int remainedCandies = n;
			int totalNewCandies = 0;
			for(int i = 0; i < t; i++) {
				remainedCandies -= c[i];

				// validation
				if(remainedCandies < 0) {
					throw new Exception("remained candies can't be under zero.");
				}
				/*
				 * if the party is not ending
				 * and remained candies is smaller than 5,
				 * Bob will refill the bowl.
				 */
				if(remainedCandies < 5 && i != (t - 1)) {
					// count of refill candies
					totalNewCandies += n - remainedCandies;
					// refill the bowl
					remainedCandies = n;
				}
			}

			// print
			out.print(totalNewCandies);

		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
