/**
 * The class that tests BSTNode class.
 * 
 * BSTNodeMain.java
 * @author Radoslav Nikolov
 * @version 1.0.0
 */

public class BSTNodeMain {

	public static void main(String[] args) {
		Profile profile = new Profile("Nikolov", "Radoslav", 9, 3, 1999, "Ruse", "Bulgaria", "Bulgarian",
				"rn_nikolov@abv.bg", "football, calisthetic, basketball");
		
		Profile profile2 = new Profile("Aleksandrov", "Andrew", 9, 5, 1999, "Ruse", "Bulgaria", "Bulgarian",
				"alexandrow@mail.bg", "programming, swimming, training(24/7)");
		
		Profile profile3 = new Profile("Nikolov", "Nikolai", 28, 8, 1969, "Ruse", "Bulgaria", "Bulgarian",
				"nr_nikolov@abv.bg", "drawing");
		
		
		BSTNode tree = new BSTNode(profile);
		BSTNode tree2 = new BSTNode(profile2);
		BSTNode tree3 = new BSTNode(profile3);
		tree.setL(tree2);
		tree.setR(tree3);
		
		
		System.out.println(tree.getProfile());
		System.out.println(tree2.getProfile());
		System.out.println(tree3.getProfile());
		System.out.println(tree.getL());
		System.out.println(tree.getR());
		
		

	}

}
