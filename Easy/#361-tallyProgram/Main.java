import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the players: ");
		String players = scanner.nextLine();
		Players pl = new Players(players);		
		System.out.println("Enter the scores: ");
		String scores = scanner.nextLine();
		pl.updateScores(scores);
	}
}

class Players {
	private char[] players, scores;
	private ArrayList<Character> playerName;
	private ArrayList<Integer> playerScores;

	public Players(String players) {
		this.players = players.toCharArray();
		playerName = new ArrayList<Character>();
		playerScores = new ArrayList<Integer>();
		for(int i=0; i<this.players.length; i++) {
			playerName.add(this.players[i]);
			playerScores.add(0);
		}

	}

	public void updateScores(String s) {
		scores = s.toCharArray();
		for(int i=0; i<scores.length; i++) {
			int asciiValue = scores[i];

			if(asciiValue >= 65 && asciiValue <= 90) {

				char val = Character.toLowerCase(scores[i]);
				if(playerName.contains(val)) {
					int index = playerName.indexOf(val);
					int scoreOfVal = playerScores.get(index); 
					scoreOfVal--;
					playerScores.set(index, scoreOfVal);
				} else {
					System.out.println("Invalid input entered. No such player detected");
					break;
				}

			} else if(asciiValue >= 97 && asciiValue <=122) {
				if(playerName.contains(scores[i])) {
					int index = playerName.indexOf(scores[i]);
					int scoreOfVal = playerScores.get(index); 
					scoreOfVal++;
					playerScores.set(index, scoreOfVal);
				} else {
					System.out.println("Invalid input entered. No such player detected");
					break;
				}
			}
		}

		for (int i=0; i<playerName.size(); i++) {
			System.out.print(playerName.get(i)+" : "+playerScores.get(i)+"\t");
		}
	}
}