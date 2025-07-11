package com.example.game;

public class Speed {
    private int value;

    public Speed(int value) {
        if (value < 0) throw new IllegalArgumentException("Speed must be non-negative.");
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
