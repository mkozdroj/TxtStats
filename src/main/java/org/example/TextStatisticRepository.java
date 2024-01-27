package org.example;

public interface TextStatisticRepository {

    int getCharacterCountWithoutWhiteSpace(String text);
    int getWordsCount(String text);
    int getNumberOfSentences(String text);
    double getAverageWordsPerSentence(String text);
    int getAverageNumberOfCharacterPerWords();
    int getNumberOfLine(String text);
    String getTheLongestWord(String text);
    double getAverageWordLength(String text);
    int getTheLongestSentence();
}
