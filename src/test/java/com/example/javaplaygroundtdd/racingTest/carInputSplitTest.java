package com.example.javaplaygroundtdd.racingTest;

import com.example.javaplaygroundtdd.racing.Car;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class carInputSplitTest {
    @Test
    @DisplayName("자동차 이름은 쉼표(,)를 기준으로 구분 테스트")
    void InputSplit() {
        String input = "pobi,crong,honux";
        Car car = new Car();
        List<Car> list = car.split(input);
        assertThat(list.get(0).getName()).isEqualTo("pobi");
    }
}
