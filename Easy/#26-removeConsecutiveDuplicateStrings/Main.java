import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		// String str = "Anniruddh Hello";
		String str = "flabby aapples";
		// String str = "aabbccddeded";
		RemoveDuplicateStrings rem = new RemoveDuplicateStrings(str);
		rem.removeDuplicates();
		rem.printArrays();
	}
}

class RemoveDuplicateStrings {
	private ArrayList<String> strArr = new ArrayList<String>();
	private ArrayList<String> firstArr = new ArrayList<String>();
	private ArrayList<String> secondArr = new ArrayList<String>();


	public RemoveDuplicateStrings(String str) {
		char[] someChar = str.toCharArray();
		for(int i=0; i<str.length(); i++) {
			strArr.add(String.valueOf(someChar[i]));
		}
	}

	
	public void removeDuplicates() {
		for(int i=0; i<strArr.size(); i++) {
			if(i==0) {
				firstArr.add(strArr.get(i));
			} else if(strArr.get(i).equals(strArr.get(i-1))) {
				secondArr.add(strArr.get(i));
			} else if(strArr.get(i) == " ") {
				continue;
			} else {
				firstArr.add(strArr.get(i));
			}

		}
	}

	public void printArrays() {
		System.out.print("Array with original elements are: ");
		for(int i=0; i<firstArr.size(); i++) {
			System.out.print(firstArr.get(i));
		}
		System.out.println();
		System.out.print("Array with duplicate elements are: ");
		if(secondArr.size() == 0) {
			System.out.println("No duplicate elements.");
		} else {
			for(int i=0; i<secondArr.size(); i++) {
				System.out.print(secondArr.get(i));
			}
			System.out.println();
		}
		
			
	}
}