public class Main {
	public static String teleNumber;
	public static int len;
	public static char[] arr;
	public static void main(String[] args) {
		teleNumber = "123/456-7890";
		len = teleNumber.length();
		arr = teleNumber.toCharArray();
		validateTelephoneNumbers();
	}

	public static void validateTelephoneNumbers() {
		if(len == 10) {
			tenDigitValidation();
		} else if(len == 12) {
			twelveDigitValidation();
		} else if(len == 13) {
			thirteenDigitValidation();
		} else if(len == 14) {
			fourteenDigitValidation();
		} else if(len == 8) {
			eightDigitValidation();
		} else {
			System.out.println("Number is INVALID!!!");
		}
	}

	public static void tenDigitValidation() {
		for(int i=0; i<len; i++) {
			if(isNumber(arr[i])) {
				;
			} else {
				System.out.println("Invalid Telephone number");
				break;
			}
			if(i == len-1) {
				System.out.println("Telephone Number is Valid.");
			}
		}
	}

	public static void twelveDigitValidation() {
		for(int i=0; i<len; i++) {
			if(i == 3 || i == 7) {
				if(arr[i] == '.' || arr[i] == '-') {
					;
				} else {
					System.out.println("Invalid Telephone number.");
					break;
				}
			} else if(isNumber(arr[i])){
				;
			} else {
				System.out.println("Invalid Telephone number.");
			}
			if(i == len-1) {
				System.out.println("Telephone Number is Valid.");
			}
		}
	}

	public static void thirteenDigitValidation() {
		for(int i=0; i<len; i++) {
			if(i == 0) {
				if(arr[i] == '(') {
					;
				} else {
					System.out.println("Invalid Telephone number.");
					break;
				}
			} else if(i == 4) {
				if(arr[i] == ')') {
					;
				} else {
					System.out.println("Invalid Telephone number.");
					break;
				}
			} else if(i == 8) {
				if(arr[i] == '-') {
					;
				} else {
					System.out.println("Invalid Telephone number.");
					break;
				}
			} else if(isNumber(arr[i])){
				;
			} else {
				System.out.println("Invalid Telephone number.");
			}
			if(i == len-1) {
				System.out.println("Telephone Number is Valid.");
			}
		}
	}

	public static void fourteenDigitValidation() {
		for(int i=0; i<len; i++) {
			if(i == 0) {
				if(arr[i] == '(') {
					;
				} else {
					System.out.println("Invalid Telephone number.");
					break;
				}
			} else if(i == 4) {
				if(arr[i] == ')') {
					;
				} else {
					System.out.println("Invalid Telephone number.");
					break;
				}
			} else if(i == 5) {
				if(arr[i] == ' ') {
					;
				} else {
					System.out.println("Invalid Telephone number.");
					break;
				}
			} else if(i == 9) {
				if(arr[i] == '-') {
					;
				} else {
					System.out.println("Invalid Telephone number.");
					break;
				}
			} else if(isNumber(arr[i])){
				;
			} else {
				System.out.println("Invalid Telephone number.");
			}
			if(i == len-1) {
				System.out.println("Telephone Number is Valid.");
			}
		}
	}

	public static void eightDigitValidation() {
		for(int i=0; i<len; i++) {
			if(i == 3) {
				if(arr[i] == '-') {
					;
				} else {
					System.out.println("Invalid Telephone number.");
					break;
				}
			} else if(isNumber(arr[i])) {
				;
			} else {
				System.out.println("Invalid Telephone number.");
			}
			if(i == len-1) {
				System.out.println("Telephone Number is Valid.");
			}
		}
	}

	public static boolean isNumber(char number) {
		if(number == '1' || number == '2' || number == '3' || number == '4' ||
		 number == '5' || number == '6' || number == '7' ||number == '8' ||
		 number == '9' || number == '0') {
			return true;
		} else {
			return false;
		}
	}

}