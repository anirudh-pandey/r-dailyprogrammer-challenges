import java.util.*;
public class Main {
	public static void main(String[] args) {
		findTheTornNumber();
	}

	public static void findTheTornNumber() {
		for(int i=1000; i<9999; i++) {
			if(i==3025) {
				continue;
			}
			if(isTheNumberTorn(i)) {
				System.out.print(i);
				break;
			}
		}
	}

	public static boolean isTheNumberTorn(int value) {
		int firstHalf = value/100;
		int secondHalf = value%100;
		int sum = firstHalf + secondHalf;
		int squareValue = (int)Math.pow(sum, 2);
		if(value==squareValue && notSame(value)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean notSame(int value) {
		HashSet<Integer> hashset = new HashSet<>();
		while(value>0) {
			int singleDigit = value % 10;
			hashset.add(singleDigit);
			value = value / 10;
		}
		if(hashset.size() != 4) {
			return false;
		} else {
			return true;
		}
	}
}


