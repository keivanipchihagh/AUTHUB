package streams;

import java.io.FileReader;
import java.io.IOException;

public class ReadFileTest {

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("input.txt");
        
        int input;
        while ((input = fileReader.read()) != -1)
            System.out.print((char)input);
        fileReader.close();
    }
}
