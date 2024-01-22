package org.example;

public interface TextStatisticRepository {

    int getCharacterCountWithWhiteSpace(String text);
    int getWordsCount();
    int getNumberOfSentences();
    double getAverageWordsPerSentence();
    int getAverageNumberOfCharacterPerWords();
    int getNumberOfLine();
    int getTheLongestWord();
    double getAverageWordLength();
    int getTheLongestSentence();
}
