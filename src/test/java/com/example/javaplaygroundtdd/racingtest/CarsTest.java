package com.example.javaplaygroundtdd.racingtest;

import com.example.javaplaygroundtdd.racing.domain.Car;
import com.example.javaplaygroundtdd.racing.domain.Cars;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarsTest {
    @Test
    void findWinners() {
        Car pobi = new Car("pobi", 4);
        Car crong = new Car("crong", 4);
        Car honux = new Car("honux", 3);

        List<Car> original = Arrays.asList(pobi, crong, honux);
        Cars cars = new Cars(original);
        assertThat(cars.findWinners()).containsExactly(pobi,crong);
    }
}
