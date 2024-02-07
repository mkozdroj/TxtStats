package org.example;

import org.example.providers.FileReadProvider;
import org.example.services.TextStatisticService;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {


        String filePath = "src/main/resources/input.txt";
        FileReadProvider fileReadProvider = new FileReadProvider();

        // Use the readByBuffer method
        String content = fileReadProvider.readByBuffer(filePath);
        System.out.println("File content:");
        System.out.println(content);

        TextStatisticService stats = new TextStatisticService();
        System.out.println("Number of chcaracters:");
        System.out.println(stats.getCharacterCountWithoutSpace(content));
        System.out.println("");

        System.out.println("Number of words:");
        System.out.println(stats.getWordsCount(content));
        System.out.println("");

        System.out.println("Number of sentences:");
        System.out.println(stats.getNumberOfSentences(content));
        System.out.println("");

        System.out.println("Number of lines:");
        System.out.println(stats.getNumberOfLine(content));
        System.out.println("");

        System.out.println("The longest word");
        System.out.println(stats.getTheLongestWord(content));
        System.out.println("");

        System.out.println("The average word length");
        System.out.println(stats.getAverageWordLength(content));
        System.out.println("");

        System.out.println("The average number of words per sentence");
        System.out.println(stats.getAverageWordsPerSentence(content));
        System.out.println("");

        System.out.println("The average number of characters per word");
        System.out.println(stats.getAverageNumberCharactersPerWord(content));
        System.out.println("");

        System.out.println("The longest sentence");
        System.out.println(stats.getTheLongestSentence(content));
        System.out.println("");


        // Check if content is not null
//        if (content != null) {
//    System.out.println("File content:");
//    System.out.println(content);
//} else {
//    System.out.println("Failed to read the file.");
//}
    }
}
