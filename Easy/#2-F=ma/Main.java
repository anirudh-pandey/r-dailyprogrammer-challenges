import java.util.Scanner;
public class Main {
	public static Scanner scanner = new Scanner(System.in);
	public static double f, m, a;
	public static int input;  
	public static boolean flag = false;
	public static void main(String[] args) {
		do {
			printInstructions();
			input = scanner.nextInt();
			menu(input);
		}while(!flag);
	}
	public static void menu(int input) {
		switch(input) {
			case 1:printInstructions();
				break;

			case 2: System.out.println("Enter the value of m:");
					m = scanner.nextInt();
					System.out.println("Enter the value of a:");
				   	a = scanner.nextInt();
				   	System.out.println("f = "+(m*a));
				break;

			case 3: System.out.println("Enter the value of f:");
					f = scanner.nextInt();
					System.out.println("Enter the value of m:");
				   	m = scanner.nextInt();
				   	System.out.println("a = "+(f/m));
				break;

			case 4: System.out.println("Enter the value of f:");
					f = scanner.nextInt();
					System.out.println("Enter the value of a:");
				   	a = scanner.nextInt();
				   	System.out.println("m = "+(f/a));
				break;

			case 5: flag = true;
				break;

			default: System.out.println("I did not understand you.");
		}
	} 
	public static void printInstructions() {
		System.out.println("Press\n"+
							"\"1\" for showing instructions\n"+
							"\"2\" for function f=m*a\n"+
							"\"3\" for function a=f/m\n"+
							"\"4\" for function m=f/a\n"+
							"\"5\" to EXIT.");	
	}
}