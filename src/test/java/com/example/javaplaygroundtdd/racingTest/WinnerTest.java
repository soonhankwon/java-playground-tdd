package com.example.javaplaygroundtdd.racingTest;

import com.example.javaplaygroundtdd.racing.Car;
import com.example.javaplaygroundtdd.racing.WinnerValidator;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class WinnerTest {
    @Test
    @DisplayName("순위 검증 테스트")
    void validateWinner() {
        List<Car> list = Arrays.asList(new Car("pobi"), new Car("crong"), new Car("honux"));
        list.get(0).setLocation(5);
        list.get(1).setLocation(3);
        list.get(2).setLocation(2);

        WinnerValidator winnerValidator = new WinnerValidator();
        List<Car> winner = winnerValidator.validateWinner(list);
        Assertions.assertThat(winner.get(0).getName()).isEqualTo("pobi");
    }
}
