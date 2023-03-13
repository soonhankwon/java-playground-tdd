package com.example.javaplaygroundtdd.racing;

public class Car {
    public static final int MAX_LENGTH_NAME = 5;
    public static final int MIN_LOCATION = 0;
    private final String name;
    private int location;

    public Car(String name) {
        if (name.length() > MAX_LENGTH_NAME)
            throw new IllegalArgumentException();
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getLocation() {
        return this.location;
    }

    public void setLocation(int location) {
        if (location < MIN_LOCATION) {
            throw new IllegalArgumentException();
        }
        this.location = location;
    }

    public void move() {
        setLocation(this.location + 1);
    }

    public void printLocation() {
        String str = "-".repeat(Math.max(0, getLocation()));
        System.out.println(getName() + " : " + str);
    }

    public void play() {
        int random = (int) (Math.random() * 9) + 1;
        if (random >= 4)
            move();
        printLocation();
    }
}