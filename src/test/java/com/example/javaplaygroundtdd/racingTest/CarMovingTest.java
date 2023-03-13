package com.example.javaplaygroundtdd.racingTest;

import com.example.javaplaygroundtdd.racing.Car;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarMovingTest {
    @Test
    @DisplayName("자동차 전진 테스트")
    void move() {
        Car car = new Car("pobi");
        car.move();
        car.move();
        car.move();
        assertThat(car.getLocation()).isEqualTo(3);
    }

    @Test
    @DisplayName("전진하는 자동차를 출력할 때 자동차 이름을 같이 출력")
    void moveAndPrint() {
        Car car = new Car("pobi");
        car.move();
        car.move();
        car.move();
        System.out.println(car.getLocation());
        car.printLocation();
    }

    @Test
    @DisplayName("전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4이상일 경우")
    void moveCondition() {
        Car car = new Car("pobi");
        for(int i = 0; i < 10; i++) {
            car.play();
        }
    }

    @Test
    @DisplayName("여러대 게임 테스트")
    void moveMultiCars() {
        Car car = new Car("pobi");
        Car car2 = new Car("crong");
        Car car3 = new Car("honux");

        List<Car> carList = new ArrayList<>();
        carList.add(car);
        carList.add(car2);
        carList.add(car3);

        for(int i = 0; i < 5; i++) {
            for(Car c : carList) {
                c.play();
            }
        }
    }
}
