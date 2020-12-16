/**
 * The class that tests BST class.
 * 
 * BSTMain.java
 * @author Radoslav Nikolov
 * @version 1.0.0
 */

public class BSTMain {

	public static void main(String[] args) {

		Profile profile = new Profile("Nikolov", "Radoslav", 9, 3, 1999, "Ruse", "Bulgaria", "Bulgarian",
				"rn_nikolov@abv.bg", "football, calisthetic, basketball");

		Profile profile2 = new Profile("Aleksandrov", "Andrew", 9, 5, 1999, "Ruse", "Bulgaria", "Bulgarian",
				"alexandrow@mail.bg", "programming, swimming, training(24/7)");

		Profile profile3 = new Profile("Sandoval", "Mike", 30, 8, 1967, "Ruse", "Bulgaria", "Bulgarian", "mike@abv.bg",
				"fitness, eating");

		Profile profile4 = new Profile("Nikolov", "Nikolai", 28, 8, 1969, "Ruse", "Bulgaria", "Bulgarian",
				"nr_nikolov@abv.bg", "drawing");
		
		Profile profile5 = new Profile("St. Patrick", "James", 10, 5, 1982, "New York", "USA", "American",
				"ghost@abv.bg", "working, running");
		

		BST newtree = new BST();
		newtree.insertProfile(profile);
		newtree.insertProfile(profile2);
		newtree.insertProfile(profile3);
		newtree.insertProfile(profile4);
		newtree.insertProfile(profile5);
		System.out.println("Root:");
		System.out.println(newtree.root.getProfile());
		System.out.println("The left child of the root:");
		System.out.println(newtree.root.l.getProfile());
		System.out.println("The right child of the left child of the root:");
		System.out.println(newtree.root.l.r.getProfile());
		System.out.println(newtree.root.l.r.l.getProfile());
		System.out.println(newtree.root.l.r.r.getProfile());
	}

}
