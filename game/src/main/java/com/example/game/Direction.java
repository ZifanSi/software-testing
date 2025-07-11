package com.example.game;

public class Direction {
    private int degrees;

    public Direction(int degrees) {
        this.degrees = normalize(degrees);
    }

    public int getDegrees() {
        return degrees;
    }

    public void reverse() {
        degrees = normalize(degrees + 180);
    }

    public void reverseX() {
        degrees = normalize(540 - degrees);
    }

    public void reverseY() {
        degrees = normalize(360 - degrees);
    }

    private int normalize(int d) {
        return ((d % 360) + 360) % 360;
    }
}
