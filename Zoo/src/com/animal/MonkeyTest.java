package com.animal;

import static org.junit.Assert.*;

import org.junit.Test;

public class MonkeyTest {

    @Test
    public void testLionCreationAndGetters() {
        Monkey monkey = new Monkey("George", 180.5, "Mango");
        assertNotNull("Can't be Null!", monkey);
        assertEquals("George", monkey.name);
        assertEquals(180.5, monkey.weight, 0.001);
        String expectedMeatString = "Favourite Food: Mango";
        assertEquals(expectedMeatString, monkey.getFavouriteFood());
    }
}
