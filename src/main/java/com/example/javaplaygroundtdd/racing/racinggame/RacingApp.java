package com.example.javaplaygroundtdd.racing.racinggame;

import com.example.javaplaygroundtdd.racing.domain.Car;
import com.example.javaplaygroundtdd.racing.domain.Cars;
import com.example.javaplaygroundtdd.racing.domain.RacingGame;

import java.util.List;
import java.util.Scanner;

import static com.example.javaplaygroundtdd.racing.view.ResultView.printWinners;

public class RacingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String cars = scanner.nextLine();

        System.out.println("시도할 회수는 몇회인가요?");
        int tryNo = scanner.nextInt();

        RacingGame racingGame = new RacingGame(cars, tryNo);
        System.out.println("실행 결과");
        for(int i = 0; i < tryNo; i++) {
            racingGame.race();
            System.out.println();
        }
        List<Car> winnerList = new Cars(racingGame.getCars()).findWinners();
        printWinners(winnerList);
    }
}
