package strings.anagrams;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by jsong on 06/03/2017.
 * <p>
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 * <p>
 * challenge	: Java Anagrams
 */
public class Solution {
	static boolean isAnagram(String a, String b) {
		// validation
		if(a.length() > 50 || b.length() > 50 || a.length() != b.length()) {
			return false;
		}

		// declare HashMap for checking a and b can call anagram
		HashMap<Character, Integer> aHashMap = new HashMap<>();
		HashMap<Character, Integer> bHashMap = new HashMap<>();

		// iterating
		for(int i = 0; i < a.length(); i++) {
			// set characters to upper case
			char upperA = Character.toUpperCase(a.charAt(i));
			char upperB = Character.toUpperCase(b.charAt(i));

			// count a's characters
			if(aHashMap.containsKey(upperA)) {
				aHashMap.put(upperA, aHashMap.get(upperA) + 1);
			} else {
				aHashMap.put(upperA, 1);
			}
			// count b's characters
			if(bHashMap.containsKey(upperB)) {
				bHashMap.put(upperB, bHashMap.get(upperB) + 1);
			} else {
				bHashMap.put(upperB, 1);
			}
		}

		for(char c: aHashMap.keySet()) {
			// check if the number of a's character is not the same b's
			if(aHashMap.get(c) != bHashMap.get(c)) {
				return false;
			}
		}

		// if nothing happened, return true
		return true;
	}

	// Problem Setter's code
	public static boolean isAnagram2(String firstWord, String secondWord) {
		// make arrays from first word and second word
		char[] word1 = firstWord.toLowerCase().replaceAll("[\\s]", "").toCharArray();
		char[] word2 = secondWord.toLowerCase().replaceAll("[\\s]", "").toCharArray();

		// sort the arrays
		Arrays.sort(word1);
		Arrays.sort(word2);

		// return the arrays are matched
		return Arrays.equals(word1, word2);
	}

	public static boolean isAnagram3(String s1, String s2) {
		// if s1's length is not the same with s2's. just return false first(validation)
		if (s1.length() != s2.length()) {
			return false;
		}

		// make and sort arrays
		char[] a = s1.toLowerCase().toCharArray();
		char[] b = s2.toLowerCase().toCharArray();
		boolean anagram = true;
		Arrays.sort(a);
		Arrays.sort(b);

		// compare two arrays and if those are not matched change the anagram value to false
		for(int i = 0; i < a.length; i++) {
			if(a[i] != b[i]) {
				anagram = false;
			}
		}

		// return
		return anagram;
	}

	// This is in the challenge
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String a = scan.next();
		String b = scan.next();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}
}
