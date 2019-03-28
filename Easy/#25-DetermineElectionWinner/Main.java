import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the total no. of votes:");
			int limit = scanner.nextInt();
			System.out.println("Enter the votes you got:");
			int votesObtained = scanner.nextInt();
			if(votesObtained <= limit/2) {
				System.out.println("No result");
			} else {
				System.out.println("You win as you got majority of votes.");
			}
		}	
}