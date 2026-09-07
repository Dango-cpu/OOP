package com.report;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
public class RecordTest {
	public void test() {
		Date date1 = new Date(10, 10, 1996);
		TemperatureRange range1 = new TemperatureRange(28, 39);
		Empty a1 = new Empty();
		Date date2 = new Date(5, 9, 2026);
		TemperatureRange range2 = new TemperatureRange(4, 18);
		WeatherRecords rec1 = new WeatherRecords(date1, range1, range2, range1, 12.6);
		WeatherRecords rec2 = new WeatherRecords(date2, range2, range1, range2, 12.6);
		
		Const loga2 = new Const(rec1, a1);
		Const loga3 = new Const(rec2, loga2);
		
		assertEquals(range2, rec1.getNormal()); 

        // Assert standard integer and string values
        assertEquals(range2, rec2.getToday());
        assertEquals(12.6, rec1.getPrecipitation(), 0.001);
        
        
        assertNotNull(loga3.rest);
        assertEquals(loga2, loga3.rest);
	}
}