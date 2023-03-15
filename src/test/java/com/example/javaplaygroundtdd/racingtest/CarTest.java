package com.example.javaplaygroundtdd.racingtest;

import com.example.javaplaygroundtdd.racing.domain.Car;
import com.example.javaplaygroundtdd.racing.domain.MovingStrategy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarTest {
    @Test
    @DisplayName("자동차 이동 테스트")
    public void move() {
        Car car = new Car("pobi");
        car.move(() -> true);
        assertThat(car.getPosition().getPosition()).isEqualTo(1);
    }

    @Test
    @DisplayName("자동차 정지 테스트")
    public void stop() {
        Car car = new Car("pobi");
        car.move(() -> false);
        assertThat(car.getPosition().getPosition()).isEqualTo(0);
    }
}
