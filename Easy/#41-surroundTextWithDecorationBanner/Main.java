import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the text you want to be decorated:");
		String text = scanner.nextLine();
		DecorateText dt = new DecorateText(text);
		dt.decorate();
	}
}

class DecorateText {
	private String text;
	private int len, depth;

	public DecorateText(String text) {
		this.text = text;
	}

	private void calcDepth() {
		len = text.length();
		if(len <= 26) {
			depth = 1;
		} else {
			depth = 2;
		}
	}

	public void decorate() {
		calcDepth();
		System.out.println("********************************");
		for(int i=1; i<=depth; i++) {
			System.out.println("*                              *");
		}
		System.out.println("*  "+text.substring(0,26)+"  *");
		System.out.println("*  "+text.substring(26)+"  *");
		for(int i=1; i<=depth; i++) {
			System.out.println("*                              *");
		}
		System.out.println("********************************");

	}
}