package com.example.javaplaygroundtdd.racing.domain;

import java.util.Objects;

public class Position {
    private int position;

    public Position() {
        this(0);
    }

    public Position(int position) {
        if(position < 0) {
            throw new IllegalArgumentException("position은 음수 값을 가질 수 없습니다.");
        }
        this.position = position;
    }

    public void move() {
        position = position + 1;
    }
    public int getPosition() {
        return this.position;
    }

    public boolean isSame(int maxPosition) {
        return this.position == maxPosition;
    }

    public boolean lessThan(Position maxPosition) {
        return this.position < maxPosition.position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position1 = (Position) o;
        return position == position1.position;
    }
    @Override
    public int hashCode() {
        return Objects.hash(position);
    }
}
