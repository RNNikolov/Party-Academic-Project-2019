/**
 * The class that tests Graph class.
 * 
 * GraphMain.java
 * @author Radoslav Nikolov
 * @version 1.0.0
 */

import java.util.Scanner;

public class GraphMain {

	private static BST tree;

	private static Profile[] users = new Profile[100];

	private static int i = -1;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a profile file to open:");
		String filename = input.next();
		tree = FileReader.readProfileSet(filename);

		Scanner input2 = new Scanner(System.in);
		System.out.println("Please enter friends file to open:");
		String filename2 = input2.next();

		Graph graph = new Graph(filename2, tree);

		arrayOfProfiles(tree.root);
		BST[] bstArray = graph.friendRecommendations(users);
		
		for (int j = 0; j < bstArray.length; j++) {
			if (bstArray[j] != null) {
				System.out.println("Profile: " + users[j].getFullName());
				System.out.println("Friend Recommendations:");
				bstArray[j].printAlphabetical(bstArray[j].root);
			} 
		}
		input.close();

	}

	/**
	 * Traverse the tree and populate the array of profiles.
	 * 
	 * @param root Starts from the root of the tree.
	 */
	public static void arrayOfProfiles(BSTNode root) {
		i++;
		users[i] = root.getProfile();
		if (root != null) {
			if (root.l != null) {
				arrayOfProfiles(root.l);
			}
			if (root.r != null) {
				arrayOfProfiles(root.r);
			}
		}
	}

}
