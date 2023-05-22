package src.com.JRU.beans;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.LinkedList;
import src.com.JRU.beans.User;
import src.com.JRU.beans.Listing;
import src.com.JRU.beans.AppMechanics;
import src.com.JRU.beans.JobListing;

public class Jobs {

	User user = new User();
	CreateAccountUNfolder cAUNf = new CreateAccountUNfolder();
	private final String userName1 = "C:\\Users\\terry\\Documents\\workspace-spring-tool-suite-4-4.17.2.RELEASE\\PRJCT2JRUChallmanTerry\\src\\src\\com\\JRU\\Users\\"
			+ cAUNf.getUserName() + "\\" + cAUNf.getUserName() + "AccountInfo.txt";

	private final String csvFile2 = "C:\\Users\\terry\\Documents\\workspace-spring-tool-suite-4-4.17.2.RELEASE\\PRJCT2JRUChallmanTerry\\src\\src\\com\\JRU\\Users\\Listings\\Listings.csv";
	private final String txtFile2 = "C:\\Users\\terry\\Documents\\workspace-spring-tool-suite-4-4.17.2.RELEASE\\PRJCT2JRUChallmanTerry\\src\\src\\com\\JRU\\Users\\UsersListingApplications.txt";
	//PRJCT2JRUChallmanTerry\src\src\com\JRU\Users
	JobListing reader2 = new JobListing();
	List<Listing> jobs2 = reader2.viewAllListings();//
	JobListing jl = new JobListing();

	public static Scanner jru = new Scanner(System.in);

	Listing chosenOne;
	String[] jobDeets;

	public void jobSearchOptions(JobListing jl, Scanner jru) {

		System.out.println(" What would you like to do? \n" + " 1. View all listings in their entirety. \n"
				+ " 2. View available career areas. \n" + " 3. View available locations. \n"
				+ " 4. View available salaries. \n" + " 5. Apply to a listing. \n" + " 6. Go back to Main menu. \n");

		int options = jru.nextInt();

		if (options == 1) {

			System.out.println(jl.viewAllListings());
			jobSearchOptions(jl, jru);
		} else if (options == 2) {
			browseCareerArea(jl.viewAllListings());
		} else if (options == 3) {
			browseLocation(jl.viewAllListings());
		} else if (options == 4) {
			browseSalary(jl.viewAllListings());
		} else if (options == 5) {
			chooseListing(jl.viewAllListings(), jru);
		} else if (options == 6) {
			try {
				AppMechanics.mainMenu(jru);
			} catch (IOException e) {
				// e.printStackTrace();
			}
		} else {
			try {
				AppMechanics.startupScreen(jru);
			} catch (IOException e) {
				// e.printStackTrace();
			}
		}
	}

	public void browseCareerArea(List<Listing> jobs) { // PERFECT, DONT TOUCH IT! -bt
		// option to browse listings by career area

		System.out.println("Listing    Career  \n ID        Field ");
		System.out.println("--------------------------------");
		for (int i = 1; i < jobs.size(); i++) {

			System.out.println(" " + jobs.get(i).getListingId() + ". --  " + jobs.get(i).getCareerField());
		}
		System.out.println("\n\n");
		jobSearchOptions(jl, jru);
	}

	public void browseLocation(List<Listing> jobs) {// PERFECT, DONT TOUCH IT! -bt
		// option to browse listings by state location

		System.out.println("Listing ID    CITY, STATE ");
		System.out.println("--------------------------------");
		for (int i = 1; i < jobs.size(); i++) {

			System.out.println("   " + jobs.get(i).getListingId() + ".  --   " + jobs.get(i).getCity() + ",  "
					+ jobs2.get(i).getState());
		}
		System.out.println("\n\n");
		jobSearchOptions(jl, jru);

	}

	public void browseSalary(List<Listing> jobs) {// PERFECT, DONT TOUCH IT! -bt
		// browse by expected salary range
		System.out.println("Listing    Annual  \n ID        Salary ");
		System.out.println("--------------------------------");
		for (int i = 1; i < jobs.size(); i++) {

			System.out.println(
					" " + jobs.get(i).getListingId() + ".  --   $" + jobs.get(i).getSalary() + ".00 annually  ");
		}
		System.out.println("\n\n");
		jobSearchOptions(jl, jru);

	}

	public void chooseListing(List<Listing> jobs, Scanner jru) {
		String go;

		// choosing which listing to apply to...
		System.out.println("To which listing would you like to apply? : (Enter 1-" + (jobs.size() - 1) + ") ");// this
																												// works
		// scanner to allow user to input their choice
		int listingnum = jru.nextInt(); // this works
		// print the listing of their choice
		System.out.println(" " + jobs.get(listingnum));// this works
		// clear the buffer
		jru.nextLine();

		System.out.println("Is this correct : (1 for yes or 2 for no)");

		int correct = jru.nextInt();

		if (correct == 2) {

			System.out.println("To which listing would you like to apply? : (Enter 1-" + (jobs.size() - 1) + ") ");
			listingnum = jru.nextInt();
			System.out.println(" " + jobs.get(listingnum));
			jru.nextLine();
			System.out.println("Is this correct : (1 for yes or 2 for no)");
		} else {
			System.out.println("Great, let's continue...");
		}
		// clear the buffer
		jru.nextLine();
		System.out.println("\n \n  ***Hit ENTER to continue*** \n \n ");
		go = jru.nextLine();
		chosenOne = jobs.get(listingnum);

		saveListingToFile(chosenOne);

	}

	public void saveListingToFile(Listing chosenOne) {
		System.out.println("Please re-enter Username: ");
		String userName = jru.next();
		String userName1 = "C:\\Users\\terry\\Documents\\workspace-spring-tool-suite-4-4.17.2.RELEASE\\PRJCT2JRUChallmanTerry\\src\\src\\com\\JRU\\Users\\"
				+ userName + "\\" + userName + "ListingInfo.txt";

		File file = new File(userName1);

		if (file.exists()) {
			System.out.println(" ... ...");
			BufferedWriter bw;
			try {
				bw = new BufferedWriter(new FileWriter(userName1, true));
				bw.write(" Chosen Listing : \n" + chosenOne);
				bw.write(" \n ***************************  \n");
			} catch (IOException e) {
				System.out.println("Oops, Lets try that again.");
			}
		}

		else {
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(userName1, true))) {
				bw.write(" Chosen Listing : \n" + chosenOne);
				bw.write(" \n ***************************  \n");
			} catch (IOException ex) { // ex.printStackTrace();
			}
		}
		if (file.isDirectory()) {
			System.out.println(" ... ...");
		} else if (!(file.isDirectory())) {
			System.out.println(" ... ... ...");
		} else {
			try (BufferedWriter bw = new BufferedWriter(new FileWriter(userName1, true))) {
				bw.write(" Chosen Listing : \n" + chosenOne);
				bw.write(" \n ***************************  \n");
			} catch (IOException ex) {// ex.printStackTrace();

			}
		}
		System.out.println("Success! Please contact " + chosenOne.getContactEmail() + " for follow up.");
	}

}