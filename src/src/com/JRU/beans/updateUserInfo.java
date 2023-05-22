package src.com.JRU.beans;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class updateUserInfo {

	public static void updateUserName(Scanner jru) throws IOException {
		jru.nextLine();
		StringBuilder stringBuilder = new StringBuilder();
		System.out.println("Current Username: ");
		String currentUsername = jru.nextLine();

		System.out.println("New Username: ");
		String newUsername = jru.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader("Users.csv"))) {

			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				stringBuilder.append(sCurrentLine).append("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		String[] splitArray = stringBuilder.toString().split(currentUsername);
		stringBuilder = new StringBuilder(splitArray[0] + newUsername + splitArray[1]);
		String fileContent = stringBuilder.toString();
		// System.out.println(fileContent);
		FileWriter writer = new FileWriter("Users.csv");
		writer.write(fileContent);
		writer.close();

	}

	public static void updatePassword(Scanner jru) throws IOException {
		jru.nextLine();
		StringBuilder stringBuilder = new StringBuilder();
		System.out.println("Current Password: ");
		String currentPassword = jru.nextLine();

		System.out.println("New Password: ");
		String newPassword = jru.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader("Users.csv"))) {

			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				stringBuilder.append(sCurrentLine).append("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		String[] splitArray = stringBuilder.toString().split(currentPassword);
		stringBuilder = new StringBuilder(splitArray[0] + newPassword + splitArray[1]);
		String fileContent = stringBuilder.toString();
		FileWriter writer = new FileWriter("Users.csv");
		writer.write(fileContent);
		writer.close();
	}

	public static void updateName(Scanner jru) throws IOException {
		jru.nextLine();
		StringBuilder stringBuilder = new StringBuilder();
		System.out.println("Current Name: ");
		String currentName = jru.nextLine();

		System.out.println("New Name: ");
		String newName = jru.nextLine() + " " + jru.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader("Users.csv"))) {

			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				stringBuilder.append(sCurrentLine).append("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		String[] splitArray = stringBuilder.toString().split(currentName);
		stringBuilder = new StringBuilder(splitArray[0] + newName + splitArray[1]);
		String fileContent = stringBuilder.toString();
		FileWriter writer = new FileWriter("Users.csv");
		writer.write(fileContent);
		writer.close();
	}

	public static void updateEmail(Scanner jru) throws IOException {
		jru.nextLine();
		StringBuilder stringBuilder = new StringBuilder();
		System.out.println("Current Email: ");
		String currentEmail = jru.nextLine();

		System.out.println("New Email: ");
		String newEmail = jru.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader("Users.csv"))) {

			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				stringBuilder.append(sCurrentLine).append("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		String[] splitArray = stringBuilder.toString().split(currentEmail);
		stringBuilder = new StringBuilder(splitArray[0] + newEmail + splitArray[1]);
		String fileContent = stringBuilder.toString();
		FileWriter writer = new FileWriter("Users.csv");
		writer.write(fileContent);
		writer.close();
	}

	public static void updatePhone(Scanner jru) throws IOException {
		jru.nextLine();
		StringBuilder stringBuilder = new StringBuilder();
		System.out.println("Current Phone Number: ");
		String currentPhone = jru.nextLine();

		System.out.println("New Phone Number: ");
		String newPhone = jru.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader("Users.csv"))) {

			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				stringBuilder.append(sCurrentLine).append("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		String[] splitArray = stringBuilder.toString().split(currentPhone);
		stringBuilder = new StringBuilder(splitArray[0] + newPhone + splitArray[1]);
		String fileContent = stringBuilder.toString();
		FileWriter writer = new FileWriter("Users.csv");
		writer.write(fileContent);
		writer.close();
	}
}
