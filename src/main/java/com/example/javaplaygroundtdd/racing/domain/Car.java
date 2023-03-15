package com.example.javaplaygroundtdd.racing.domain;

import java.util.Objects;

public class Car {
    private final Name name;
    private Position position;

    public Car(final String name) {
        this(name, 0);
    }

    public Car(String name, int position) {
        this.name = new Name(name);
        this.position = new Position(position);
    }

    public Position getPosition() {
        return this.position;
    }
    public Name getName() {
        return this.name;
    }

    public void move(MovingStrategy movingStrategy) {
        if(movingStrategy.movable())
            position.move();
    }

    public boolean isWinner(int maxPosition) {
        return position.isSame(maxPosition);
    }

    public Position getMaxPosition(Position maxPosition) {
        if(position.lessThan(maxPosition)) {
            return maxPosition;
        }
        return this.getPosition();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(position, car.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name=" + name +
                ", position=" + position +
                '}';
    }

}