package com.example.javaplaygroundtdd.racing;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WinnerValidator {
    public List<Car> validateWinner(List<Car> list) {
        List<Car> winners = new ArrayList<>();
        int winnerLocation = Car.MIN_LOCATION;
        for(Car car : list) {
            if(car.getLocation() > winnerLocation) {
                winnerLocation = car.getLocation();
                winners.clear();
                winners.add(car);
            }
            else if(car.getLocation() == winnerLocation) {
                winners.add(car);
            }
        }
        return winners;
    }
}
