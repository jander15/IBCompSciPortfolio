package Project42;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    FileWriter writer;

    public Writer(String location) {
        try {
            writer = new FileWriter(location);
        }
        catch (IOException e){
            System.out.println("an error occurred");
            e.printStackTrace();
        }

    }

    public void writeData(String data) throws IOException {
        try {
            writer.write(data);
            writer.close();
            System.out.println("File updated");
        }
        catch (IOException e){
            System.out.println("An error occurred");
            e.printStackTrace();
        }
    }



}
