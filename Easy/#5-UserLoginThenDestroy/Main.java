import java.util.*;
import java.io.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int counter = 0;
		String username="", password="", newUsername, newPassword;
		// username = "balake77";
		// password = "password123456";
		File file = new File("demo.txt");
		// BufferedReader br = new BufferedReader(new FileReader(file));
		// String str;
		
		try
		{
			Scanner sc = new Scanner(file);

			while( sc.hasNextLine() ) {
				counter ++;
				if(counter == 1) {
					username = sc.nextLine();
				} else {
					password = sc.nextLine();
				}
			}      
		}
		catch (FileNotFoundException ex)  
		{
        // insert code to run when exception occurs
			username = "balake77";
			password = "password123456";
		}

		System.out.println("If you want to access the contents of this"+
		" program please enter your username and password:");
		System.out.print("Enter username: ");
		newUsername = scanner.nextLine();
		System.out.print("Enter password: ");
		newPassword =  scanner.nextLine();

		if(newUsername.equals(username) && newPassword.equals(password)) {
			System.out.println("Login Successful.");
		} else {
			System.out.println("Invalid User: Authentication failed.");
		}
	}
}