package org.example;

public interface TextStatisticRepository {

    int getCharacterCountWithoutWhiteSpace(String text);
    int getWordsCount(String text);
    int getNumberOfSentences();
    double getAverageWordsPerSentence();
    int getAverageNumberOfCharacterPerWords();
    int getNumberOfLine();
    int getTheLongestWord();
    double getAverageWordLength();
    int getTheLongestSentence();
}
