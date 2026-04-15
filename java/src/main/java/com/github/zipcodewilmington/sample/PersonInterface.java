package com.github.zipcodewilmington.sample;

public interface PersonInterface {
    // Interface definition

    /**
     * Return the person's name
     */

    String getName();

    String getFirstName();

    void setFirstName(String firstName);

    String getLastName();

    void setLastName(String lastName);

    /**
     * Return the person's current score
     */

    int getScore();

    Integer getAge();

    void setAge(Integer age);

    @Override
    String toString();
}



