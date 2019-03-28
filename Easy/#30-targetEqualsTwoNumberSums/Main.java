import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many values do you want in the list?");
		int limit = scanner.nextInt();
		scanner.nextLine();
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("Enter the values of list");
		for(int i=0; i<limit; i++) {
			list.add(Integer.valueOf(scanner.nextInt()));
		}
		scanner.nextLine();
		System.out.println("Enter the target value");
		int targetValue = scanner.nextInt();
		scanner.nextLine();
		Target t = new Target(targetValue, list);
		t.print();
	}
}

class Target {
	private ArrayList<Integer> list, mainList = new ArrayList<Integer>();
	private int targetValue;

	public Target(int targetValue, ArrayList<Integer> list) {
		this.targetValue = targetValue;
		this.list = new ArrayList<Integer>(list);
	}


	private void getMainList() {
		for(int i=0; i<list.size(); i++) {
			if(list.get(i) <= targetValue) {
				mainList.add(list.get(i));
			}
		}
	}

	public void print() {
		getMainList();
		for(int i=0; i<mainList.size(); i++) {
			for(int j=i; j<mainList.size(); j++) {
				if(j == i) {
					continue;
				} else if(mainList.get(i) + mainList.get(j) == targetValue) {
					System.out.println("Result: "+ mainList.get(i) + " + " 
						+ mainList.get(j) + " = " + targetValue);
					return;
				}
			}
		}
		System.out.println("None of the value in the list sum "+ 
			"up to give the target value");
	}
}