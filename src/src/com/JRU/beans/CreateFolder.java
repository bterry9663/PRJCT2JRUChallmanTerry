package src.com.JRU.beans;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import src.com.JRU.beans.User;
import src.com.JRU.beans.Listing;

public class CreateFolder {

	public void createUserFolder(String userName) {
		final String userFolder = "C:\\Users\\terry\\Documents\\workspace-spring-tool-suite-4-4.17.2.RELEASE\\PRJCT2JRUChallmanTerry\\src\\src\\com\\JRU\\Users\\"
				+ userName;
		File folder = new File(userFolder);
		if (!(folder.exists())) {
			boolean bool = folder.mkdir();
			if (bool) {
				System.out.println("Folder is created successfully");
			} else {
				System.out.println("Error Found!");
			}
		} else {
			System.out.println("Folder exists already!");
		}
	}

}// write brace
