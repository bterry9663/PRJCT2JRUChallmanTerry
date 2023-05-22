package src.com.JRU.beans;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class User {

	private String userName;
	private String password;
	private String userId;
	private String name;
	private String email;
	private String phone;
	private File resume;

	public User() {

	}

	public User(String userName, String password, String userId, String name, String email, String phone, File resume) {

		this.userId = userId;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.resume = resume;
	}

	private void generateCsvFile(String users) {

		FileWriter writer = null;

		try {

			writer = new FileWriter(users);
			writer.append("UserId");
			writer.append(',');
			writer.append("Name");
			writer.append(',');
			writer.append("Email");
			writer.append(',');
			writer.append("Phone");
			writer.append('\n');

			writer.append("User" + userId);
			writer.append(',');
			writer.append(userId);
			writer.append(',');
			writer.append(name);
			writer.append(',');
			writer.append(email);
			writer.append(',');
			writer.append(phone);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				writer.flush();
				writer.close();
			} catch (IOException e) {

			}
		}
	}

	public String getUserName() {
		return this.userName;

	}

	public void setUsername(String userName) {
		this.userName = userName;

	}

	public String getUserId() {
		return this.userId;

	}

	public void setId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return this.name;

	}

	public void setName(String name) {
		this.name = name;

	}

	public String getEmail() {
		return this.email;

	}

	public void setEmail(String email) {
		this.email = email;

	}

	public String getPhone() {
		return this.phone;

	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public File getResume() {
		return this.resume;

	}

	public void setResume(String[] resume) throws IOException {

		File resume1 = new File("/Users/andrewchallman/Documents/GitHub/Project2JobsRUs/UserResume.txt");
		Scanner sc = new Scanner(resume1);

		while (sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		this.resume = resume1;

	}
}
