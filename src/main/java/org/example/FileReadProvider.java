package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadProvider {

    public FileReadProvider() {
    }

    public String readByBuffer(String path) {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            return readTxtFileToString(reader);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String readTxtFileToString(BufferedReader reader) throws IOException {
        StringBuilder content = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            content.append(line);
            content.append(System.lineSeparator());
        }

        return content.toString();
    }
}