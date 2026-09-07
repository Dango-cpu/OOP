package com.animal;

import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeTest {

    @Test
    public void testSnakeCreationAndGetters() {
        Snake snake = new Snake("Shisha", 180.5, 10.0);
        assertNotNull("Can't be Null!", snake);
        assertEquals("George", snake.name);
        assertEquals(180.5, snake.weight, 0.001);
        String expectedMeatString = "Length: 10.0";
        assertEquals(expectedMeatString, snake.getLength());
    }
}