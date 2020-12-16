/**
 * 
 * FileReader.java
 * @author Radoslav Nikolov
 * @version 1.0.0
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

	/**
	 * Reads the data file used by the program and returns the constructed tree.
	 * 
	 * @param in The scanner of the file.
	 * @return The tree represented by the data file.
	 */
	private static BST readProfileSet(Scanner in) {

		BST profilesTree = new BST();
		
		while (in.hasNextLine()) {
			
			Scanner newLine = new Scanner(in.nextLine());
			newLine.useDelimiter(",|;");
			
			profilesTree.insertProfile(createProfile(newLine));
			
		}
		in.close();
		return profilesTree;

	}

	/**
	 * Method to read the file and return a tree of profiles from this file. The
	 * program should handle the file not found exception here and shut down the
	 * program gracefully.
	 * 
	 * @param filename The name of the file.
	 * @return Tree of profiles from the file.
	 */
	public static BST readProfileSet(String filename) {

		File profileFile = new File(filename);
		Scanner in = null;

		try {
			in = new Scanner(profileFile);
			in.useDelimiter(",|;");
		} catch (FileNotFoundException e) {
			System.out.println("Cannot open " + filename);
			System.exit(0);
		}

		return FileReader.readProfileSet(in);

	}

	/**
	 * Method to take the data from a line of a specific file 
	 * and create a profile with the data provided from the line.
	 * In the end, it returns the profile.
	 * 
	 * @param newLine The scanner of the file.
	 * @return The profile.
	 */
	public static Profile createProfile(Scanner newLine) {

		String lastName = newLine.next();
		String firstName = newLine.next();
		int day = newLine.nextInt();
		int month = newLine.nextInt();
		int year = newLine.nextInt();
		String town = newLine.next();
		String country = newLine.next();
		String nationality = newLine.next();
		String email = newLine.next();

		String interests = "";
		while (newLine.hasNext()) {
			if (interests == "") {
				interests = newLine.next();
			} else {
				interests += ", " + newLine.next();
			}
		}

		Profile profile = new Profile(lastName, firstName, day, month, year, town, country, nationality, email,
				interests);

		return profile;
	}
	
	

}
