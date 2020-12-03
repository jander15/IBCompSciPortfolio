package Project42;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\janderson\\Desktop\\filesDemo\\myFile.csv");
        Parser parser = new Parser(file);
        parser.printData();

        Writer writer = new Writer("C:\\Users\\janderson\\Desktop\\filesDemo\\myNewFile.csv");
        writer.writeData("What's up!");


    }
}
