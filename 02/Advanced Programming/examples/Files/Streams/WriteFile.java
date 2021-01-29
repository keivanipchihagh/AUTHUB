package streams;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("output.txt");

        fileWriter.write("This is a text! Is it?");

        fileWriter.close();
    }
}
