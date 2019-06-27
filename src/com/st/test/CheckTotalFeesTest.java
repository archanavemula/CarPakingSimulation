package com.st.test;


import static org.junit.Assert.assertEquals;

import java.io.IOException;
import org.junit.Test;
import com.st.parking.Parking;
import com.st.parking.ParkingReport;
/**
 * This class tests the total fees of
 * cars parked and trucks parked in the lot.
 * 
 * @author archana
 *
 */
public class CheckTotalFeesTest {
	
	/**
	 * To do
	 */
	@Test
	public void test() {
		Parking parking = new Parking(10);
		parking.enterCarParking();
		parking.enterCarParking();
		parking.exitCarParking(3);
		
		ParkingReport report = parking.getParkingReport();

        // assert statements
       assertEquals(6, report.getFeesPaid());
       
		
	}
	
	/**
	 * Test parking lot with 10 spaces
	 * @throws IOException
	 */
	@Test
	public void test1() throws IOException {
		
		Parking parking = new Parking(10);
		parking.enterTruckParking();
		parking.enterTruckParking();
		parking.exitTruckParking(3);
		
		ParkingReport report = parking.getParkingReport();

        // assert statements
       assertEquals(9, report.getFeesPaid());
	}
	

}
