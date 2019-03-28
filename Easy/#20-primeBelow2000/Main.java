import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		int limit = 2000;
		PrimeBelowN prim = new PrimeBelowN(limit);
		prim.calcPrimeValues();
		prim.printPrimeValues(); 
	}
}

class PrimeBelowN {
	private int limit, flag;
	private ArrayList<Integer> arrOfPrimeValues = new ArrayList<Integer>();

	public PrimeBelowN(int limit) {
		this.limit = limit;
	}

	public void calcPrimeValues() {
		arrOfPrimeValues.add(new Integer(2));
		for(int i=3; i<2000; i++) {
			flag = 0;
			for(int j=2; j<=i/2; j++) {
				if(i%j==0) {
					flag = 1;
					break;
				}
			}
			if(flag == 0) {
				arrOfPrimeValues.add(new Integer(i));
			}

		}
	}

	public void printPrimeValues() {
		for(int i=0; i<arrOfPrimeValues.size(); i++) {
			System.out.print(arrOfPrimeValues.get(i)+"\t");
		}
	}
}