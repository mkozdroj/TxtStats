package org.example;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {


    String filePath = "src/main/resources/emptyInput.txt";
    FileReadProvider fileReadProvider = new FileReadProvider();

    // Use the readByBuffer method
    String content = fileReadProvider.readByBuffer(filePath);
        System.out.println("File content:");
    System.out.println(content);
    // Check if content is not null
//        if (content != null) {
//    System.out.println("File content:");
//    System.out.println(content);
//} else {
//    System.out.println("Failed to read the file.");
//}
}
}
