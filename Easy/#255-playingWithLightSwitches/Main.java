import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the total no. of values:-");
		int n = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter the range:");



		LightSwitch ls = new LightSwitch(n);
		ls.startSwitching();

		// ls.hello();
	}
}

class LightSwitch {
	private int n, range1, range2, count;
	private ArrayList<String> list; 
	private ArrayList<Integer> rangeList; 
	private Scanner scanner;

	public LightSwitch(int n1) {
		scanner = new Scanner(System.in);
				// File file = new File("file.txt");
				// try {
				// 	Scanner scanner = new Scanner(file);
				// } catch (Exception e) {
  				//	System.out.println(e.getClass());
				// }
		this.n = n1;
		list = new ArrayList<String>();
		for(int i=0; i<n; i++) {
			list.add("0");
		}
	}
	



	public void startSwitching() {
			// ArrayList<Integer> list; 
		boolean loop = true;
		while(loop) {
			String s = scanner.nextLine();
			if(s.equals("")) {
				break;
			} else {
				String[] newS = s.split(" "); 
				rangeList = new ArrayList<Integer>();
				// for(int i=0; i<2; i++) {
					// if(i==0) {
						range1 = Integer.parseInt(newS[0]);
					// } else {
						range2 = Integer.parseInt(newS[1]);
					// }
				// }
				switchingBegin(range1, range2);
			}
		}
		finalCount();
		// for(int i=0; i<list.size(); i++) {
		// 	if(list.get(i) == "1") {
		// 		counter++;
		// 	}
		// }
		// System.out.println("Total count is: "+counter);
	}



		// int counter = 0;
		// for(int i=range1; i<range2; i++) {
		// 	if(list.get(i) == "0") {
		// 		list.set(i, "1");
		// 	} else {
		// 		list.set(i, "0");
		// 	}
		// }
		// for(int i=0; i<list.size(); i++) {
		// 	if(list.get(i) == "1") {
		// 		counter++;
		// 	}
		// }
		// System.out.println("Total count is: "+counter);




	private void switchingBegin(int range1, int range2) {
		if(range1<=range2) {
			for(int i=range1; i<=range2; i++) {
				if(list.get(i).equals("0")) {
					list.set(i, "1");
				} else {
					list.set(i, "0");
				}
			}
		} else {
			for(int i=range1; i>=range2; i--) {
				if(list.get(i).equals("0")) {
					list.set(i, "1");
				} else {
					list.set(i, "0");
				}
			}
		}
		
	}


	private void finalCount() {
		int counter = 0;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i) == "1") {
				counter++;
			}
		}
		System.out.println("Total count is: "+counter);
	}


}