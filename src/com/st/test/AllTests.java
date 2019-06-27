package com.st.test;
/**
 * This class has the test suite of all the 
 * test cases used in the car simulation testing.
 */
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	CarNTruckParkingTest.class ,
	CheckTotalFeesTest.class ,
	EnterCarTest.class ,
	EnterTruckTest.class ,
	ExitCarTest.class ,
	ExitTruckTest.class ,
	ParkingReportTest.class,
	})
public class AllTests {

}
