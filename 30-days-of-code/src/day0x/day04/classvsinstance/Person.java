package day0x.day04.classvsinstance;

import java.util.Scanner;

/**
 * Created by jsong on 03/03/2017.
 * <p>
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 * <p>
 * challenge	: Day 4: Class vs. Instance
 */
public class Person {
	private int age;

	public Person(int initialAge) {
		// Add some more code to run some checks on initialAge
		age = initialAge;
		if(age < 0) {
			System.out.println("Age is not valid, setting age to 0.");
			age = 0;
		}
	}

	public void amIOld() {
		// Write code determining if this person's age is old and print the correct statement:
		String ans = "";
		if(age < 13) {
			ans = "You are young.";
		} else if(age >= 13 && age < 18) {
			ans = "You are a teenager.";
		} else {
			ans = "You are old.";
		}
		System.out.println(ans);
	}

	public void yearPasses() {
		// Increment this person's age.
		age++;
	}

	// this part is inside problem
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
		}
		sc.close();
	}
}
