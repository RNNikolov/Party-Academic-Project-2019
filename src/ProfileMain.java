/**
 * The class that tests Profile class.
 * 
 * ProfileMain.java
 * @author Radoslav Nikolov
 * @version 1.0.0
 */

public class ProfileMain {

	public static void main(String[] args) {
		Profile profile = new Profile("Nikolov", "Radoslav", 9, 3, 1999, "Ruse", "Bulgaria", "Bulgarian",
				"rn_nikolov@abv.bg", "football, calisthetic, basketball");

		Profile profile2 = new Profile("Aleksandrov", "Andrew", 9, 5, 1999, "Ruse", "Bulgaria", "Bulgarian",
				"alexandrow@mail.bg", "programming, swimming, training(24/7)");
		
		profile.addFriend(profile2);
		
		System.out.println(profile.getFriend(0));
		System.out.println(profile.toString());
        System.out.println(profile2.toString());
        
	}

}
