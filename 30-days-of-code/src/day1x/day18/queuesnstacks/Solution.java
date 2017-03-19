package day1x.day18.queuesnstacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by jsong on 19/03/2017.
 * <p>
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 * <p>
 * challenge	: Day 18: Queues and Stacks
 */
public class Solution {

	// Write your code here.
	List<Character> stack = new ArrayList<>();
	List<Character> queue = new ArrayList<>();

	/**
	 *   Method Name: pushCharacter
	 *
	 *   push
	 **/
	void pushCharacter(char ch) {
		stack.add(ch);
	}

	/**
	 *   Method Name: enqueueCharacter
	 *
	 *   enqueue
	 **/
	void enqueueCharacter(char ch) {
		queue.add(ch);
	}

	/**
	 *   Method Name: popCharacter
	 *
	 *   pop
	 **/
	char popCharacter() {
		int size = stack.size();
		char res = stack.remove(size-1);

		return res;
	}

	/**
	 *   Method Name: dequeueCharacter
	 *
	 *   dequeue
	 **/
	char dequeueCharacter() {
		char res = queue.remove(0);

		return res;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		scan.close();

		// Convert input String to an array of characters:
		char[] s = input.toCharArray();

		// Create a Solution object:
		Solution p = new Solution();

		// Enqueue/Push all chars to their respective data structures:
		for (char c : s) {
			p.pushCharacter(c);
			p.enqueueCharacter(c);
		}

		// Pop/Dequeue the chars at the head of both data structures and compare them:
		boolean isPalindrome = true;
		for (int i = 0; i < s.length/2; i++) {
			if (p.popCharacter() != p.dequeueCharacter()) {
				isPalindrome = false;
				break;
			}
		}

		//Finally, print whether string s is palindrome or not.
		System.out.println( "The word, " + input + ", is "
				+ ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
	}
}
