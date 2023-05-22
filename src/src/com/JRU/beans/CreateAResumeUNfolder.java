package src.com.JRU.beans;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CreateAResumeUNfolder {

	public static File create(Scanner jru) throws IOException {

		System.out.println("Let's create your resume!");

		System.out.println("Please re-enter Username: ");
		String userName = jru.next();
		String userName1 = "C:\\Users\\terry\\Documents\\workspace-spring-tool-suite-4-4.17.2.RELEASE\\PRJCT2JRUChallmanTerry\\src\\src\\com\\JRU\\Users\\"
				+ userName + "\\" + userName + "Resume.txt";

		File file = new File(userName1);
		FileWriter fw = new FileWriter(file);
		PrintWriter pw = new PrintWriter(fw);

		pw.println();
		pw.println(" " + contactInfo(jru) + " ");
		pw.println();
		pw.println(" " + work1(jru) + " ");
		pw.println();
		pw.println(" " + work2(jru) + " ");
		pw.println();
		pw.println(" " + work3(jru) + " ");
		pw.println();
		pw.println(" " + education(jru) + " ");
		pw.println();
		pw.println(" " + skills(jru) + " ");
		pw.close();

		System.out.println("\n\nYour resume has been updated!\n\n");

		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(userName1);
			br = new BufferedReader(fr);

			String line;
			System.out.println("Resume: ");

			while ((line = br.readLine()) != null) {
				if (!line.isEmpty()) {
					System.out.println(line.trim());
				}

			}
		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

		AppMechanics.mainMenu(jru);

		return file;

	}

	public static String contactInfo(Scanner jru) {

		System.out.println("Your Name: ");
		String name = jru.nextLine() + jru.nextLine();
		System.out.println("Your job title: ");
		String title = jru.nextLine();
		System.out.println("Your phone number: ");
		String phone = jru.nextLine();
		System.out.println("Your address: ");
		String address = jru.nextLine();
		String contactInfo = name + "\n" + title + "\n" + phone + "\n" + address + "\n\n";

		return contactInfo;
	}

	public static String work1(Scanner jru) {

		System.out.println("Work Experience 1 job title: ");
		String jobTitle = jru.nextLine();
		System.out.println("Work Experience 1 description:");
		String description = jru.nextLine();
		String work1 = "------Professional Experience #1------\n " + jobTitle + "\n\n" + description;
		return work1;
	}

	public static String work2(Scanner jru) {

		System.out.println("Work Experience 2 job title:");
		String jobTitle = jru.nextLine();
		System.out.println("Work Experience 2 description:");
		String description = jru.nextLine();
		String work2 = "------Professional Experience #2------\n" + jobTitle + "\n\n" + description;
		return work2;
	}

	public static String work3(Scanner jru) {

		System.out.println("Work Experience 3 job title:");
		String jobTitle = jru.nextLine();
		System.out.println("Work Experience 3 description:");
		String description = jru.nextLine();
		String work3 = "------Professional Experience #3------\n" + jobTitle + "\n\n" + description;
		return work3;
	}

	public static String skills(Scanner jru) {

		System.out.println("Additional Skills:");
		String skills = "------Skills------ \n\n" + jru.nextLine();
		return skills;
	}

	public static String education(Scanner jru) {

		System.out.println("Education:");
		String education = "------Education------ \n\n" + jru.nextLine();
		return education;
	}

}
