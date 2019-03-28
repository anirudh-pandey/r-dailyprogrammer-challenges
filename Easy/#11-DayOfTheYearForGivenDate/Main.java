import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// System.out.println("Enter the day in dd format:");
		int day = scanner.nextInt();
		scanner.nextLine();
		// System.out.println("Enter the month in mm format:");
		int month = scanner.nextInt();
		scanner.nextLine();
		// System.out.println("Enter the year in yyyy format:");
		String year = scanner.nextLine();
		DayOfTheYear dayoftheyear = new DayOfTheYear(day, month, year);
		System.out.print("The day is: ");
		dayoftheyear.calculateF();
	}
}
class DayOfTheYear {
	private int kDay, formulaF, finalResult, mMonth,
	 dLateYearInInt, cStartYearInInt;
	private String  dLateYear="", cStartYear="", year;
	private char[] yearInChar;



	public DayOfTheYear(int day, int month, String year) {
		this.kDay = day;
		this.mMonth = (month+10)%12;
		if(year.length() == 4) {
			this.year = year;
		} else {
			System.out.println("Invalid value entered for year");
		}
	}

	
	private void getStartAndEndOfYear() {
		yearInChar = year.toCharArray();
		for(int i=2; i<4; i++) {
			dLateYear = dLateYear + String.valueOf(yearInChar[i]);
		}
		dLateYearInInt = Integer.parseInt(dLateYear);
		for(int i=0; i<2; i++) {
			cStartYear = cStartYear + String.valueOf(yearInChar[i]);
		}
		cStartYearInInt = Integer.parseInt(cStartYear);

	}


	public void calculateF() {
		getStartAndEndOfYear();
		formulaF = kDay +((13 * mMonth - 1)/ 5) + dLateYearInInt + 
		(dLateYearInInt/4) + (cStartYearInInt/4) - 2*cStartYearInInt;
		finalResult = formulaF % 7;
		if(finalResult < 0) {
			finalResult = finalResult + 7;
			determineDay(finalResult);
		} else {
			determineDay(finalResult);
		}
	}

	private void determineDay(int finalResult) {
		switch(finalResult) {
			case 0:System.out.println("Sunday.");
					break;
			case 1:System.out.println("Monday.");
					break;
			case 2:System.out.println("Tuesday.");
					break;
			case 3:System.out.println("Wednesday.");
					break;
			case 4:System.out.println("Thursday.");
					break;
			case 5:System.out.println("Friday.");
					break;
			case 6:System.out.println("Saturday.");
					break;
		}
	}




}