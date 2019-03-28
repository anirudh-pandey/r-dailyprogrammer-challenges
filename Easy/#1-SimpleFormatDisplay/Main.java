import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		String name, userName;
		int age;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name");
		name = scanner.nextLine();
		System.out.println("Enter your age");
		age = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter your username");
		userName = scanner.nextLine();
		System.out.println("your name is " +name+", you are "+age
			+" years old, and your username is "+userName);
		scanner.close();
	}
}