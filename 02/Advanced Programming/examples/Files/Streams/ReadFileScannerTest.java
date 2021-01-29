package streams;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFileScannerTest {

	public static void main(String[] args) throws IOException {
		FileReader fileReader = new FileReader("input.txt");
		Scanner inputScanner = new Scanner(fileReader);

		while (inputScanner.hasNext())
			System.out.print(inputScanner.next());
		inputScanner.close();
		fileReader.close();
	}
}