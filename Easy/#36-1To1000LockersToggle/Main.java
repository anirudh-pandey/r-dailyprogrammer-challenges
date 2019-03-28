import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		Lockers lock = new Lockers();
		lock.toggleLockers();
		lock.printArr();
	}
}

class Lockers {
	private ArrayList<Integer> arr;
	private int locker, index;
	private boolean isThere;
	private String lockVal, value;


	public Lockers()  {
		arr = new ArrayList<Integer>();
		// for (int i=1; i<=50; i++) {
		// 	value = String.valueOf(i);
		// 	arr.add(value);
		// }
	}

	public void toggleLockers() {

		for(int i=1; i<=1000; i++) {
			for(int j=1; j<=1000; j++) {
				int locker = i*j;
				if(locker <= 1000) {
					isThere = arr.contains(locker);
					if(isThere) {
						index = arr.indexOf(locker);
						// System.out.println(index);
						arr.remove(index);
					} else {
						arr.add(locker);
					}
				}
			}
		}
	}

	public void printArr() {
		System.out.println("=============Values are=============");
		for (int i=0; i<arr.size(); i++) {
			System.out.print(arr.get(i)+" ");
		}
	}
}