package Project42;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Parser {
    public Scanner scanner;

    public Parser(File f) {
        try {
            scanner = new Scanner(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void printData(){
        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }
    }

}
