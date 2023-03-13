package com.example.javaplaygroundtdd.racingTest;

import com.example.javaplaygroundtdd.racing.Car;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class carMovingTest {
    @Test
    @DisplayName("자동차 전진 테스트")
    void move() {
        int result = 5;
        Car car = new Car("pobi");
        car.move(result);
        car.move(result);
        car.move(result);
        assertThat(car.getLocation()).isEqualTo(3);
    }

    @Test
    @DisplayName("전진하는 자동차를 출력할 때 자동차 이름을 같이 출력")
    void moveAndPrint() {
        int result = 5;
        Car car = new Car("pobi");
        car.move(result);
        car.move(result);
        car.move(result);
        System.out.println(car.getLocation());
        car.printLocation();
    }
}
