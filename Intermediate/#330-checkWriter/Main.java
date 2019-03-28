import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the money with decimal digits if any: ");
		String n = scanner.nextLine();
		CheckWriter cw = new CheckWriter(n);
		cw.convertIntoWords();
	}
}

class CheckWriter {
	private String number, result, decResult;
	private int count, len;

	public CheckWriter(String n) {
		this.number = n;
		this.result = "";
		this.count = 0;
		this.len = this.number.length();
	}

	public void convertIntoWords() {
		String intNumber = number;
		intNumber = intNumber.substring(0, intNumber.indexOf("."));
		int intlen = intNumber.length();
		while(intlen>0) {
			count++; 
			String value = intNumber.substring(intlen-1, intlen);
			if(count==2||count==3||count==5||count==6) {
				if(count==3&&value.equals("0")) {
					result = getWords(value, count) + getFiller(1) + result;
				} else {
					result = getWords(value, count) + getFiller(count) + result;
				}
			} else if(count==1) {
					if(intlen > 1) {
						if(intNumber.substring(intlen-2, intlen-1).equals("1")) {
							result = getWords(intNumber.substring(intlen-2, intlen), count) + getFiller(count) + result;
							count++; intlen--;
						} else {
							result = getWords(value, count) + getFiller(count) + result;
						}
					} else {
						result = getWords(value, count) + getFiller(count) + result;
					}
			} else if(count==4) {
				if(intNumber.substring(intlen-2, intlen-1).equals("1")) {
					result = getWords(intNumber.substring(intlen-2, intlen), count) + getFiller(count) + result;
					count++; intlen--;
				} else if(intNumber.substring(intlen-2, intlen-1).equals("0")&&value.equals("0")) {
					result = getWords(value, count) + getFiller(1) + result;
				} else {
					result = getWords(value, count) + getFiller(count) + result;
				}
			}
			intlen--;
		}
		result += obtainDecimalNumbers();
		System.out.println(result);
	}

	public String obtainDecimalNumbers() {
		String decimalNumber = number.substring(number.indexOf(".")+1);
		int size = decimalNumber.length();
		decResult = getWords(decimalNumber.substring(size-1, size), 1);
		if(decimalNumber.substring(size-2, size-1).equals("0")) {
			decResult = "zero ";
		} else if(decimalNumber.substring(size-2, size-1).equals("1")) {
			decResult = getWords(decimalNumber.substring(size-2, size), 1);
		} else {
			decResult = getWords(decimalNumber.substring(size-2, size-1), 2) + " " + decResult;
		}
		decResult = "and " + decResult + "paisa";
		return decResult;
	} 


	private String getWords(String n, int count) {
		if(count==5||count==2) {
			switch(n) {
				case "0": return "";
				case "2": return "twenty ";
				case "3": return "thirty ";
				case "4": return "forty ";
				case "5": return "fifty ";
				case "6": return "sixty ";
				case "7": return "seventy ";
				case "8": return "eighty ";
				case "9": return "ninety ";
				default: return "error ";
			}
		} else {
			switch(n) {
				case "0": return "";
				case "1": return "one ";
				case "2": return "two ";
				case "3": return "three ";
				case "4": return "four ";
				case "5": return "five ";
				case "6": return "six ";
				case "7": return "seven ";
				case "8": return "eight ";
				case "9": return "nine ";
				case "10": return "ten ";
				case "11": return "eleven ";
				case "12": return "twelve ";
				case "13": return "thirteen ";
				case "14": return "fourteen ";
				case "15": return "fifteen ";
				case "16": return "sixteen ";
				case "17": return "seventeen ";
				case "18": return "eighteen ";
				case "19": return "nineteen ";
				default: return "error ";
			}
		}
	}

	private String getFiller(int count) {
		switch(count) {
			case 1: return "";
			case 2: return "";
			case 3: return "hundred, ";
			case 4: return "thousand, ";
			case 5: return "";
			case 6: return "lakh, ";
			default: return "error ";
		}
	}
}