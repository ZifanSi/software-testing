package com.example.game;

public class Velocity {
    private int speed;    // overall speed
    private int speedX;   // speed in the x-direction
    private int speedY;   // speed in the y-direction
    private int direction; // angle in degrees (0 = east, 90 = north, etc.)

    // Default constructor
    public Velocity() {
        this.speed = 0;
        this.direction = 0;
        updateComponents();
    }

    // Parameterized constructor
    public Velocity(int speed, int direction) {
        this.speed = speed;
        this.direction = normalize(direction);
        updateComponents();
    }

    private int normalize(int angle) {
        angle = angle % 360;
        if (angle < 0) {
            angle += 360;
        }
        return angle;
    }

    private void updateComponents() {
        double rad = Math.toRadians(direction);
        this.speedX = (int)Math.round(speed * Math.cos(rad));
        this.speedY = (int)Math.round(speed * Math.sin(rad));
    }

    public int getSpeed() {
        return speed;
    }

    public int getSpeedX() {
        return speedX;
    }

    public int getSpeedY() {
        return speedY;
    }

    public int getDirection() {
        return direction;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
        updateComponents();
    }

    public void setDirection(int direction) {
        this.direction = normalize(direction);
        updateComponents();
    }

    public void reverse() {
        this.direction = normalize(this.direction + 180);
        updateComponents();
    }

    public void reverseX() {
        this.direction = normalize(180 - this.direction);
        updateComponents();
    }

    public void reverseY() {
        this.direction = normalize(360 - this.direction);
        updateComponents();
    }
}