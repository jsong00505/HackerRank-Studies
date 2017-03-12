package day1x.day12.inheritance;

import java.util.Scanner;

/**
 * Created by jsong on 12/03/2017.
 * <p>
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 * <p>
 * challenge	: Day 12: Inheritance
 */
class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;

	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}

	// Print person data
	public void printPerson(){
		System.out.println(
				"Name: " + lastName + ", " + firstName
						+ 	"\nID: " + idNumber);
	}

}

class Student extends Person{
	private int[] testScores;

	/*
    *   Class Constructor
    *
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
	Student(String firstName, String lastName, int identification, int[] testScores) {
		// use super class
		super(firstName, lastName, identification);
		// TODO Auto-generated constructor stub
		this.testScores = testScores;
	}

	/*
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
	public String calculate() {
		// init
		int ave;
		int sum = 0;
		String grade;

		// sum all scores
		for(int i = 0; i < testScores.length; i++) {
			sum += testScores[i];
		}

		// get an average score
		ave = sum / testScores.length;

		// denote the grade
		if(ave >= 90) {
			grade = "O";
		} else if(ave >= 80 && ave < 90) {
			grade = "E";
		} else if(ave >= 70 && ave < 80) {
			grade = "A";
		} else if(ave >= 55 && ave < 70) {
			grade = "P";
		} else if(ave >= 40 && ave < 55) {
			grade = "D";
		} else {
			grade = "T";
		}

		return grade;
	}
}

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();

		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate());
	}
}