package com.st.test;


import static org.junit.Assert.*;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.Test;

import com.st.main.TestCarParking;
import com.st.parking.Parking;
import com.st.parking.ParkingReport;
/***
 * This test class tests exited cars and trucks count.
 * @author archana
 *
 */
public class ExitTruckTest {

	@Test
	public void test() {
		Parking parking = new Parking(10);
		parking.enterTruckParking();
		parking.enterTruckParking();
		parking.enterTruckParking();
		parking.exitTruckParking(3);
		
		ParkingReport report = parking.getParkingReport();
		assertNotNull(report);
	       
		assertEquals(2, report.getParkingTrucks());
	    assertEquals(1, report.getTrucksExited());
	    assertEquals(6, report.getSpacesAvailable());
	    assertEquals(9, report.getFeesPaid());
		
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
		parking.enterTruckParking();
		parking.exitTruckParking(3);
		parking.exitTruckParking(3);
		
		ParkingReport report = parking.getParkingReport();

        // check all trucks exited using below assert statements
		assertNotNull(report);
	       
		assertEquals(1, report.getParkingTrucks());
	    assertEquals(2, report.getTrucksExited());
	    assertEquals(8, report.getSpacesAvailable());
	    assertEquals(18, report.getFeesPaid());
		
       
	}
	

}
