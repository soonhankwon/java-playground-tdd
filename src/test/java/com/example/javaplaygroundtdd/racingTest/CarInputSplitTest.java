package com.example.javaplaygroundtdd.racingTest;

import com.example.javaplaygroundtdd.racing.Car;
import com.example.javaplaygroundtdd.racing.InputSpliter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CarInputSplitTest {
    @Test
    @DisplayName("자동차 이름은 쉼표(,)를 기준으로 구분 테스트")
    void InputSplit() {
        String input = "pobi,crong,honux";
        List<Car> list = InputSpliter.split(input);
        assertThat(list.get(0).getName()).isEqualTo("pobi");
    }
}
