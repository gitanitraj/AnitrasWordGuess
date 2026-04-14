package com.github.zipcodewilmington;

import java.util.Scanner;

public class WordGuess {
    static String[] wordList = { "magical", "dainty", "maerl", "signal"};
    static char[] solution;
    static char[] playerGuesses;
    static int triesLeft;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String playAgain = "yes";

        while (playAgain.equals("yes")) {
            setupGame();
            playGame();
            System.out.print("Play again? (yes/no) ");
            playAgain = scanner.nextLine().toLowerCase();
        }
        System.out.println("Game Over!");
        scanner.close();

    }
    public static void setupGame() {
        String word = pickRandomWord();
        solution = word.toCharArray();
        playerGuesses = buildEmptyGuesses(solution.length);
        triesLeft = solution.length;
        System.out.println("Let's Play Wordguess game");
        }
    
    public static String pickRandomWord() {
        int index = (int) (Math.random() * wordList.length);
        return wordList[index];    
    }

    public static char[] buildEmptyGuesses(int length) {
        char[] guesses = new char[length];
        for (int i = 0; i < length; i++) {
            guesses[i] = '_';
            }
            return guesses;
        }

    public static void playGame(){

        }
       
}

