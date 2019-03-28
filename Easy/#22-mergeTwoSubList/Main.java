import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);		
		int limit1 = 4, limit2 = 5;
		ArrayList<String> firstHalfOfArr = new ArrayList<String>();
		System.out.println("Enter 1st list");
		for (int i=0; i<limit1; i++) {
			firstHalfOfArr.add(scanner.nextLine());
		}
		System.out.println("Enter 2nd list");
		ArrayList<String> otherHalfOfArr = new ArrayList<String>();
		for (int i=0; i<limit1; i++) {
			otherHalfOfArr.add(scanner.nextLine());
		}
		MergeLists mer = new MergeLists(firstHalfOfArr, otherHalfOfArr);
		mer.merge();
		mer.printMainList();

	}
}

class MergeLists {
	private ArrayList<String> firstHalfOfArr, otherHalfOfArr;
	private ArrayList<String> mainArr = new ArrayList<String>();


	public MergeLists(ArrayList<String> firstHalf, ArrayList<String> otherHalf) {
		this.firstHalfOfArr = new ArrayList<String>(firstHalf);
		this.otherHalfOfArr = new ArrayList<String>(otherHalf);
	}

	public void merge() {
		for (int i=0; i<firstHalfOfArr.size(); i++) {
			mainArr.add(firstHalfOfArr.get(i));
		}
		for (int i=0; i<otherHalfOfArr.size(); i++) {
			mainArr.add(otherHalfOfArr.get(i));
		}
	}

	public void printMainList() {
		System.out.println("After merging the list is:");
		for(int i=0; i<mainArr.size(); i++) {
			System.out.print(mainArr.get(i)+" ");
		}
	}
}