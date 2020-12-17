package Project4;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String dir = "C:\\Users\\janderson\\Documents\\IB CS Portfolio\\janderPortfolio\\src\\Project4\\";

        File myFile = new File(dir+"unsorted.csv");
        Parser parser = new Parser(myFile);
        String[] sortedArray = parser.sortAscending();

        Writer writer = new Writer(dir+"output.csv");
        writer.writeArrayData(sortedArray);


    }
}
