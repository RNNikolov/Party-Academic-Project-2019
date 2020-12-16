/**
 * 
 * BST.java
 * @author Radoslav Nikolov
 * @version 1.0.0
 */

public class BST {

	/**
	 * The root of the tree.
	 */
	BSTNode root;

	/**
	 * Insert a profile p in the tree in the right order.
	 * 
	 * @param p The profile that should be inserted.
	 */
	public void insertProfile(Profile p) {
		BSTNode node = new BSTNode(p);

		if (this.root == null) {
			this.root = node;
		} else {
			recursiveMethod(this.root, node);
		}
	}

	/**
	 * Traverse the tree.
	 * 
	 * @param root Starts from the root of the tree.
	 * @param node The profile we insert into the tree.
	 */
	private void recursiveMethod(BSTNode root, BSTNode node) {

		if ((node.getProfile().getFullName().charAt(0)) <= (root.getProfile().getFullName().charAt(0))) {
			if (root.getL() == null) {
				root.setL(node);
			} else {
				recursiveMethod(root.getL(), node);
			}
		} else if ((node.getProfile().getFullName().charAt(0)) > (root.getProfile().getFullName().charAt(0))) {
			if (root.getR() == null) {
				root.setR(node);
			} else {
				recursiveMethod(root.getR(), node);
			}
		}
	}
	
	/**
	 * In-order traversal of the tree.
	 * 
	 * @param root Starts from the root of the tree.
	 */
	public void printAlphabetical(BSTNode root) {
		if(root != null) {
			if (root.l != null) {
			printAlphabetical(root.l);
			}
			System.out.println(root.getProfile());
			if (root.r != null) {
			printAlphabetical(root.r);
			}
		}
	}

}
