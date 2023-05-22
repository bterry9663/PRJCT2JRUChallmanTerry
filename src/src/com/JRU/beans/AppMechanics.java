package src.com.JRU.beans;

import java.io.IOException;
import java.util.List;
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
import src.com.JRU.beans.JobBrowse;
import src.com.JRU.beans.CreateAccountUNfolder;

public class AppMechanics {

	public static void startupScreen(Scanner jru) throws IOException {

		System.out.println("\n\n------------------- Welcome to JobsRUs -------------------\n\n");
		System.out.println("1. Log in");
		System.out.println("2. Create New Account");
		System.out.println("3. Browse Job Listings");
		System.out.println("4. Close Program");
		System.out.println();
		System.out.println("What would you like to do?: ");
		String ans = jru.next();

		switch (ans) {

		case "1":
			Login.login(jru);
			break;

		case "2":
			CreateAccountUNfolder caunf = new CreateAccountUNfolder();// creates user file in user folder
			caunf.accountBuildUN(jru);
			break;

		case "3":
			// this displays all listings then returns to startup screen
			JobBrowse jb = new JobBrowse();
			jb.jobBrowser();
			startupScreen(jru);
			break;
		case "4":
			System.out.println("Thank you for using JobsRUs!\n\n");
			System.out.println("Goodbye!");
			System.exit(0);
			break;
		default:
			startupScreen(jru);
		}
	}

	public static void mainMenu(Scanner jru) throws IOException {

		System.out.println("\n\n------------------- Main Menu -------------------\n\n");
		System.out.println("1. Update User Info");
		System.out.println("2. Update Resume");
		System.out.println("3. Browse Job Listings");
		System.out.println("4. Log out");
		System.out.println();
		System.out.println("What would you like to do?: ");
		String ans = jru.next();

		switch (ans) {

		case "1":
			update(jru);
			break;

		case "2":
			// CreateAResume.create(jru);
			CreateAResumeUNfolder.create(jru);
			break;

		case "3":
			Jobs job = new Jobs();
			JobListing jl = new JobListing();
			job.jobSearchOptions(jl, jru);
			mainMenu(jru);
			break;

		case "4":
			startupScreen(jru);
			break;

		default:
			mainMenu(jru);
		}
	}

	public static void update(Scanner jru) throws IOException {

		System.out.println("What would you like to update?");
		System.out.println("1. Update Username");
		System.out.println("2. Update Password");
		System.out.println("3. Update Name");
		System.out.println("4. Update Email");
		System.out.println("5. Update Phone Number");

		String ans = jru.next();

		switch (ans) {

		case "1":
			updateUserInfo.updateUserName(jru);
			System.out.println("UserName has been updated!");
			break;

		case "2":
			updateUserInfo.updatePassword(jru);
			System.out.println("Password has been updated!");
			break;

		case "3":
			updateUserInfo.updateName(jru);
			System.out.println("Name has been updated!");
			break;

		case "4":
			updateUserInfo.updateEmail(jru);
			System.out.println("Email has been updated!");
			break;

		case "5":
			updateUserInfo.updatePhone(jru);
			System.out.println("Phone Number has been updated!");
			break;

		default:
			System.out.println("Invalid choice");
			update(jru);
		}
		mainMenu(jru);

	}
}
