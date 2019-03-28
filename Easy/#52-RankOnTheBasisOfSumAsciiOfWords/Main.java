import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the total number of words:");
		int totalWords = scanner.nextInt();
		Words w = new Words(totalWords); 
		w.getAsciiValues();
		w.sort();
	}
}

class Words {
	private int totalWords, sum;
	private char[] singularWord;
	private ArrayList<String> wordsList;
	private Scanner scanner = new Scanner(System.in);
	private HashMap<Integer, String> map;
	private TreeMap<Integer, String> sorted;

	public Words(int totalWords) {
		this.totalWords = totalWords;
		wordsList = new ArrayList<String>();
		for(int i=0; i<totalWords; i++) {
			wordsList.add(scanner.next().toLowerCase());
		} 
		map = new HashMap<>();
	}

	public void getAsciiValues() {
		for(int i=0; i<totalWords; i++) {
			sum = 0;
			singularWord = wordsList.get(i).toCharArray();
			for(int j=0; j<singularWord.length; j++) {
				sum = sum + ((int)singularWord[j] - 96);
			}
			System.out.println(wordsList.get(i)+" -> length:- "+sum);
			map.put(sum, wordsList.get(i));

		}
	}

	public void sort() {
		sorted = new TreeMap<>();
		sorted.putAll(map);

		System.out.println("------Sorted by value of words:------");
		//The below for loop is a foreach based on treemap as in above step we enter all hash
		//-map values in tree map where value is stored according to keys
		//and then we display the values of 'entry' map i.e..., sorted by keys that are the 
		//ascii values calculated.
		for(Map.Entry<Integer, String> entry : sorted.entrySet()) {
			System.out.print(entry.getValue() + " ");
		}

	}

} 