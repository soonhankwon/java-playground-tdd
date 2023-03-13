package com.example.javaplaygroundtdd.racing;

import java.util.Scanner;

public class RacingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        scanner.nextLine();
        System.out.println("시도할 회수는 몇회인가요?");
        scanner.nextInt();
        System.out.println("실행 결과");
    }
}
