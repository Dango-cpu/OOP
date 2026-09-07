package com.Book;

import static org.junit.Assert.*;

import org.junit.Test;

public class BookTest {
	
	@Test
	public void test() {
		Entry e1 = new Entry("Chi Pheo", "Van Cao", 46000, 1995);
		Empty a1 = new Empty();
		Entry e2 = new Entry("Thuy Kieu", "Nguyen Du", 35000, 1994);
		
		ConstBook loga2 = new ConstBook(e1, a1);
		ConstBook loga3 = new ConstBook(e2, loga2);
		
		assertEquals(46000, e1.getPrice(), 0.001); 

        // Assert standard integer and string values
        assertEquals(35000, e2.getPrice(), 0.001);
        assertEquals("Van Cao", e1.getAuthorName());
        
        // Verify the Date object was assigned correctly
        
        assertNotNull(loga3.rest);
        assertEquals(loga2, loga3.rest);
	}

}