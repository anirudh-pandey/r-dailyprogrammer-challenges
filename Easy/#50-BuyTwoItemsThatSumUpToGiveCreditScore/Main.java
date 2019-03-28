import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Credit score you got from the store:");
		int creditScore = scanner.nextInt();
		System.out.println("How many items there is in the list:");
		int totalItems = scanner.nextInt();
		Credit c = new Credit(creditScore, totalItems);
		c.determine();
	}
}

class Credit {
	private int creditScore, totalItems, flag=0;
	private ArrayList<Integer> itemsList;
	private Scanner scanner = new Scanner(System.in); 

	public Credit(int creditScore, int totalItems) {
		this.creditScore = creditScore;
		this.totalItems = totalItems;
		itemsList = new ArrayList<Integer>();
		System.out.println("Enter items in the list:");
		for (int i=0; i<totalItems; i++) {	
			itemsList.add(scanner.nextInt());
		}
	}

	public void determine() {
		for(int i=0; i<totalItems; i++) {
			for(int j=i; j<totalItems; j++) {
				int value1 = itemsList.get(i);
				int value2 = itemsList.get(j);
				if(creditScore == (value1+value2) && i!=j) {
					i++;
					j++;
					System.out.println(i+" "+j);
					flag = 1;
					break;
				}
			}
		}
		if(flag == 0) {
			System.out.println("No two items add up to give the amount of credit score.");
		}
	}


}