package src.com.JRU;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import src.com.JRU.beans.Listing;
import src.com.JRU.beans.Login;
import src.com.JRU.beans.updateUserInfo;
import src.com.JRU.beans.AppMechanics;
import src.com.JRU.beans.CreateAccountUNfolder;
import src.com.JRU.beans.Jobs;
import src.com.JRU.beans.CreateFolder;
import src.com.JRU.beans.JobListing;

public class JobsRus {
	public static Scanner jru = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		AppMechanics.startupScreen(jru);

	}
}