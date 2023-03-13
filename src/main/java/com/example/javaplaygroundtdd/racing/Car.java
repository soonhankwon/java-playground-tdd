package com.example.javaplaygroundtdd.racing;

public class Car {
    public static final int MAX_LENGTH_NAME = 5;
    private String name;

    public Car(String name) {
        if(name.length() > MAX_LENGTH_NAME)
            throw new IllegalArgumentException();
        this.name = name;
    }
}
