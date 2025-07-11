package com.example.game;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class VelocityTest {

    @Test
    public void testDefaultConstructor() {
        Velocity velocity = new Velocity();
        assertEquals(0, velocity.getSpeed().getValue());
        assertEquals(0, velocity.getDirection().getDegrees());
    }

    @Test
    public void testSetSpeedAndDirection() {
        Velocity velocity = new Velocity(new Speed(10), new Direction(0));
        assertEquals(10, velocity.getSpeedX().getValue());
        assertEquals(0, velocity.getSpeedY().getValue());
    }

    @Test
    public void testReverse() {
        Velocity velocity = new Velocity(new Speed(5), new Direction(90));
        velocity.reverse();
        assertEquals(270, velocity.getDirection().getDegrees());
    }

    @Test
    public void testReverseX() {
        Velocity velocity = new Velocity(new Speed(5), new Direction(30));
        velocity.reverseX();
        assertEquals(150, velocity.getDirection().getDegrees()); // (540 - 30) % 360 = 150
    }

    @Test
    public void testReverseY() {
        Velocity velocity = new Velocity(new Speed(5), new Direction(120));
        velocity.reverseY();
        assertEquals(240, velocity.getDirection().getDegrees()); // 360 - 120 = 240
    }
}
