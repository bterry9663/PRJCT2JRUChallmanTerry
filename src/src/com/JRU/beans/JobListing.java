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
import src.com.JRU.beans.AppMechanics;

public class JobListing {
	// This is used to present and store job listings

	public static Scanner jru = new Scanner(System.in);
	private final String csvFile2 = "C:\\Users\\terry\\Documents\\workspace-spring-tool-suite-4-4.17.2.RELEASE\\Project2JobsRUs\\src\\com\\JRU\\Listings\\Listings.csv";

	String[] jobDeets;

	public List<Listing> viewAllListings() {// this works

		List<Listing> jobs = new LinkedList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(csvFile2))) {
			String line;

			line = br.readLine();

			while ((line = br.readLine()) != null) {

				jobDeets = line.split(",");
				// first thing is the listingId, title, description, address, city, state,
				// zipcode, salary, careerField, contactEmail
				Listing job = new Listing(jobDeets[0].trim(), jobDeets[1].trim(), jobDeets[2].trim(),
						jobDeets[3].trim(), jobDeets[4].trim(), jobDeets[5].trim(), jobDeets[6].trim(),
						jobDeets[7].trim(), jobDeets[8].trim(), jobDeets[9].trim());

				jobs.add(job);

			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		return jobs;
	}

}
