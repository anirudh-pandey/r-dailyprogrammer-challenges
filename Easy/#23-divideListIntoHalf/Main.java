import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<String>();
		int limit = 9;
		for(int i=0; i<limit; i++) {
			arr.add(scanner.nextLine());
		}	
		DivideListInHalf div = new DivideListInHalf(arr);
		div.divide();
		div.printSubLists();

	}
}

class DivideListInHalf {
private ArrayList<String> arr;
private ArrayList<String> firstHalfOfArr = new ArrayList<String>();
private ArrayList<String> otherHalfOfArr = new ArrayList<String>();

	public DivideListInHalf(ArrayList<String> arr) {
		this.arr = new ArrayList<String>(arr);
	}

	public void divide() {
		for(int i=0; i<arr.size()/2; i++) {
			firstHalfOfArr.add(arr.get(i));
		}
	
		for(int i=arr.size()/2; i<arr.size(); i++) {
			otherHalfOfArr.add(arr.get(i));
		}
	}

	public void printSubLists() {
		System.out.println("List One:");
		for(int i=0; i<firstHalfOfArr.size(); i++) {
			System.out.print(firstHalfOfArr.get(i)+"\t");
		}
		System.out.println();
		System.out.println("List Two:");
		for(int i=0; i<otherHalfOfArr.size(); i++) {
			System.out.print(otherHalfOfArr.get(i)+"\t");
		}
	}
}