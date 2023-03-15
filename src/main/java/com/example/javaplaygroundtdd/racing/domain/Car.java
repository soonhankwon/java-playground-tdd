package com.example.javaplaygroundtdd.racing.domain;

import com.example.javaplaygroundtdd.racing.utils.StringUtils;

public class Car {
    private static final int FORWARD_NUM = 4;
    private static final int MAX_BOUND = 10;

    private final Name name;
    private int position = 0;
    private Position position2;

    public Car(final String name) {
        this.name = new Name(name);
        this.position2 = new Position(0);
    }

    public int getPosition() {
        return position;
    }

    public void move(MovingStrategy movingStrategy) {
        if(movingStrategy.movable())
            position2 = position2.move();
    }

    public void move(int randomNo) {
        if(randomNo >= FORWARD_NUM)
            this.position++;
    }
}