import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=0; i<3; i++) {
			arr.add(scanner.nextInt());
		}
		SumOfSquares sos = new SumOfSquares(arr);
		sos.findTwoLargeNumbers();

	}
}

class SumOfSquares {
	private ArrayList<Integer> arr;
	private ArrayList<Integer> maxArr = new ArrayList<Integer>();

	public SumOfSquares(ArrayList<Integer> arr) {
		this.arr = new ArrayList<Integer>(arr);
	}

	public void findTwoLargeNumbers() {
		int count = 2;
		if(arr.get(0) > arr.get(1) || arr.get(0) > arr.get(2)) {
			maxArr.add(arr.get(0));
			count --;
		}
		if(arr.get(1) > arr.get(0) || arr.get(1) > arr.get(2)) {
			maxArr.add(arr.get(1));
			count --;
		}
		if(count>0) {
			maxArr.add(arr.get(2));
		}
		int result = maxArr.get(0) * maxArr.get(0) + maxArr.get(1) * maxArr.get(1);
		System.out.println("Sum of the squares of two large number is: "+result);
	}

}