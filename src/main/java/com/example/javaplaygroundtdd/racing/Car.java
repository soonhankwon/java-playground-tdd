package com.example.javaplaygroundtdd.racing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Car {
    public static final int MAX_LENGTH_NAME = 5;
    public static final int MIN_LOCATION = 0;
    private String name;
    private int location;

    public Car(String name) {
        if (name.length() > MAX_LENGTH_NAME)
            throw new IllegalArgumentException();
        this.name = name;
    }

    public Car() {
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

    public List<Car> split(String input) {
        return Arrays.stream(input.split(","))
                .map(Car::new)
                .collect(Collectors.toList());
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
