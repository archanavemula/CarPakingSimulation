package com.st.test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.io.IOException;
import org.junit.Test;
import com.st.parking.Parking;
import com.st.parking.ParkingReport;

/**
 * This class will test whether the number 
 * of cars parked is correct.
 * 
 * @author archana
 *
 */
public class EnterTruckTest {

	@Test
	public void test() {
		
		Parking parking = new Parking(10);
		parking.enterTruckParking();
		parking.enterTruckParking();
		parking.enterTruckParking();
			
		ParkingReport report = parking.getParkingReport();
		
		assertNotNull(report);
		assertEquals(3, report.getParkingTrucks());
		assertEquals(4, report.getSpacesAvailable());     
		
	}
	
	/**
	 * Test parking lot with 10 spaces
	 * @throws IOException
	 */
	@Test
	public void test1() throws IOException {
		
		Parking parking = new Parking(10);
		parking.enterTruckParking();

		
		ParkingReport report = parking.getParkingReport();

        // assert statements
		assertNotNull(report);
		assertEquals(1, report.getParkingTrucks());
		assertEquals(8, report.getSpacesAvailable());
     
	}
	

}
