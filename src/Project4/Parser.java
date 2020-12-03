package Project4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/** A Class to read in a file and parse through its data
 *
 *@author Josh Anderson 12/3/2020
 *@version 1.1
 */

public class Parser {
    public Scanner scanner;

    public Parser(File file) {
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            System.out.println("file was not found");
            e.printStackTrace();
        }
    }

    /**
     * prints all data in the file
     */
    public void printData(){
        while(scanner.hasNext()){
            System.out.println(scanner.next());
        }
    }

    public double findAverage(){

        double sum=0;
        int i = 0;

        while(scanner.hasNext()){
            i++;
            sum+=Double.valueOf(scanner.next());
        }
        System.out.println(sum/i);
        return sum/i;
    }


}
