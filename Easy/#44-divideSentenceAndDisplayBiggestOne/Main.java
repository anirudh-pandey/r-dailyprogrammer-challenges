import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the whole input text:");
		String text = scanner.nextLine();
		Sentence sentence = new Sentence(text);
		sentence.circulate();
	}
}

class Sentence {
	private char[] sentence;
	private int maxLength, count=1, letterCount;
	private String maxArr, minArr="", wordArr, mainWordArr, mainWordResultArr; 


	public Sentence(String sentence) {
		this.sentence = sentence.toCharArray();
	}

	public void circulate() {
		for(int i=0; i<sentence.length; i++) {
			if(sentence[i] == '?' || sentence[i] == '!' || sentence[i] == '.') {
				minArr = minArr + String.valueOf(sentence[i]);
				count++;
				if(count > maxLength) {
					maxLength = count;
					count = 0;
					maxArr = minArr;
					minArr = "";

					//word with < 4 letters
					mainWordResultArr = mainWordArr;
					mainWordArr = "";
					wordArr = "";
					letterCount = 0;
				} else {
					count = 0;
					minArr = "";

					//word with < 4 letters
					mainWordArr = "";
					wordArr = "";
					letterCount = 0;
				}
			} else if(sentence[i] == ' '){
				minArr = minArr + String.valueOf(sentence[i]);
				count++;

				//word with < 4 letters
				if(letterCount <= 4){
					mainWordArr = mainWordArr + wordArr;
					mainWordArr = mainWordArr + " ";
					wordArr = "";
					letterCount = 0;
				} else {
					wordArr = "";
					letterCount = 0;
				}

			} else {
				minArr = minArr + String.valueOf(sentence[i]);

				//word with < 4 letters
				letterCount++;
				wordArr = wordArr + String.valueOf(sentence[i]);
			}
		}
		printMaxArray();
	}

	private void printMaxArray() {
		System.out.println();
		
		System.out.println("Sentence with most words: " + maxArr);

		System.out.println("Total count of words: " + maxLength);

		System.out.println("Words with letters <= 4: " + mainWordResultArr);
	}
}