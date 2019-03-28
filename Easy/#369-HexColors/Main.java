import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter red color:");
		int red = scanner.nextInt();
		System.out.print("Enter green color:");
		int green = scanner.nextInt();
		System.out.print("Enter blue color:");
		int blue = scanner.nextInt();
		HexColors hex = new HexColors(red, green, blue);
		hex.findColor();
	}
}

class HexColors {
	private ArrayList<Integer> colors; 
	private String finalColor;

	public HexColors(int red, int green, int blue) {
		colors = new ArrayList<Integer>();
		if(red<=255 && green<=255 && blue<=255) {
			colors.add(red);
			colors.add(green);
			colors.add(blue);
		} else {
			throw new IllegalArgumentException("Values of red||green||blue color exceeds"
				+"255");
		}		
	}

	public void findColor() {
		finalColor= "#";
		for(int i=0; i<3; i++) {
			int singleNumber = colors.get(i);
			int rem = singleNumber%16;
			singleNumber=singleNumber/16;
			finalColor = finalColor + getHexCode(singleNumber) + getHexCode(rem);
		}
		System.out.println("Color in hex code is: "+finalColor);
	}

	private String getHexCode(int value) {
		if(value >= 0 && value <= 9) {
			return Integer.toString(value);
		} else if(value==10) {
			return "A";
		} else if(value==11) {
			return "B";
		} else if(value==12) {
			return "C";
		} else if(value==13) {
			return "D";
		} else if(value==14) {
			return "E";
		} else if(value==15) {
			return "F";
		} else {
			throw new IllegalArgumentException("No hex code.");
		}
	}
 
	//----------------------BONUS:Color_Blending-------------------------
	// public void colorBlending(String hex1, String hex2) {

	// }
}