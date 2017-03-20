package day2x.day21.generics;

import java.util.Scanner;

/**
 * Created by jsong on 20/03/2017.
 * <p>
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 * <p>
 * challenge	: Day 21: Generics
 */
class Printer <T> {
	/**
	 * Method Name: printArray
	 * Print each element of the generic array on a new line. Do not return anything.
	 * @param array
	 **/
	void printArray(T[] array) {
		for(T element: array) {
			System.out.println(element);
		}
	}
}
public class Solution {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		Integer[] intArray = new Integer[n];
		for (int i = 0; i < n; i++) {
			intArray[i] = scanner.nextInt();
		}

		n = scanner.nextInt();
		String[] stringArray = new String[n];
		for (int i = 0; i < n; i++) {
			stringArray[i] = scanner.next();
		}

		Printer<Integer> intPrinter = new Printer<Integer>();
		Printer<String> stringPrinter = new Printer<String>();
		intPrinter.printArray( intArray  );
		stringPrinter.printArray( stringArray );
		if(Printer.class.getDeclaredMethods().length > 1){
			System.out.println("The Printer class should only have 1 method named printArray.");
		}
	}
}
