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
/**
 * 
 * @author archana
 *
 */
public class ExitCarTest {

	@Test
	public void test() {
		Parking parking = new Parking(10);
		parking.enterCarParking();
		parking.enterCarParking();
		parking.exitCarParking(3);
		
		ParkingReport report = parking.getParkingReport();
		assertNotNull(report);
	       
		assertEquals(1, report.getParkingCars());
	    assertEquals(1, report.getCarsExited());
	    assertEquals(9, report.getSpacesAvailable());
	    assertEquals(6, report.getFeesPaid());
       
		
	}
	
	/**
	 * Test parking lot with 10 spaces
	 * @throws IOException
	 */
	@Test
	public void test1() throws IOException {
		
		Parking parking = new Parking(10);
		parking.enterCarParking();
		parking.enterCarParking();
		parking.exitCarParking(3);
		parking.exitCarParking(3);
		
		ParkingReport report = parking.getParkingReport();

        // assert statements
		assertNotNull(report);
	       
		assertEquals(0, report.getParkingCars());
	    assertEquals(2, report.getCarsExited());
	    assertEquals(10, report.getSpacesAvailable());
	    assertEquals(12, report.getFeesPaid());
	}
	

}
