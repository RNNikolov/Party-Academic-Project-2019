
/**
 * The class that tests FileReader class.
 * 
 * FileReaderMain.java
 * @author Radoslav Nikolov
 * @version 1.0.0
 */

import java.util.Scanner;

public class FileReaderMain {

	/**
	 * Reference to a tree.
	 */
	private static BST binarySearchTree;

	public static void printTree() {
		printTreeRec(binarySearchTree.root);
	}

	/**
	 * Traverse the tree and printing each node in the tree.
	 * 
	 * @param root Starts from the root of the tree.
	 */
	private static void printTreeRec(BSTNode root) {
		if (root != null) {
			System.out.println(root.getProfile());
			if (root.l != null) {
			printTreeRec(root.l);
			}
			if (root.r != null) {
			printTreeRec(root.r);
			}
		}
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a profile file to open:");
		String filename = input.next();
		binarySearchTree = FileReader.readProfileSet(filename);
		printTree();
		input.close();
	}

}
