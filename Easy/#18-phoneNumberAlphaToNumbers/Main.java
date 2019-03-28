import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		String phoneNumber1 = "1-800-COMCAST";
		String phoneNumber2 = "1-800-ANIRUDH";
		String phoneNumber3 = "1-800-HELLOHI";
		PhoneNumber phone1 = new PhoneNumber(phoneNumber1);
		phone1.convertPhoneNumber();
		PhoneNumber phone2 = new PhoneNumber(phoneNumber2);
		phone2.convertPhoneNumber();
		PhoneNumber phone3 = new PhoneNumber(phoneNumber3);
		phone3.convertPhoneNumber();
	}
}

class PhoneNumber {
	private String phoneNum;
	private ArrayList<String> arrOfPhoneNum = new ArrayList<String>();

	public PhoneNumber(String phoneNum) {
		if(phoneNum.length() == 13) {
			this.phoneNum = phoneNum;
		} else {
			System.out.println("Phone number is not proper, please check again.");
		}
	}

	public void convertPhoneNumber() {
		char[] phoneNumInChar = phoneNum.toCharArray();
		for(int i=0; i<phoneNum.length(); i++) {
			if(i < 6) {
				arrOfPhoneNum.add(String.valueOf(phoneNumInChar[i]));
			} else {
				if(i == 9) {
					arrOfPhoneNum.add("-");
					arrOfPhoneNum.add(alphaToNumeric(phoneNumInChar[i]));
				} else {
					arrOfPhoneNum.add(alphaToNumeric(phoneNumInChar[i]));
				}
			}
		}
		for(int i=0; i<arrOfPhoneNum.size(); i++) {
			System.out.print(arrOfPhoneNum.get(i));	
		}
		System.out.println();
	}
	
	public String alphaToNumeric(char alphabet) {
		if(alphabet == 'A' || alphabet == 'B' || alphabet == 'C') {
			return "2";
		} else if(alphabet == 'D' || alphabet == 'E' || alphabet == 'F') {
			return "3";
		} else if(alphabet == 'G' || alphabet == 'H' || alphabet == 'I') {
			return "4";
		} else if(alphabet == 'J' || alphabet == 'K' || alphabet == 'L') {
			return "5";
		} else if(alphabet == 'M' || alphabet == 'N' || alphabet == 'O') {
			return "6";
		} else if(alphabet == 'P' || alphabet == 'Q' || alphabet == 'R' || 
			alphabet == 'S') {
			return "7";
		} else if(alphabet == 'T' || alphabet == 'U' || alphabet == 'V') {
			return "8";
		} else if(alphabet == 'W' || alphabet == 'X' || alphabet == 'Y' || 
			alphabet == 'Z') {
			return "9";
		} else {
			return "Null";
		}
	}
}
