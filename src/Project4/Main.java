package Project4;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String dir = "C:\\Users\\janderson\\Desktop\\filesDemo\\";

        File myFile = new File(dir+"myFile.csv");
        Parser parser = new Parser(myFile);
        double data = parser.findAverage();

        Writer writer = new Writer(dir+"output.csv");
        writer.writeData(Double.toString(data));


    }
}
