import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] mainString = scanner.nextLine().split("");
		String[] stringToBeRemoved = scanner.nextLine().split("");
		removeString(mainString, stringToBeRemoved);
	}


	public static void removeString(String[] mainString, String[] stringToBeRemoved) {
		LinkedList<String> list = new LinkedList<>();
		for(int i=0; i<mainString.length; i++) {	
			list.add(mainString[i]);
		}
		for(int i=0; i<stringToBeRemoved.length; i++) {
			while(list.contains(stringToBeRemoved[i])) {
				list.remove(stringToBeRemoved[i]);
			}
		}
 		System.out.print("After string removal: ");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i));
		}
	} 
}

