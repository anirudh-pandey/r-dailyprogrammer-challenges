import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the string: ");
		String[] arr = scanner.nextLine().split("");
		System.out.println(detectParanthesis(arr));
	}

	public static int detectParanthesis(String[] arr) {
		HashMap<String, Integer> map = new HashMap<>();
		LinkedList<Integer> list = new LinkedList<>();
		map.put("(", 0);
		map.put(")", 0);
		int i=0;
		while(i<arr.length) {
			if(arr[i].equals("(")) {
				map.put(arr[i], (map.get(arr[i])+1) );
				list.add(i);
				i++;
			} else if(arr[i].equals(")")) {	
				if(map.get("(")>0) {
					map.put("(", (map.get("(")-1) );
					list.remove(0);
					i++;
				} else {
					return i;
				}
			} else {
				i++;
			}
		}
		if(map.get("(")>0) {
			return list.get(0);
		} else {
			return arr.length;
		}
	}
}