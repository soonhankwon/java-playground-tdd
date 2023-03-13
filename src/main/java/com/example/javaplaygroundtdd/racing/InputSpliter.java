package com.example.javaplaygroundtdd.racing;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputSpliter {
    public static List<Car> split(String input) {
        return Arrays.stream(input.split(","))
                .map(Car::new)
                .collect(Collectors.toList());
    }
}
