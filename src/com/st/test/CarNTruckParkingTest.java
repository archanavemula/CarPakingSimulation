package com.st.test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import org.junit.Test;
import com.st.parking.Parking;
import com.st.parking.ParkingReport;

/**
 * This test class test cases of both 
 * car and truck parked in the lot.
 * @author archana
 *
 */
public class CarNTruckParkingTest {
	
	/**
	 * Parking Lot with 10 car spaces
	 * 2 car entered  2 trucks entered
	 * 1 car exited
	 */
	@Test
	public void test() {
		Parking parking = new Parking(10);
		parking.enterCarParking();
		parking.enterCarParking();
		parking.enterTruckParking();
		parking.exitCarParking(3);
		
		ParkingReport report = parking.getParkingReport();

		// assert statements
		assertNotNull(report);
	       
		assertEquals(1, report.getParkingTrucks());
	    assertEquals(1, report.getParkingCars());
	    assertEquals(1, report.getCarsExited());
	    assertEquals(0, report.getTrucksExited());
	    assertEquals(7, report.getSpacesAvailable());
	    assertEquals(6, report.getFeesPaid());
	    
		
	}
	
	/**
	 * Test parking lot with 10 spaces
	 * 2 cars entered and 1 truck entered
	 * 1 car exited in 3 hours
	 * @throws IOException
	 */
	@Test
	public void test1() throws IOException {
		
		Parking parking = new Parking(10);
		parking.enterCarParking();
		parking.enterCarParking();
		parking.enterTruckParking();
		parking.enterTruckParking();
		parking.exitCarParking(3);
		parking.exitTruckParking(3);
		
		ParkingReport report = parking.getParkingReport();
		// assert statements
		assertNotNull(report);
	       
		assertEquals(1, report.getParkingTrucks());
	    assertEquals(1, report.getParkingCars());
	    assertEquals(1, report.getCarsExited());
	    assertEquals(1, report.getTrucksExited());
	    assertEquals(7, report.getSpacesAvailable());
	    assertEquals(15, report.getFeesPaid());
	    
        
       
	}
	

}
