package com.example.game;

public class Velocity {
    private Speed speed;
    private Direction direction;
    private Speed speedX;
    private Speed speedY;

    public Velocity() {
        this(new Speed(0), new Direction(0));
    }

    public Velocity(Speed speed, Direction direction) {
        setSpeed(speed);
        setDirection(direction);
    }

    public Speed getSpeed() {
        return speed;
    }

    public Speed getSpeedX() {
        return speedX;
    }

    public Speed getSpeedY() {
        return speedY;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setSpeed(Speed speed) {
        if (speed.getValue() < 0) throw new IllegalArgumentException("Speed must be non-negative.");
        this.speed = speed;
        updateComponents();
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
        updateComponents();
    }

    public void reverse() {
        direction.reverse();
        updateComponents();
    }

    public void reverseX() {
        direction.reverseX();
        updateComponents();
    }

    public void reverseY() {
        direction.reverseY();
        updateComponents();
    }

    private void updateComponents() {
        double radians = Math.toRadians(direction.getDegrees());
        int vx = (int) Math.round(speed.getValue() * Math.cos(radians));
        int vy = (int) Math.round(speed.getValue() * Math.sin(radians));
        this.speedX = new Speed(vx);
        this.speedY = new Speed(vy);
    }
}
