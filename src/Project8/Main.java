package Project8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        String dir = "C:\\Users\\janderson\\IdeaProjects\\IBCompSciPortfolio\\src\\Project8\\numbers.csv";

        File myFile = new File(dir);
        Scanner scanner = null;
        try {
            scanner = new Scanner(myFile);
        } catch (FileNotFoundException e) {
            System.out.println("file was not found");
            e.printStackTrace();
        }

        while(scanner.hasNext()){
            System.out.println(scanner.next());

        }


    }
}
