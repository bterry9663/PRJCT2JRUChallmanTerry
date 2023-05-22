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
import src.com.JRU.beans.JobListing;

//This is for browsing the job listings when not signed in.
public class JobBrowse {
	JobListing reader = new JobListing();
	List<Listing> jobs = reader.viewAllListings();

	public void jobBrowser() {
		System.out.println(jobs);

	}

}
