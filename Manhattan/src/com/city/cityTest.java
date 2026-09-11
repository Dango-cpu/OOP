package com.city;

import static org.junit.Assert.*;

import org.junit.Test;

@SuppressWarnings("unused")
public class cityTest {

	@Test
	public void test() {
		Location shoplocation1 = new Location("Vo Van Ngan", 1);
		Location museumlocation1 = new Location("Le Van Viet", 484);
		Time shopWorkingHour = new Time(8,30);
		Empty empty = new Empty();
		Items itemList = new Items("Co ca ngua", empty);
		Shop shop1 = new Shop(shoplocation1, "Shop1", itemList, shopWorkingHour);
		Museum museum1 = new Museum(museumlocation1, "Sieu Viet", 90000);
	}

}
