package day2x.day23.bstlevelordertraversal;

import java.util.*;

/**
 * Created by jsong on 23/03/2017.
 * <p>
 * hackerrank	: https://www.hackerrank.com/jsong00505
 * github		: https://github.com/jsong00505
 * linkedin		: https://www.linkedin.com/in/junesongskorea/
 * email		: jsong00505@gmail.com
 * <p>
 * challenge	: Day 23: BST Level-Order Traversal
 */
class Node {
	Node left, right;
	int data;

	Node(int data) {
		this.data = data;
		left = right = null;
	}
}

public class Solution {
	/**
	 * Method Name: depthFirstSearch
	 *
	 * @param root
	 **/
	static void depthFirstSearch(Node root) {
		if (root != null) {
			System.out.print(root.data + " ");
			depthFirstSearch(root.left);
			depthFirstSearch(root.right);
		}
	}

	/**
	 * Method Name: levelOrder(as know as Breadth-First Search)
	 *
	 * @param root
	 */
	static void levelOrder(Node root) {
		Queue<Node> queue = new LinkedList<>();

		// validation
		if (root != null) {
			queue.add(root);
		}

		// do BFS
		while (!queue.isEmpty()) {
			// pop
			Node temp = queue.remove();

			System.out.print(temp.data + " ");

			// check if the temp node has children
			if (temp.left != null && temp.right != null) {
				queue.add(temp.left);
				queue.add(temp.right);
			} else if (temp.left != null) {
				queue.add(temp.left);
			} else if (temp.right != null) {
				queue.add(temp.right);
			}
		}
	}

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		levelOrder(root);

		sc.close();
	}
}
