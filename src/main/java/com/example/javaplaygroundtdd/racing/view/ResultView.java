package com.example.javaplaygroundtdd.racing.view;

import com.example.javaplaygroundtdd.racing.domain.Car;
import com.example.javaplaygroundtdd.racing.domain.Name;

import java.util.List;

public class ResultView {
    private static final String distanceExpression = "-";
    public static void printResult(Car car) {
        Name name = car.getName();
        String position = distanceExpression.repeat(car.getPosition().getPosition());
        System.out.println(name + " : " + position);
    }

    public static void printWinners(List<Car> winnerList) {
        StringBuilder sb = new StringBuilder();
        for(Car winner : winnerList) {
            sb.append(winner.getName());
            if(winnerList.size() > 1 && winner != winnerList.get(winnerList.size() - 1)) {
                sb.append(",");
            }
        }
        System.out.println(sb + "가 최종 우승했습니다.");
    }
}
