package day1x.day13.abstractclass;

import java.util.Scanner;

/**
 * Created by jsong on 12/03/2017.
 * <p>
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 * <p>
 * challenge	: Day 13: Abstract Classes
 */
abstract class Book {
	String title;
	String author;

	Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	abstract void display();
}

//Write MyBook Class
class MyBook extends Book {

	// Declare the price instance variable
	int price;

	/**
	 *   Class Constructor
	 *
	 *   @param title The book's title.
	 *   @param author The book's author.
	 *   @param price The book's price.
	 **/
	public MyBook(String title, String author, int price) {
		// TODO Auto-generated constructor stub
		super(title, author);
		this.price = price;
	}

	/**
	 *   Method Name: display
	 *
	 *   Print the title, author, and price in the specified format.
	 **/
	@Override
	void display() {
		// TODO Auto-generated method stub
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Price: " + price);
	}
}

public class Solution {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String title = scanner.nextLine();
		String author = scanner.nextLine();
		int price = scanner.nextInt();
		scanner.close();

		Book book = new MyBook(title, author, price);
		book.display();
	}
}
