package com.example.game;

import org.junit.Test;
import static org.junit.Assert.*;

public class SpeedTest {

    @Test
    public void testPositiveSpeed() {
        Speed speed = new Speed(10);
        assertEquals(10, speed.getValue());
    }

    @Test
    public void testZeroSpeed() {
        Speed speed = new Speed(0);
        assertEquals(0, speed.getValue());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeSpeedThrowsException() {
        new Speed(-5);
    }
}
