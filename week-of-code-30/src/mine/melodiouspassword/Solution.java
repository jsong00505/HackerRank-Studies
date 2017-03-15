package mine.melodiouspassword;

import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by jsong on 15/03/2017.
 * <p>
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 * <p>
 * challenge	: Melodious password
 */
public class Solution {
	public static void main(String[] args) {
		try(
			Scanner in = new Scanner(System.in);
			PrintWriter out = new PrintWriter(System.out);
		) {
			// get user input
			int n = in.nextInt();

			// validation
			if(n < 1 || n > 6) {
				throw new Exception("n is out of range.");
			}

			// declare consonants and vowels
			char[] consonants	= {'b', 'c', 'd', 'f', 'g',
					'h', 'j', 'k', 'l', 'm',
					'n', 'p', 'q', 'r', 's',
					't', 'v', 'w', 'x', 'z'};

			char[] vowels		= {'a', 'e', 'i', 'o', 'u'};

			// brute-force
			for(char c1: consonants) {
				StringBuilder tempC1 = new StringBuilder();
				tempC1.append(c1);
				for(char v1: vowels) {
					StringBuilder tempV1 = new StringBuilder(tempC1);
					tempV1.append(v1);
					for(char c2: consonants) {
						StringBuilder tempC2 = new StringBuilder(tempV1);
						tempC2.append(c2);
						for(char v2: vowels) {
							StringBuilder tempV2 = new StringBuilder(tempC2);
							tempV2.append(v2);
							for(char c3: consonants) {
								StringBuilder tempC3 = new StringBuilder(tempV2);
								tempC3.append(c3);
								for(char v3: vowels) {
									StringBuilder tempV3 = new StringBuilder(tempC3);
									tempV3.append(v3);
									if(n == 6) {
										out.println(tempV3);
									}
								}
								if(n == 5) {
									out.println(tempC3);
								}
							}
							if(n == 4) {
								out.println(tempV2);
							}
						}
						if(n == 3) {
							out.println(tempC2);
						}
					}
					if(n == 2) {
						out.println(tempV1);
					}
				}
				if(n == 1) {
					out.println(tempC1);
				}
			}
			for(char v1: vowels) {
				StringBuilder tempV1 = new StringBuilder();
				tempV1.append(v1);
				for(char c1: consonants) {
					StringBuilder tempC1 = new StringBuilder(tempV1);
					tempC1.append(c1);
					for(char v2: vowels) {
						StringBuilder tempV2 = new StringBuilder(tempC1);
						tempV2.append(v2);
						for(char c2: consonants) {
							StringBuilder tempC2 = new StringBuilder(tempV2);
							tempC2.append(c2);
							for(char v3: vowels) {
								StringBuilder tempV3 = new StringBuilder(tempC2);
								tempV3.append(v3);
								for(char c3: consonants) {
									StringBuilder tempC3 = new StringBuilder(tempV3);
									tempC3.append(c3);
									if(n == 6) {
										out.println(tempC3);
									}
								}
								if(n == 5) {
									out.println(tempV3);
								}
							}
							if(n == 4) {
								out.println(tempC2);
							}
						}
						if(n == 3) {
							out.println(tempV2);
						}
					}
					if(n == 2) {
						out.println(tempC1);
					}
				}
				if(n == 1) {
					out.println(tempV1);
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
