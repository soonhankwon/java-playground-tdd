package com.example.javaplaygroundtdd.racing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Car {
    public static final int MAX_LENGTH_NAME = 5;
    private String name;

    public Car(String name) {
        if(name.length() > MAX_LENGTH_NAME)
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
}
