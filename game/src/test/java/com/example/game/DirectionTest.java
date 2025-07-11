package com.example.game;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class DirectionTest {

    @Test
    public void testNormalizationPositiveAngle() {
        Direction direction = new Direction(450);
        assertEquals(90, direction.getDegrees());
    }

    @Test
    public void testNormalizationNegativeAngle() {
        Direction direction = new Direction(-30);
        assertEquals(330, direction.getDegrees());
    }

    @Test
    public void testReverse() {
        Direction direction = new Direction(90);
        direction.reverse();
        assertEquals(270, direction.getDegrees());
    }

    @Test
    public void testReverseX() {
        Direction direction = new Direction(60);
        direction.reverseX();
        assertEquals(120, direction.getDegrees()); // (540 - 60) % 360 = 120
    }

    @Test
    public void testReverseY() {
        Direction direction = new Direction(45);
        direction.reverseY();
        assertEquals(315, direction.getDegrees()); // (360 - 45) = 315
    }
}
