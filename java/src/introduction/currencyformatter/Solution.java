package introduction.currencyformatter;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by jsong on 07/03/2017.
 * <p>
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 * <p>
 * challenge	: Java Currency Formatter
 */
public class Solution {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();

		// use NumberFormat class by built-in Locale
		String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
		String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
		String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

		// India does not have a built-in Locale
		String india = NumberFormat.getCurrencyInstance(new Locale("en","in")).format(payment);

		System.out.println("US: " + us);
		System.out.println("India: " + india);
		System.out.println("China: " + china);
		System.out.println("France: " + france);
	}
}
