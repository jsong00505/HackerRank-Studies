package day1x.day15.linkedlist;

import java.util.Scanner;

/**
 * Created by jsong on 13/03/2017.
 * <p>
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 * <p>
 * challenge	: Day 15: Linked List
 */
class Node {
	int data;
	Node next;
	Node(int d) {
		data = d;
		next = null;
	}
}

public class Solution {

	public static  Node insert(Node head, int data) {
		// make a new node
		Node node = new Node(data);
		// save head node at temp node for return
		Node temp = head;

		if(head == null) {
			// head can be null and the new node will be a very first node
			temp = node;
		} else {
			// find a last element in linked list
			while(head.next != null) {
				head = head.next;
			}

			// insert the new node at last
			head.next = node;
		}

		return temp;
	}

	public static void display(Node head) {
		Node start = head;
		while(start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Node head = null;
		int N = sc.nextInt();

		while(N-- > 0) {
			int ele = sc.nextInt();
			head = insert(head,ele);
		}
		display(head);
		sc.close();
	}
}

