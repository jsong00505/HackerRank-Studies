package mine.bigsorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
 * Created by jsong on 01/03/2017.
 *
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 *
 * challenge	: Week of Code 29 - Big Sorting(13.60/20)
 */
public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] unsorted = new String[n];
		for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
			unsorted[unsorted_i] = in.next();
		}

		// your code goes here

		// sorting by using Array class
		Arrays.sort(unsorted, new BigSortingComparator());


		// print sorted array
		for(String s: unsorted) {
			System.out.println(s);
		}

		// close
		in.close();

	}

	static class BigSortingComparator implements Comparator<String> {
		public int compare(String left, String right) {
			if(left.length() != right.length()) {
				return left.length() - right.length();
			} else {
				return left.compareTo(right);
			}

		}
	}
}
