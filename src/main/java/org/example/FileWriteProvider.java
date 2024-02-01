package org.example;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class FileWriteProvider {
   FileWriter file;
    TextStatisticService textStats = new TextStatisticService();
    FileWriteProvider fileWriteProvider = new FileWriteProvider();

    {
        try {
            file = new FileWriter("textStats.txt");
            BufferedWriter buffer = new BufferedWriter(file);

            file.write("new line");
            System.out.println("buffer starts writing");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
