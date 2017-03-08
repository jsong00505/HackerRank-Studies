package day0x.day08.dictsandmaps;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by jsong on 08/03/2017.
 * <p>
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 * <p>
 * challenge	: Day 8: Dictionaries and Maps
 */
public class Solution {
	public static void main(String []argh){
		try(
			Scanner in = new Scanner(System.in);
			PrintWriter out = new PrintWriter(System.out);
		) {
			int n = in.nextInt();

			// constraints
			if(n < 1 || n > Math.pow(10, 5)) {
				throw new Exception("n is out of range.");
			}

			// declare HashMap
			HashMap<String, String> phoneBook = new HashMap<>();
			for(int i = 0; i < n; i++){
				String name = in.next();
				int phone = in.nextInt();

				// put key, value in HashMap
				phoneBook.put(name, Integer.toString(phone));
			}
			while(in.hasNext()){
				String s = in.next();

				// constraints
				if(s.length() < 1 || s.length() > Math.pow(10, 5)) {
					throw new Exception("length of 's' is out of range.");
				}

				// check and print
				if(phoneBook.containsKey(s)) {
					out.println(s + "=" + phoneBook.get(s));
				} else {
					out.println("Not found");
				}
			}
		} catch(Exception e) {

		}

	}
}
