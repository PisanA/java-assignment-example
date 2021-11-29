import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class TextFile {
	private ArrayList<String> lines;
	
	public TextFile(String filename) throws FileNotFoundException {
		lines = new ArrayList<String>();
		Scanner scan = new Scanner(new File(filename));
		while (scan.hasNextLine()) {
			lines.add(scan.nextLine());
		}
		scan.close();
	}
	
	public String getLine(int line) {
		return lines.get(line - 1);
	}
}
