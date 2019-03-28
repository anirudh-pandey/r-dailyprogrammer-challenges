import java.util.Scanner;
import java.math.BigDecimal;
public class Main {
	public static void main(String[] args) {
		// Scanner scanner = new Scanner(System.in);
		// System.out.println("Enter the number of how many decimal digits"+
		// " you want:");
		// int numberOfDecimalValues = scanner.nextInt();

		// int counter = 0, m=22, n=7, quo, remainder;
		// String rem="", pi="";
		// while(counter <= numberOfDecimalValues) {
		// 	quo = m/n;
		// 	remainder = m%n;
		// 	rem = String.valueOf(remainder);
		// 	System.out.println(quo);
		// 	if(remainder < 7) {
		// 		rem = rem + 0;
		// 		m = Integer.parseInt(rem);
		// 	} else {
		// 		m = Integer.parseInt(rem);
		// 	}
		// 	if(counter == 1) {
		// 		pi = pi + ".";
		// 	}
		// 	pi = pi + quo;
		// 	counter ++;
		// }
		// System.out.println(pi);

		BigDecimal m = new BigDecimal("22");
		BigDecimal n = new BigDecimal("7");
		try {
			System.out.println(n.divide(n, 30));
		} catch(ArithmeticException ex) {
			System.out.println("hello");
		}
		// String result;

	}
}