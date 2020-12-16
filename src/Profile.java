/**
 * 
 * Profile.java
 * @author Radoslav Nikolov
 * @version 1.0.0
 */

import java.util.ArrayList;

public class Profile {

	/**
	 * The last name of the profile.
	 */
	private String lastName;

	/**
	 * The first name of the profile.
	 */
	private String firstName;

	/**
	 * The day the person is born.
	 */
	private int day;

	/**
	 * The month the person is born.
	 */
	private int month;

	/**
	 * The year the person is born.
	 */
	private int year;

	/**
	 * The town of residence of the profile.
	 */
	private String townOfResidence;

	/**
	 * The country of residence of the profile.
	 */
	private String countryOfResidence;

	/**
	 * The nationality of the profile.
	 */
	private String nationality;

	/**
	 * The email address of the profile.
	 */
	private String emailAddress;

	/**
	 * The interests of the profile.
	 */
	private String[] interests = new String[100];

	/**
	 * The friends of the profile.
	 */
	private ArrayList<Profile> friends = new ArrayList<>();

	/**
	 * Counter for the number of interests of the profile.
	 */
	private int count = 0;

	/**
	 * Creates a profile object.
	 * 
	 * @param lastName Profile's last name.
	 * @param firstName Profile's first name.
	 * @param day Day of birth.
	 * @param month Month of birth.
	 * @param year Year of birth.
	 * @param townOfResidence Town of residence of the profile.
	 * @param countryOfResidence Country of residence of the profile.
	 * @param nationality Profile's nationality.
	 * @param emailAddress Profile's email address.
	 * @param interest  Profile's interests.
	 */
	public Profile(String lastName, String firstName, int day, int month, int year, String townOfResidence,
			String countryOfResidence, String nationality, String emailAddress, String interest) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.day = day;
		this.month = month;
		this.year = year;
		this.townOfResidence = townOfResidence;
		this.countryOfResidence = countryOfResidence;
		this.nationality = nationality;
		this.emailAddress = emailAddress;
		this.interests[count] = interest;
		count++;

	}

	/**
	 * Set the town of residence.
	 * 
	 * @param townOfResidence
	 */
	public void setTown(String townOfResidence) {
		this.townOfResidence = townOfResidence;
	}

	/**
	 * Set the country of residence.
	 * 
	 * @param countryOfResidence
	 */
	public void setCountry(String countryOfResidence) {
		this.countryOfResidence = countryOfResidence;
	}

	/**
	 * Set the nationality.
	 * 
	 * @param nationality
	 */
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	/**
	 * Set the email address.
	 * 
	 * @param emailAddress
	 */
	public void setEmail(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	/**
	 * Set the interests. 
	 * 
	 * @param interest
	 */
	public void setInterests(String interest) {
		this.interests[count] = interest;
	}

	/**
	 * @return The town of residence of the profile.
	 */
	public String getTown() {
		return this.townOfResidence;
	}

	/**
	 * @return The country of residence of the profile.
	 */
	public String getCountry() {
		return this.countryOfResidence;
	}

	/**
	 * @return The nationality of the profile.
	 */
	public String getNationality() {
		return this.nationality;
	}
	
	/**
	 * @return The email address of the profile.
	 */
	public String getEmail() {
		return this.emailAddress;
	}

	/**
	 * @return The interests of the profile.
	 */
	public String getInterests() {
		return this.interests[count - 1];
	}

	/**
	 * @return The birthday of the profile.
	 */
	public String getDateOfBirth() {
		return this.day + "/" + this.month + "/" + this.year;
	}

	/**
	 * @return The full name of the profile.
	 */
	public String getFullName() {
		return this.firstName + " " + this.lastName;
	}

	/**
	 * Adds a friend to the profile's friend list.
	 * 
	 * @param p
	 */
	public void addFriend(Profile p) {
		this.friends.add(p);
	}

	/**
	 * Gets friend i from the profile's friend list.
	 *
	 * @param i
	 * @return The friend of the profile.
	 */
	public Profile getFriend(int i) {
		return this.friends.get(i);
	}

	/**
	 * @return The size of the profile's friend list.
	 */
	public int numOfFriends() {
		return this.friends.size();
	}

	/**
	 * The method returns a string suitable for printing.
	 * 
	 * @return string to print out the profile.
	 */
	public String toString() {
		String result = "";
		result += "The profile's name is: " + getFullName() + "\n";
		result += "The date of birth is: " + getDateOfBirth() + "\n";
		result += "The location is: " + getTown() + ", " + getCountry() + "\n";
		result += "The nationality for the profile is: " + getNationality() + "\n";
		result += "The e-mail address is: " + getEmail() + "\n";
		result += "He/She is interested in: " + getInterests() + "\n";
		result += "The profile has " + numOfFriends() + " friends." + "\n";
		return result;
	}
}
