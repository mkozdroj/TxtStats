package org.example;

public class TextStatisticService implements TextStatisticRepository{

    @Override
    public int getCharacterCountWithoutWhiteSpace(String text) {
        int counter = text.replaceAll("[\n\r]+", "").length();
        return counter;
    }

    @Override
    public int getWordsCount(String text) {
        if(text.isBlank()){
            return 0;
        }
        int counter = text.split("\\s\n").length;
        return counter;
    }


    @Override
    public int getNumberOfSentences() {
        return 0;
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
    public int getNumberOfLine() {
        return 0;
    }

    @Override
    public int getTheLongestWord() {
        return 0;
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
