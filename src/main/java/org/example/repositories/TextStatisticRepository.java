package org.example.repositories;

public interface TextStatisticRepository {

    int getCharacterCountWithoutSpace(String text);
    int getWordsCount(String text);
    int getNumberOfSentences(String text);
    double getAverageWordsPerSentence(String text);
    double getAverageNumberCharactersPerWord(String text);
    int getNumberOfLine(String text);
    String getTheLongestWord(String text);
    double getAverageWordLength(String text);
    int getCharactersCountWithoutSpaceAndPunctuation(String text);
    String getTheLongestSentence(String text);
}
