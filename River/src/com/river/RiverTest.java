package com.river;

import static org.junit.Assert.*;

import org.junit.Test;

@SuppressWarnings("unused")
public class RiverTest {

	@Test
	public void test() {
		River r1 = new River(new Location(2, 5, "Dong Bang Song Hong"), new Confluence(new River(new Location(1, 1, "Cuu Long"), null), null));
		River r2 = new River(new Location(1, 3, "Dong Thap"), new Confluence(null, new River(new Location(0, 0, "Goc"), null)));
		River r3 = new River(new Location(0, 6, "Mianmar"), new Confluence(r1, r2));
		Empty empty = new Empty(null, null);
		
		org.junit.Assert.assertNotNull(r1);
		org.junit.Assert.assertNotNull(r2);
		org.junit.Assert.assertNotNull(r3);
		
		Const system1 = new Const(r1, r2, r1, empty);
		Const system2 = new Const(r1, r2, r3, system1);
		
		org.junit.Assert.assertNotNull(system1);
		org.junit.Assert.assertNotNull(system2);
	}

}

