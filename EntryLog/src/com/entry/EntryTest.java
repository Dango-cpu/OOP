package com.entry;

import static org.junit.Assert.*;

import org.junit.Test;

public class EntryTest {
	
	@Test
	public void test() {
		Date date1 = new Date(10, 10, 1996);
		Entry e1 = new Entry(date1, 8.2, 136, "tired");
		EmptyLog a1 = new EmptyLog();
		Date date2 = new Date(5, 9, 2026);
		Entry e2 = new Entry(date2, 10, 15, "super human");
		
		ConstLog loga2 = new ConstLog(e1, a1);
		ConstLog loga3 = new ConstLog(e2, loga2);
		
		assertEquals(8.2, e1.getDist(), 0.001); 

        // Assert standard integer and string values
        assertEquals(15, e2.getDur());
        assertEquals("tired", e1.getPostRunFeeling());
        
        // Verify the Date object was assigned correctly
        assertNotNull(e1.getDate());
        assertEquals(date1, e1.getDate());
        
        assertNotNull(loga3.rest);
        assertEquals(loga2, loga3.rest);
	}

}
