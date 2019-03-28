import java.util.Scanner;
public class Main {
	public static Scanner scanner = new Scanner(System.in); 
	public static int n, dummy; 
	public static int[] numericArray; 
	public static char[] charArray; 
	public static String[] stringArray; 
	public static void main(String[] args) {
		arrangeNumbers();
		arrangeAlphabets();
	}

	public static void arrangeNumbers() {
		System.out.println("Enter the total numbers you want to arrange:");
		n = scanner.nextInt();
		numericArray = new int[n];
		scanner.nextLine();
		for(int k=0; k<n; k++) {
			System.out.print("Enter the number "+(k+1)+": ");
			numericArray[k] = scanner.nextInt();
			scanner.nextLine();
		}
		for(int i=0; i<n-1; i++) {
			for (int j=i+1; j<n; j++) {
				if(numericArray[i] > numericArray[j]) {
					dummy = numericArray[j];
					numericArray[j] = numericArray[i];
					numericArray[i] = dummy;
				}
			}
		}
		System.out.println("Numbers after proper arrangement are:");
		for(int k=0; k<n; k++) {
			System.out.print(numericArray[k]+"\t");
		}
	}



	public static void arrangeAlphabets() {
		System.out.println("Enter the total alphabets you want to arrange:");
		n = scanner.nextInt();
		charArray = new char[n];
		scanner.nextLine();
		for(int k=0; k<n; k++) {
			System.out.print("Enter the alphabets "+(k+1)+": ");
			charArray[k] = scanner.next(".").charAt(0);
		}
		numericArray = new int[n];
		for(int k=0; k<n; k++) {
			numericArray[k] = (int)charArray[k];
			System.out.println(numericArray[k]);
		}
		for(int i=0; i<n-1; i++) {
			for (int j=i+1; j<n; j++) {
				if(numericArray[i] > numericArray[j]) {
					dummy = numericArray[j];
					numericArray[j] = numericArray[i];
					numericArray[i] = dummy;
				}
			}
		}
		for(int k=0; k<n; k++) {
			charArray[k] = (char)numericArray[k];
		}
		System.out.println("Alphabets after proper arrangement are:");
		for(int k=0; k<n; k++) {
			System.out.print(charArray[k]+"\t");
		}
	}
}