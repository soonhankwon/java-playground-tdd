package com.example.javaplaygroundtdd.racing;

import java.util.List;

public class ResultView {
    public static void printResult(List<Car> list) {
        WinnerValidator winnerValidator = new WinnerValidator();
        StringBuilder sb = new StringBuilder();
        List<Car> winners = winnerValidator.validateWinner(list);
        for (Car c : winners) {
            sb.append(c.getName());
            if (winners.size() > 1 && c != winners.get(winners.size() - 1)) {
                sb.append(",");
            }
        }
        System.out.println(sb + "가 최종 우승했습니다.");
    }
}
