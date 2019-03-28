import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String arr = scanner.nextLine();
		convertToUpperCase(arr); 
	}


	public static void convertToUpperCase(String arr) {
		char[] charArr = arr.toCharArray();
		String upperCasedString = "";
		for (int i=0; i<charArr.length; i++) {
			int asciiValue = (int)charArr[i] - 32;
			upperCasedString = upperCasedString + String.valueOf((char)asciiValue);
		}
		System.out.println(upperCasedString);
	}
}

