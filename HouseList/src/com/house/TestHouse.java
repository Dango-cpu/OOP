package com.house;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestHouse {
	
	@Test
	public void test() {
		Address address1 = new Address(124, "Le Van Viet", "Thu Duc");
		Address address2 = new Address(1, "Vo Van Ngan", "Thu Duc");
		Entry e1 = new Entry("Cab", 5, 136000, address1);
		Empty a1 = new Empty();
		Entry e2 = new Entry("Two_Stories", 16, 36000000, address2);
		
		ConstHouse loga2 = new ConstHouse(e1, a1);
		ConstHouse loga3 = new ConstHouse(e2, loga2);
		
		assertEquals(5, e1.getNumRooms()); 
        assertEquals(136000, e1.getPrice(), 0.0001);
        assertEquals(address1, e1.getAddress());
        
        assertNotNull(loga3.rest);
        assertEquals(loga2, loga3.rest);
	}

}