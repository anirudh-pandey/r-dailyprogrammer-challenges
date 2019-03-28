import java.io.*;
import java.io.File;
// import java.io.FileNotFoundException;
public class Main {
	public static void main(String[] args) {
		Count cl = new Count();
		// cl.countLines();
		cl.countWords();
	}
}

class Count {
	private File file;

	public Count() {
		file = new File("file.txt");
	}

	public void countLines() {
		try {
			int count = 0;
			BufferedReader buffer = new BufferedReader(new FileReader(file));
			while(buffer.readLine() != null) {
				count++;
				// System.out.println(count);
			}
			System.out.println("Total number of lines: "+count);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

	// public void countWords() {
	// 	try {
	// 		int count = 0;
	// 		String[] str[0] = "a";
	// 		BufferedReader buffer = new BufferedReader(new FileReader(file));
	// 		FileInputStream reader = new FileInputStream(file);
 //   	        byte[] bytesArray = new byte[(int)file.length()];
 //   	        reader.read(bytesArray);
 //   	        String s = new String(bytesArray);
	// 		while(buffer.readLine() != null) {
 //   	        	str = s.split(" ");
	// 		}
 //   	        for(int i=0; i<str.length; i++) {
 //   	        	count++;
	// 			System.out.println("Total number of words: "+count);
 //   	        }
	// 	} catch(IOException e) {
	// 		e.printStackTrace();
	// 	}
	// }
}