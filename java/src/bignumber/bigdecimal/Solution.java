package bignumber.bigdecimal;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by jsong on 21/03/2017.
 * <p>
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 * <p>
 * challenge	: Java BigDecimal
 */
public class Solution {
	public String[] editorSolution(String[] s, int n) {
		for(int i = 0; i < n; i++){
			// current value is max
			BigDecimal max = new BigDecimal(s[i]);
			int idx = i;
			// index sorting
			for(int j = i + 1; j < n; j++)
			{
				BigDecimal curr = new BigDecimal(s[j]);
				if(curr.compareTo(max) == 1){
					max=curr;
					idx=j;
				}
			}
			String temp = s[i];
			s[i] = s[idx];
			s[idx] = temp;
		}

		return s;
	}
	public static void main(String[] args) {
		//Input
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		String []s=new String[n+2];
		for(int i=0;i<n;i++){
			s[i]=sc.next();
		}
		sc.close();

		// init BigDecimal array
		BigDecimal[] bd = new BigDecimal[n];
		HashMap<String, Boolean> checkMap = new HashMap<>();
		// constraints and assign the strings in BigDecimall array
		assert(n >= 1 && n <= 200);
		for(int i = 0; i < n; i++){
			assert(s[i].length() <= 300);

			// init HashMap
			checkMap.put(s[i], false);

			// set variables
			bd[i] = new BigDecimal(s[i]);
		}

		// sorting using Arrays
		Arrays.sort(bd, Collections.reverseOrder());

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(bd[i].toString().equals(new BigDecimal(s[j]).toString()) && !checkMap.get(s[j])) {
					// swap
					s[n] = s[i];
					s[i] = s[j];
					s[j] = s[n];

					// check flags
					checkMap.put(s[i], true);

					// optimize
					break;
				}
			}
		}

		//Output
		for(int i=0;i<n;i++)
		{
			System.out.println(s[i]);
		}
	}
}
