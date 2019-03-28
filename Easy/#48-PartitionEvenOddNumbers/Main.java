import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the array:");
		int len = scanner.nextInt();
		Partition p = new Partition(len);
		p.divide();
	}
}

class Partition {
	private int[] arr;
	private int len;
	private String evenArr="", oddArr="  ";
	private	Scanner scanner = new Scanner(System.in);

	public Partition(int len) {
		this.len = len;
		arr = new int[this.len];
		for(int i=0; i<this.len; i++) {
			System.out.print("Enter number at position "+(i+1)+": ");
			arr[i] = scanner.nextInt();
			System.out.println();
		}
	}


	public void divide() {
		for(int i=0; i<len; i++) {
			if(arr[i] % 2 == 0) {
				evenArr = evenArr + String.valueOf(arr[i]) + " ";
			} else {
				oddArr = oddArr + String.valueOf(arr[i]) + " ";
			}
		}
		System.out.println("Even numbers prececding odd numbers look like:-");
		System.out.println(evenArr+oddArr);
	}
}