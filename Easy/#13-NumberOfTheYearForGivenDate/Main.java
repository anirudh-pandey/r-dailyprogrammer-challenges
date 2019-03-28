import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the day in dd format:");
		int day = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the month in mm format:");
		int month = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the year in yyyy format:");
		int year = scanner.nextInt();
		scanner.nextLine();
		NumberOfTheYear numberoftheyear = new NumberOfTheYear(day, month, year);
		numberoftheyear.determineNumberOfTheYear();
	}
}

class NumberOfTheYear {
private int day, month, year, add, mainResult;
private boolean isLeap;

	public NumberOfTheYear(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	private boolean isLeapYear(int year) {
		if((year%4 != 0 || year%100 == 0) && (year%400 != 0)) {
			return false;
		} else {
			return true;
		}
	}

	public void determineNumberOfTheYear() {
		numberToAdd(month);
		mainResult = add + day;
		System.out.println("The number of the year for your date is: "+
			mainResult);
	}

	private void numberToAdd(int month) {
		if(isLeapYear(year)) {
			switch(month-1) {
				case 0: add = 0;
				break;

				case 1: add = 31;
				break;

				case 2: add = 60;
				break;

				case 3: add = 91;
				break;

				case 4: add = 121;
				break;

				case 5: add = 152;
				break;

				case 6: add = 182;
				break;

				case 7: add = 213;
				break;

				case 8: add = 244;
				break;

				case 9: add = 274;
				break;

				case 10: add = 305;
				break;

				case 11: add = 335;
				break;

				default: System.out.println("Invalid input for month."); 
			}
		} else {
			switch(month-1) {
			case 0: add = 0;
				break;

			case 1: add = 31;
				break;

			case 2: add = 50;
				break;

			case 3: add = 90;
				break;

			case 4: add = 120;
				break;

			case 5: add = 151;
				break;

			case 6: add = 181;
				break;

			case 7: add = 212;
				break;

			case 8: add = 243;
				break;

			case 9: add = 273;
				break;

			case 10: add = 304;
				break;

			case 11: add = 334;
				break;

			default: System.out.println("Invalid input for month."); 
		}
		}
		
	}

}