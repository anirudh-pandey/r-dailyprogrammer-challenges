import java.util.Scanner;
public class Main {
	public static Scanner scanner = new Scanner(System.in);
	public static char[] plaintext;
	public static char[] ciphertext;
	public static String sampleText, text;
	public static int lengthOfPl;
	public static void main(String[] args) {
		System.out.println("Enter the number of position it should be shifted.");
		int shiftPosition = scanner.nextInt();
		scanner.nextLine();

		System.out.println("Enter the length of the plaintext:");
		lengthOfPl = scanner.nextInt();
		scanner.nextLine(); 

		System.out.println("Enter the plaintext:");
		text = scanner.nextLine();
		text = text.toLowerCase();
		plaintext = text.toCharArray();
		ciphertext = text.toCharArray();

		System.out.println("The encrypted message is: ");
		System.out.println(encrypt(shiftPosition, plaintext));
		// text = "dauxkukikj";
		// System.out.println(text.length());
		// ciphertext = text.toCharArray();
		// plaintext = text.toCharArray();
		System.out.println("The decrypted message is: ");
		System.out.println(decrypt(shiftPosition, ciphertext));
		scanner.close();
	}
	public static char[] encrypt(int positionShift, char[] plaintext) {
		// sampleText = "anirudh";
		// plaintext = sampleText.toCharArray();
		// ciphertext = sampleText.toCharArray();
		for(int i=0; i<lengthOfPl; i++) {
			int demoAscii = (int)plaintext[i] - 97;
			// System.out.println(demoAscii);
			int asciiValue = (demoAscii + positionShift) % 26;
			// System.out.println(asciiValue);
			ciphertext[i] = (char)(asciiValue + 97);
			// System.out.println(ciphertext[i]);
		}
		// System.out.println(ciphertext);
		return ciphertext;
	}
	public static char[] decrypt(int positionShift, char[] ciphertext) {
		for (int i=0; i<lengthOfPl; i++) {
			int demoAscii = ((int)ciphertext[i]) - 97;
			// System.out.println(demoAscii);
			int asciiValue = (Math.abs(demoAscii - positionShift) % 26);
			// System.out.println(asciiValue);
			plaintext[i] = (char)(asciiValue + 97);
			// System.out.println(ciphertext[i]); 
		}
		return plaintext;
	}
}