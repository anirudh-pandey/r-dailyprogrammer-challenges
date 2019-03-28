import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = scanner.nextInt();
		RightTriangle rt = new RightTriangle(n);
		rt.getRightTriangle();
	}
}

class RightTriangle {
	private int limit, row = 1, count = 1, flag = 1, lastElement, mainRow;
	private ArrayList<Integer> numArr, dupArr;

	public RightTriangle(int n) {
		this.limit = n;
		numArr = new ArrayList<Integer>();
	}

	public void getRightTriangle() {
		while(flag == 1) {
			for(int i=0; i<row; i++) {
				numArr.add(count);
				count++;
				if(count > limit) {
					flag = 0;
					break;
				}
			}
			if(flag == 1){
				lastElement = numArr.get(row-1);
				mainRow = row;
			} 
			if(flag == 0) {
				print(lastElement, mainRow);
				break;
			}

			numArr.clear();
			row++;
		}
	}

	private void print(int lastElement, int row) {
		dupArr = new ArrayList<Integer>();
		while(row != 0) {
			int[] arr = new int[row];
			for(int i=0; i<row; i++) {
				dupArr.add(lastElement);
				lastElement--;

			}
			Collections.reverse(dupArr);
			System.out.print(dupArr);
			dupArr.clear();
			System.out.println();
			row--;

		}
	} 
}
