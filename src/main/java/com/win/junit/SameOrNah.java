package com.win.junit;

import java.util.Scanner;

public class SameOrNah {
    public static void main(String[] args) {
        System.out.println("Enter any word: ");
        String firstWord = inputWord();
        System.out.println("Enter another word: ");
        String secondWord = inputWord();

        System.out.println(checkIfWordsAreTheSasme(firstWord, secondWord));
    }

    public static String inputWord() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static String checkIfWordsAreTheSasme(String firstWord, String secondWord) {
        if (firstWord.equals(secondWord)) {
            return "The words are the same.";
        } else {
            return "The words are different.";
        }
    }
}
