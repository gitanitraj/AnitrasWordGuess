package com.github.zipcodewilmington.sample;

public class Person {
 
    private String name;
    private int score;
    private int gamesPlayed;
    private int gamesWon;
 
    public Person(String name) {
        this.name = name;
        this.score = 0;
    }

    public void updateScore(int points) {
        this.score += points;
    }


}