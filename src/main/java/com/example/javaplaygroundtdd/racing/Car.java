package com.example.javaplaygroundtdd.racing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Car {
    public static final int MAX_LENGTH_NAME = 5;
    private String name;
    private int location;

    public Car(String name) {
        if (name.length() > MAX_LENGTH_NAME)
            throw new IllegalArgumentException();
        this.name = name;
    }

    public Car() {

    }

    public List<Car> split(String input) {
        return Arrays.stream(input.split(","))
                .map(Car::new)
                .collect(Collectors.toList());
    }

    public String getName() {
        return this.name;
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public int getLocation() {
        return this.location;
    }

    public void move(int result) {
        if(result > 4) {
            setLocation(this.location + 1);
        }
    }

    public void printLocation() {
        String str = "-".repeat(Math.max(0, getLocation()));
        System.out.println(getName() + " : " + str);
    }
}
