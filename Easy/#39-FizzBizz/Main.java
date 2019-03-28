import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = scanner.nextInt();
		FizzBizz fb = new FizzBizz(n);
		fb.letsFizzBizz();
	}
}

class FizzBizz {
	private int limit;

	public FizzBizz(int n) {
		this.limit = n;
	}

	public void letsFizzBizz() {
		for(int i=1; i<=limit; i++) {
			if(i%3 == 0 && i%5 == 0) {
				System.out.println("fizzBizz");
			} else if(i%3 == 0) {
				System.out.println("fizz");
			} else if(i%5 == 0) {
				System.out.println("Bizz");
			} else {
				System.out.println(i);
			}
		}
	}
}