package org.example;

public class TextStatisticService implements TextStatisticRepository{

    @Override
    public int getCharacterCountWithWhiteSpace(String text) {
        int counter = text.replaceAll("[\n\r]+", "").length();
        return counter;
    }

    @Override
    public int getWordsCount() {
        return 0;
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
