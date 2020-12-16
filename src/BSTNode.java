/**
 * 
 * BSTNode.java
 * @author Radoslav Nikolov
 * @version 1.0.0
 */

public class BSTNode {

	/**
	 * Reference to a profile.
	 */
	Profile data;
	
	/**
	 * Reference to the left child.
	 */
	BSTNode l;
	
	/**
	 * Reference to the right child.
	 */
	BSTNode r;

	/**
	 * Constructs a node.
	 * 
	 * @param data Reference to the profile.
	 */
	public BSTNode(Profile data) {
		this.data = data;
	}

	/**
	 * @return The profile in the node.
	 */
	public Profile getProfile() {
		return this.data;
	}

	/**
	 * Sets the left child.
	 * 
	 * @param l
	 */
	public void setL(BSTNode l) {
		this.l = l;
	}

	/**
	 * Sets the right child.
	 * 
	 * @param r
	 */
	public void setR(BSTNode r) {
		this.r = r;
	}

	/**
	 * @return The left child of the node.
	 */
	public BSTNode getL() {
		return this.l;
	}

	/**
	 * @return The right child of the node.
	 */
	public BSTNode getR() {
		return this.r;
	}

}
