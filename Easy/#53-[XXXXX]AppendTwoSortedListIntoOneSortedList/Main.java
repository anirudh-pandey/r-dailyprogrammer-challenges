import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of first list:");
		int size1 = scanner.nextInt();
		System.out.println("Enter the size of second list:");
		int size2 = scanner.nextInt();
		SortList sl = new SortList(size1, size2);
		sl.sort();
	}
}

class SortList {
	private int size1, size2, count;
	private ArrayList<Integer> list1, list2, finalList;
	private	Scanner scanner = new Scanner(System.in);


	public SortList(int size1, int size2) {
		this.size1 = size1;
		list1 = new ArrayList<Integer>();
		System.out.println("Enter the contents of list one:-");
		for(int i=0; i<size1; i++) {
			list1.add(scanner.nextInt());
		}
		this.size2 = size2;
		list2 = new ArrayList<Integer>();
		System.out.println("Enter the contents of list two:-");
		for(int i=0; i<size2; i++) {
			list2.add(scanner.nextInt());
		}
	}

	public void sort() {
		finalList = new ArrayList<Integer>();
		int i=0, j=0;
		while(i<size1) {
			System.out.println(i);
			while(j<size2) {
				System.out.println(j);
				if(list1.get(i) <= list2.get(j)) {
					finalList.add(list1.get(i));
					i++;
				} else {
					finalList.add(list2.get(j));
					j++;
				}
			}
		}
		System.out.println("hey");
	}
}