package streams;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteFilePrintWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("output2.txt");
        PrintWriter out = new PrintWriter(fileWriter);
        
        out.println("This is some text.");
        out.print("This is the second line.");
        
        out.close();
        fileWriter.close();
    }
}
