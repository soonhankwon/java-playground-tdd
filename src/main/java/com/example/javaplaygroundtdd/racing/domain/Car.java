package com.example.javaplaygroundtdd.racing.domain;

import com.example.javaplaygroundtdd.racing.utils.StringUtils;

public class Car {
    private static final int FORWARD_NUM = 4;
    private static final int MAX_BOUND = 10;

    private final String name;
    private int position = 0;

    public Car(final String name) {
        if (StringUtils.isBlank(name)) {
            throw new IllegalArgumentException("자동차 이름은 값이 존재해야 합니다.");
        }
        this.name = name.trim();
    }

    public int getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public void move(MovingStrategy movingStrategy) {
        if(movingStrategy.movable())
            this.position++;
    }

    public void move(int randomNo) {
        if(randomNo >= FORWARD_NUM)
            this.position++;
    }
}