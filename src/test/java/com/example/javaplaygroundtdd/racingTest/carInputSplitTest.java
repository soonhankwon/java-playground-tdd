package com.example.javaplaygroundtdd.racingTest;

import com.example.javaplaygroundtdd.racing.Car;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class carInputSplitTest {
    @Test
    @DisplayName("자동차 Input split 테스트 리스트로 리턴")
    void InputSplit() {
        String input = "pobi,crong,honux";
        Car car = new Car();
        List<Car> list = car.split(input);
        assertThat(list.get(0).getName()).isEqualTo("pobi");
    }
}
