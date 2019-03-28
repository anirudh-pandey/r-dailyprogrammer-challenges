import java.util.*;
public class Main {
	public static void main(String[] args) {
		QnA qna = new QnA();
		qna.checkAnswers();
	}
}

class QnA {
	private String[] questionString, answerString;
	private int flag = 1;

	public QnA() {
		questionString = new String[] {"12*12", "What is reddit?", "who is the boss?",
		"What is Batman's real identity", "Best anime?", "best player?"};
		answerString = new String[] {"144", "info website", "Anirudh", "Bruce Wayne",
		"Naruto", "Eden hazard"};
	}

	private int askQuestion() {	
		Random rand = new Random();
		int n = rand.nextInt(6);
		switch(n) {
			case 0:System.out.println();
				  System.out.println(questionString[0]);
				  break;
			case 1:System.out.println();
				  System.out.println(questionString[1]);
				  break;
			case 2:System.out.println();
				  System.out.println(questionString[2]);
				  break;
			case 3:System.out.println();
				  System.out.println(questionString[3]);
				  break;
			case 4:System.out.println();
				  System.out.println(questionString[4]);
				  break;
			case 5:System.out.println();
				  System.out.println(questionString[5]);
		}
		return n;
	}

	public void checkAnswers() {
		Scanner scanner = new Scanner(System.in);
		while(flag == 1){
			int position = askQuestion();
			System.out.print("answer:- ");
			String ans = scanner.nextLine();
			if(ans.equals("exit")) {
				flag = 0;
			} else if(ans.equals(answerString[position])) {
				System.out.println("Correct answer.");
			} else {
				System.out.println("Wrong, Correct answer is: "+answerString[position]);
			}
		}
	}
}