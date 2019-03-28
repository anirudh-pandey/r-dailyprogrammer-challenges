import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] str = scanner.nextLine().split(" ");
		howManyCombinations(str);
	}

	public static void howManyCombinations(String[] str) {
		int n = Integer.valueOf(str[0]), a1 = Integer.valueOf(str[1]), a2 = Integer.valueOf(str[2]);
		int a3 = Integer.valueOf(str[3]);
		int totalCombinations = 0, currentPosition = 0;
		int[] arr = new int[n];
		for(int i=0; i<n; i++) {
			arr[i] = i;
		}
		totalCombinations += n * 2 + a1;
		System.out.println(totalCombinations);
		if(a1 < a2) {
			totalCombinations += n + (n-(a2-a1));
		}
		else {
		 	totalCombinations += n + (a1-a2);
		}
		System.out.println(totalCombinations);
		if(a2 < a3) totalCombinations += a3 - a2;
		else totalCombinations += (n-a2) + a3;
		System.out.println(totalCombinations);
		return totalCombinations;
	}

}