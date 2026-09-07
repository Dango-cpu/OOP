package com.animal;

import static org.junit.Assert.*;

import org.junit.Test;

public class LionTest {

    @Test
    public void testLionCreationAndGetters() {
        Lion lion = new Lion("Simba", 180.5, 5.5);
        
        assertNotNull("Đối tượng Lion không được null", lion);
        assertEquals("Simba", lion.name);
        assertEquals(180.5, lion.weight, 0.001);
        String expectedMeatString = "Meat per day: 5.5";
        assertEquals(expectedMeatString, lion.getMeatWeight());
    }
}