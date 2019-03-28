import java.util.*;
public class Main {
	public static void main(String[] args) {
		int input;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter \n\"1\" for PerfectlyBalanced. \n\"2\""
		+" for PerfectlyBalancedBonus");
		int n = scanner.nextInt();
		scanner.nextLine();
		switch(n) {
			case 1:	input = 1;
					System.out.println("Enter x and y string:-");
					String str1 = scanner.nextLine();
					PerfectlyBalanced pf1 = new PerfectlyBalanced(str1, input); 
					pf1.isBalanced();
					break;

			case 2: input = 2;
					System.out.println("Enter any string:-");
					String str2 = scanner.nextLine();
					PerfectlyBalanced pf2 = new PerfectlyBalanced(str2, input); 
					pf2.isBalancedBonus();
					break;

			default: System.out.println("Some weird input was entered.");
		}
		
		
	}
}

class PerfectlyBalanced {
	private char[] strArray;
	private int length, x, y;
	private ArrayList<String> strArrayList;

	public PerfectlyBalanced(String str, int input) {
		this.length = str.length();
		if(input == 1) {
			this.strArray = str.toCharArray();	
		} else if(input == 2) {
			strArrayList = new ArrayList<String>();
			this.strArray = str.toCharArray();
		}
	}

	public void isBalanced() {
		x=0; y=0;
		for(int i=0; i<length; i++) {
			if(strArray[i] == 'x') {
				x++;
			} else if(strArray[i] == 'y') {
				y++;
			} else {
				;
			}
		}
		System.out.println("x: "+x+"\ny: "+y);
		if(x==y) {
			System.out.println("Perfectly Balanced.");
		} else {
			System.out.println("Not Perfectly Balanced");
		}
	}


	//--------------------------BONUS---------------------------------
	public void isBalancedBonus() {
		if(length == 0) {
			System.out.println("Perfectly Balanced with string length 0.");
		} else {
			for(int i=0; i<length; i++) {
				String individualString = Character.toString(strArray[i]); 
				if(strArrayList.contains(individualString)) {
					int index = strArrayList.indexOf(individualString);
					strArrayList.remove(index);
				} else {
					strArrayList.add(individualString);
				}
			}
			if(length == strArrayList.size()) {
				System.out.println("PERFECTLY BALANCED BONUS");
			} else {
				System.out.println("NOT PERFECTLY BALANCED BONUS");
			}
		}
		
	}
}