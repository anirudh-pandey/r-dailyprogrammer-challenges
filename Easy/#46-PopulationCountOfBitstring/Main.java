import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to count its bitstring's population.");
		int number = scanner.nextInt();
		PopulationCount pc = new PopulationCount(number);
		pc.count();
	}
}

class PopulationCount {
	private int number, counter;
	private String arr = "";


	public PopulationCount(int number) {
		this.number = number;
	}


	public void count() {
		counter = 0;
		while(number != 0) {

			if(number == 1){
				arr = arr + String.valueOf(number);
				counter++;
				break;
			}
			
			int value = number % 2;
			if(value == 1) {
				counter++;
			}
			arr = arr + String.valueOf(value);
			number = number / 2;

		}
		System.out.println(arr+" this is binary repstn but in reverse.");
		System.out.println("Population count is: "+counter);
	}

}