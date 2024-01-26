package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextStatisticService implements TextStatisticRepository {

    @Override
    public int getCharacterCountWithoutWhiteSpace(String text) {
        int counter = text.replaceAll("[\n\r]+", "").length();
        return counter;
    }

    @Override
    public int getWordsCount(String text) {
        if (text.isBlank()) {
            return 0;
        }
        int counter = text.split("\\s\n").length;
        return counter;
    }


    @Override
    public int getNumberOfSentences(String text) {
        String pattern = "([.!?])([\\s\\n])([A-Z]*)";
        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(text);
        int counter = 0;
        while (m.find()) {
            counter++;
        }
        return counter;
    }

    @Override
    public double getAverageWordsPerSentence() {
        return 0;
    }

    @Override
    public int getAverageNumberOfCharacterPerWords() {
        return 0;
    }

    @Override
    public int getNumberOfLine(String text) {
        int counter = text.split("\r\n|\r|\n").length;
        return counter;
    }
//TODO
    @Override
    public String getTheLongestWord(String text) {
        String[] words = text.split("\\s\n");
        String theLongestWord = " ";
        for(int i = 0; i < words.length; i++){
            if(words[i].length() >= theLongestWord.length()){
                theLongestWord = words[i];
            }
        }
        return theLongestWord;
    }

    @Override
    public double getAverageWordLength() {
        return 0;
    }

    @Override
    public int getTheLongestSentence() {
        return 0;
    }
}
