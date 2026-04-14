package com.github.zipcodewilmington;

/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
public class WordGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Word Guess!");
    
    while (true) {
        System.out.print("Guess a letter: ");
        String letterToGuess = scanner.nextLine();
        
        if (userGuess.equalsIgnoreCase(letterToGuess)) {
            System.out.println("Congratulations! You've guessed the word!");
            break;
        } else {
            System.out.println("Wrong guess. Try again!");
        }
}
