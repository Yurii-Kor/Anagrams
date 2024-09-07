package ua.foxminded.Anagrams;

import java.util.ArrayList;
import java.util.List;

public class Anagrams {
    private static final String NULL_INPUT_ERROR = "Input string can not be null";
    private static final char SPACE = ' ';

    public String makeAnagram(String sentence) {
        if (sentence == null) {
            throw new IllegalArgumentException(NULL_INPUT_ERROR);
        }
        
        String[] words = splitSentenceToWords(sentence);

        for (int i = 0; i < words.length; i++) {
            words[i] = reverseLettersInWord(words[i]);
        }

        return String.join(Character.toString(SPACE), words);
    }
    
    private String[] splitSentenceToWords(String sentence) {
        List<String> words = new ArrayList<>();
        StringBuilder currentWord = new StringBuilder();

        for (char ch : sentence.toCharArray()) {
            if (ch == SPACE) {
                words.add(currentWord.toString());
                currentWord.setLength(0);
            } else {
                currentWord.append(ch);
            }
        }
        words.add(currentWord.toString());

        return words.toArray(new String[0]);
    }

    private String reverseLettersInWord(String word) {
        if (word.contains(Character.toString(SPACE)) || word.isEmpty()) {
            return word;
        }

        char[] symbolsInWord = word.toCharArray();
        int currentLetterPosition = 0;
        int reverseLetterPosition = symbolsInWord.length - 1;

        while (currentLetterPosition < reverseLetterPosition) {
            if (!Character.isLetter(symbolsInWord[currentLetterPosition])) {
                currentLetterPosition++;
            } else if (!Character.isLetter(symbolsInWord[reverseLetterPosition])) {
                reverseLetterPosition--;
            } else {
                swapElements(symbolsInWord, currentLetterPosition, reverseLetterPosition);
                currentLetterPosition++;
                reverseLetterPosition--;
            }
        }

        return new String(symbolsInWord);
    }

    private void swapElements(char[] word, int current, int reverse) {
        char tmp = word[current];
        word[current] = word[reverse];
        word[reverse] = tmp;
    }

}
