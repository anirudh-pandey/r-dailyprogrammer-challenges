import java.util.Scanner;
import java.util.Random;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the plaintext: ");
		String plaintext = scanner.nextLine();
		System.out.println("Enter the key");
		float key = scanner.nextInt();
		Cipher cipher = new Cipher(plaintext, key);
	}
}

class Cipher {
	private int row, column, length, count;
	private float key;
	private char[] plaintextArr;
	private String[][] ptMatrix;


	public Cipher(String plaintext, float key) {
		this.key = key;
		this.column = (int)key;
		length = plaintext.length();

		float someValue = length / key;
		row = (int)Math.ceil(someValue); //To get the higher int value for any decimal value like 50.xxx
		// System.out.println("The value of row is: "+row);

		plaintextArr = plaintext.toCharArray();
		ptMatrix = new String[row][column];
		count = 0;
		for(int i=0; i<row; i++) {
			for(int j=0; j<column; j++) {
				ptMatrix[i][j] = Character.toString(plaintextArr[count]);
				count++;
			}
		}
	}


}