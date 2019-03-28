import java.util.Random;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random rand = new Random();
		String password = "";
		int max = 126, min = 33;

		System.out.println("How many passwords do you want to generate?");
		int mainLimit = scanner.nextInt();
		System.out.println("How long do you want your password to be?");
		int limit = scanner.nextInt();
		for (int i=0; i<mainLimit; i++) {
			System.out.print("password no."+i+" is: ");
			for(int j=0; j<limit; j++) {
				int x = rand.nextInt(max) + min;
				char alphabet = (char)x;
				String mainAlphabet = String.valueOf(alphabet);
				password += mainAlphabet;
			}
			System.out.println(password);
			password = "";
		}
		
	}
}