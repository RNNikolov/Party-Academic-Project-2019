/**
 * The class is printing a binary search tree in an alphabetical order.
 * 
 * AlphaMain.java
 * @author Radoslav Nikolov
 * @version 1.0.0
 */

import java.util.Scanner;

public class AlphaMain {

	/**
	 * Reference to a tree.
	 */
	private static BST tree;
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a profile file to open:");
		String filename = input.next();
		tree = FileReader.readProfileSet(filename);
		tree.printAlphabetical(tree.root);
		input.close();

	}
	
}
