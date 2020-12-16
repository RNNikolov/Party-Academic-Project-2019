/**
 * 
 * Graph.java
 * @author Radoslav Nikolov
 * @version 1.0.0
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Graph {

	/**
	 * Reference to a binary search tree.
	 */
	private BST tree;
	
	/**
	 * Reference to a profile.
	 */
	private Profile p1;
	
	/**
	 * Reference to a profile.
	 */
	private Profile p2;

	/**
	 * Creates a graph.
	 * 
	 * @param filename The name of the file.
	 * @param tree Reference to a tree.
	 */
	public Graph(String filename, BST tree) {

		File profileFile = new File(filename);
		Scanner in = null;

		try {
			in = new Scanner(profileFile);
			in.useDelimiter(",");
		} catch (FileNotFoundException e) {
			System.out.println("Cannot open " + filename);
			System.exit(0);
		}
		this.tree = tree;

		populateFriendLists(in);
	}

	/**
	 * Method to take the data from a line of a specific file 
	 * and populate the friend lists of the profiles with the data provided from the line.
	 * 
	 * @param in The scanner of the file.
	 */
	private void populateFriendLists(Scanner in) {

		while (in.hasNextLine()) {
			Scanner newLine = new Scanner(in.nextLine());
			newLine.useDelimiter(",");

			p1 = null;
			p2 = null;

			String name1 = newLine.next();
			String name2 = newLine.next();

			traverseTree(this.tree.root, name1, name2);

			if ((p1 == null) || (p2 == null)) {
				throw new NoSuchElementException("Profile with such name doesn't exist or both profiles don't exist!");
			} else {
				p1.addFriend(p2);
				p2.addFriend(p1);
			}
			newLine.close();
		}
		in.close();
	}

	/**
	 * Traverse the tree.
	 * 
	 * @param root Starts from the root of the tree.
	 * @param name1 Name of the first profile in the line.
	 * @param name2 Name of the second profile in the line.
	 */
	private void traverseTree(BSTNode root, String name1, String name2) {
		if (root != null) {
			if (name1.equals(root.getProfile().getFullName())) {
				p1 = root.getProfile();
			}
			if (name2.equals(root.getProfile().getFullName())) {
				p2 = root.getProfile();
			}
			if (root.l != null) {
				traverseTree(root.l, name1, name2);
			}
			if (root.r != null) {
				traverseTree(root.r, name1, name2);
			}
		}
	}

	/**
	 * Recommending friends to the profiles.
	 * 
	 * @param users Array of profiles.
	 * @return An array of BST containing all friend recommendations for each user.
	 */
	public BST[] friendRecommendations(Profile[] users) {
		BST[] bstArray = new BST[100];
		BST bstTree;

		for (int i = 0; i < users.length; i++) {
			bstTree = new BST();
			if (users[i] != null) {
				for (int j = 0; j < users[i].numOfFriends(); j++) {
					for (int g = 0; g < users[i].getFriend(j).numOfFriends(); g++) {
						if (!users[i].getFriend(j).getFullName().equals(users[i].getFriend(j).getFriend(g).getFullName())) {
							if (!users[i].getFullName().equals(users[i].getFriend(j).getFriend(g).getFullName())) {
								bstTree.insertProfile(users[i].getFriend(j).getFriend(g));
							}
						}
					}
				}
				bstArray[i] = bstTree;
			} 
		}
		return bstArray;

	}

}
