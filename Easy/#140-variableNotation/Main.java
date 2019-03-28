import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		scanner.nextLine();
		String[] str = scanner.nextLine().split("");
		variableNotation(choice, str); 
	}

	public static void variableNotation(int choice, String[] str) {
		switch(choice) {
			case 0: camelCase(str);
					break;

			case 1: snakeCase(str);
					break;

			case 2: hybridPascalCase(str);
					break;

			default: System.out.println("INVALID CHOICE!");
		}
	}

	public static void camelCase(String[] str) {
		String result = "";
		boolean caps = false;
		for(int i=0; i<str.length; i++) {
			if(caps) {
				result += str[i].toUpperCase();
				caps = false;
				continue;
			}
			if(str[i].equals(" ")) {
				caps = true;
			} else {
				result += str[i];
			}
		}
		System.out.println(result);
	}


	public static void snakeCase(String[] str) {
		String result = "";
		for(int i=0; i<str.length; i++) {
			if(str[i].equals(" ")) {
				result += "_";
			} else {
				result += str[i];
			}
		}
		System.out.println(result);
	}

	public static void hybridPascalCase(String[] str) {
		String result = "";
		for(int i=0; i<str.length; i++) {
			if(str[i].equals(" ")) {
				result += "_";
			} else {
				result += str[i].toUpperCase();
			}
		}
		System.out.println(result);
	}

}