import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String number = scanner.nextLine();
		UPC upc = new UPC(number);
		upc.isValid();
	}
}

class UPC {
	private String input;	
	private char[] inputArr;	
	private int length, oddValues, evenValues;

	public UPC(String number) {
		this.length = number.length();
		if(length == 11) {
			this.input = number;
		} else if(length<11) {
			this.input = number;
			for(int i=0; i<(11-length); i++) {
				input = "0" + input;
			}
			System.out.println(input);
		} else {
			throw new IllegalArgumentException("\"INVALID INPUT ENTERED\"");
		}
	}

	public void isValid() {
		oddValues = 0; evenValues = 0;
		inputArr = input.toCharArray();
		for(int i=0; i<inputArr.length; i++) {
			if( (i)%2 == 0) {
				int value = Character.getNumericValue(inputArr[i]);
				oddValues = oddValues + value;
			} else if( (i)%2 != 0){
				int value = Character.getNumericValue(inputArr[i]);
				evenValues = evenValues + value;
			}
		}
		
		int result = oddValues * 3 + evenValues;
		int remainder = result % 10;

		if(remainder == 0) {
			System.out.println("Check digit is: "+remainder);
			input = input + "0";
			System.out.println("Full Upc is: "+input);
		} else {
			remainder = 10 - remainder;
			System.out.println("Check digit is: "+remainder);
			input = input + Integer.toString(remainder);
			System.out.println("Full Upc is: "+input);
		}
	}
}