package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextStatisticService implements TextStatisticRepository {
    public TextStatisticService() {
    }


    @Override
    public int getCharacterCountWithoutSpace(String text) {
        //int counter = text.replaceAll("[\\s\r]+", "").length();
        int counter = text.replaceAll("[\\s\r]+", "").length();
        return counter;
    }


    @Override
    public int getWordsCount(String text) {
        if (text.isBlank()) {
            return 0;
        }
        // int counter = text.split("\\s\n").length;
        int counter = text.split("\\w+(-\\w+)*").length - 1;
        //  int counter = text.split("(?!.\\.)\\W").length;
        return counter;
    }

    //TODO - removing new line in the last element of array
    @Override
    public int getNumberOfSentences(String text) {
       text = text.replaceAll("[\\n]+", "");;
        String[] sentences = text.split("([.!?])([\\n\\s])([A-Z]*)");
        for (String sentence : sentences) {
            sentence = sentence.replaceAll("[\\s\\n]+", "");
        }
        int counter = sentences.length;

//        String pattern = "([.!?])([\\s\\n])([A-Z]*)";
//
//        Pattern r = Pattern.compile(pattern);
//        Matcher m = r.matcher(text);
//        int counter = 0;
//        while (m.find()) {
//            counter++;
//        }
        return counter;
    }

    @Override
    public double getAverageWordsPerSentence(String text) {
        try {
            double averageWordPerSentence = (double) getWordsCount(text) / getNumberOfSentences(text);
            return averageWordPerSentence;
        } catch (Exception e) {
            System.out.println("There's no sentences");
        }
        return 0.0;
    }

    @Override
    public int getCharactersCountWithoutSpaceAndPunctuation(String text) {
        int counter = text.replaceAll("[\\s\\p{Punct}]+", "").length();
        return counter;

    }


    @Override
    public double getAverageNumberCharactersPerWord(String text) {

        double averageNumberCharactersPerWord = (double) getCharactersCountWithoutSpaceAndPunctuation(text) / getWordsCount(text);
        return averageNumberCharactersPerWord;
    }

    @Override
    public int getNumberOfLine(String text) {
        int counter = text.split("\r\n|\r|\n").length;
        return counter;
    }

    @Override
    public String getTheLongestWord(String text) {
        String[] words = text.split("[!._,'@?\\s\n]");
        String theLongestWord = " ";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= theLongestWord.length()) {
                theLongestWord = words[i];
            }
        }
        return theLongestWord;
    }


    @Override
    public double getAverageWordLength(String text) {
        double averageWordLength = (double) getCharacterCountWithoutSpace(text) / getWordsCount(text);
        return averageWordLength;
    }

    @Override
    public String getTheLongestSentence(String text) {
        String[] sentences = text.split("([.!?])([\\s\\n])([A-Z]*)");
        String longestSentence = "";
        int maxLength = 0;

        for (String sentence : sentences) {
            if (sentence.length() > maxLength) {
                maxLength = sentence.length();
                longestSentence = sentence;
            }
        }
        return longestSentence;
    }
}
