public class Main {
	public static void main(String[] args) {
		String str = "1900";
		Century cen = new Century(str);
		cen.determineCentury();
		cen.determineLeapYear();
	}
}

class Century {
	private char[] year;
	private int yearInInt;

	public Century(String year) {
		if(year.length() == 4) {
			this.year = year.toCharArray();
			this.yearInInt = Integer.parseInt(year);	
		} else {
			System.out.println("Error: The value of year should be in format:yyyy");
		}
		
	}

	public void determineCentury() {
		if(year[2] == '0' && year[3] == '0') {
			System.out.println("The century is: "+year[0]+""+year[1]);
		} else {
			int century = yearInInt/100 + 1;
			System.out.println("The century is: "+century);
		}
	}

	public void determineLeapYear() {
		if((yearInInt%4 == 0 && yearInInt%100 != 0) || yearInInt%400 == 0) {
			System.out.println("The year is a leap year");
		} else {
			System.out.println("The year is not a leap year");
		}
	}
}