package com.example.javaplaygroundtdd.racingTest;

import com.example.javaplaygroundtdd.racing.Car;
import com.example.javaplaygroundtdd.racing.WinnerValidator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class WinnerTest {
    @Test
    @DisplayName("순위 검증 테스트")
    void validateWinner() {
        List<Car> list = Arrays.asList(new Car("pobi"), new Car("crong"), new Car("honux"));
        list.get(0).setLocation(5);
        list.get(1).setLocation(3);
        list.get(2).setLocation(2);

        WinnerValidator winnerValidator = new WinnerValidator();
        List<Car> winners = winnerValidator.validateWinner(list);
        assertThat(winners.get(0).getName()).isEqualTo("pobi");
    }

    @Test
    @DisplayName("공동 우승 테스트")
    void validateTwoWinner() {
        List<Car> list = Arrays.asList(new Car("pobi"), new Car("crong"), new Car("honux"));
        list.get(0).setLocation(5);
        list.get(1).setLocation(5);
        list.get(2).setLocation(2);

        WinnerValidator winnerValidator = new WinnerValidator();
        List<Car> winners = winnerValidator.validateWinner(list);
        assertThat(winners.get(0).getName()).isEqualTo("pobi");
        assertThat(winners.get(1).getName()).isEqualTo("crong");
        assertThat(winners.size()).isEqualTo(2);
    }

}
