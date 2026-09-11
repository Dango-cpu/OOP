package com.train;

import static org.junit.Assert.*;

import org.junit.Test;

public class ScheduleTest {

	@Test
	public void test() {
		
		Empty empty = new Empty();
		Cons localStopList = new Cons("Vo Van Ngan", empty);
		Cons localStopList1 = new Cons("Le Van Viet", localStopList);
		Cons expressStopList = new Cons("Dong Nai",empty);
		Cons expressStopList1 = new Cons("Vung Tau",expressStopList);
		
        Schedule localSchedule = new Schedule(
                "Ga Sài Gòn", new Time(6, 0), 
                "Ga Nha Trang", new Time(14, 30), 
                localStopList1, new LocalTrain()
            );
        
        Schedule expressSchedule = new Schedule(
                "Ga Sài Gòn", new Time(20, 0), 
                "Ga Hà Nội", new Time(11, 15), 
                expressStopList1, new ExpressTrain()
            );
	}

}
