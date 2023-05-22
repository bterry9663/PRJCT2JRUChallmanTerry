package src.com.JRU.beans;

import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;

public class Login {

	public static void login(Scanner jru) {

		try {

			jru.nextLine();
			System.out.print("Enter user name: ");
			String userName = jru.nextLine();

			System.out.print("Enter password: ");
			String password = jru.nextLine();

			String[] currentUserInfo = null;

			BufferedReader br = new BufferedReader(new FileReader("Users.csv"));
			String line = br.readLine();
			whileLoop: while ((line != null) && (!line.isEmpty())) {
				String[] tempArray = line.split(",");

				if (tempArray[0].equals(userName)) {
					currentUserInfo = tempArray;
					break whileLoop;
				}
				line = br.readLine();
			}

			if (currentUserInfo != null && currentUserInfo[1].equals(password)) {
				System.out.println("User successfully logged-in.. ");
				AppMechanics.mainMenu(jru);
			} else {
				System.out.println("Invalid username and/or password ");
				login(jru);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}