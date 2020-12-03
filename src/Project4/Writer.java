package Project4;

import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    private FileWriter writer;

    public Writer(String fileName) {
        try {
            writer = new FileWriter(fileName);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeData(String data) throws IOException {
        writer.write(data);
        writer.close();

    }
}
