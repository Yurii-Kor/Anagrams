package ua.foxminded.Anagrams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final String greetings = "\nHello! Enter a sentence to make an anagram or empty string to exit\n";

    public static void main(String[] args) {
        Anagrams anagramsMaker = new Anagrams();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            while (true) {
                System.out.println(greetings);
                String inputSentence = reader.readLine();

                if (!inputSentence.isEmpty()) {
                    System.out.println(anagramsMaker.makeAnagram(inputSentence) + "\n");
                }

                else {
                    System.out.println("Exiting...");
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}