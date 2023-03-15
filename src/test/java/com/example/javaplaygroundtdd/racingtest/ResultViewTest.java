package com.example.javaplaygroundtdd.racingtest;

import com.example.javaplaygroundtdd.racing.domain.RacingGame;
import org.junit.jupiter.api.Test;

public class ResultViewTest {
    @Test
    void resultPrint() {
        int tryNo = 5;
        String cars = "pobi,crong,honux";
        RacingGame racingGame = new RacingGame(cars, tryNo);
        for(int i = 0; i < tryNo; i++) {
            racingGame.race();
        }
    }
}
