package Project4;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

/** A Class to read in a file and parse through its data
 *
 *@author Josh Anderson 12/3/2020
 *@version 1.1
 */

public class Parser {
    //instance variables
    public Scanner scanner;
    int numValues=13;
    public String[] unsortedValues = new String[numValues];

    public Parser(File file) {
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("file was not found");
            e.printStackTrace();
        }
        readDataIntoArray();
    }

    public void readDataIntoArray(){
        for (int i = 0; i < numValues; i++) {
            unsortedValues[i]=scanner.next();
            //System.out.println(unsortedValues[i].toString());
        }
    }

    public String[] sortAscending(){

        BubbleSorter bs = new BubbleSorter();
        return bs.sort(unsortedValues);

    }


}
