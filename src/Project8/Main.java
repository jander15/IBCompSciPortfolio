package Project8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {

        String dir = "C:\\Users\\janderson\\Documents\\IBCompSciPortfolio\\src\\Project8\\";

        File myFile = new File(dir+"numbers.csv");
        Scanner scanner = null;

        FileWriter fw = null;
        try {
            fw = new FileWriter(dir+"averages.csv");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try {
            scanner = new Scanner(myFile);
        } catch (FileNotFoundException e) {
            System.out.println("file not found");
            throw new RuntimeException(e);
        }
        ArrayList<int[]> data = new ArrayList<>();

        while(scanner.hasNext()){
            String line = scanner.next();
            String[]  r = line.split(",");
            int[] row = new int[r.length];
            double sum=0;
            int n=0;
            for (int i = 0; i < row.length; i++) {
                row[i] = Integer.valueOf(r[i]);
                sum+=row[i];
                n++;
            }
            data.add(row);
            double average = sum/n;
            try {
                fw.write(Double.toString(average));
                fw.write("\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        fw.close();



    }
}
