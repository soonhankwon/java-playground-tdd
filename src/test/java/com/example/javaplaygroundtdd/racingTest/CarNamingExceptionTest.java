package com.example.javaplaygroundtdd.racingTest;

import com.example.javaplaygroundtdd.racing.Car;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CarNamingExceptionTest {
    @Test
    void 자동차이름_5자초과_에러테스트() {
        assertThatThrownBy(() -> new Car("error_car"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
