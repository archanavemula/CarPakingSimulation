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
public class ParkingReportTest {

	@Test
	public void test() {
		Parking parking = new Parking(10);
		parking.enterCarParking();
		parking.enterCarParking();
		parking.enterTruckParking();
		parking.exitCarParking(3);
		
		ParkingReport report = parking.getParkingReport();

        // assert statements

       assertEquals(1, report.getParkingCars());
       assertEquals(0, report.getTrucksExited());
       assertEquals(1, report.getParkingTrucks());
       assertEquals(1, report.getCarsExited());
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
		parking.enterTruckParking();
		parking.exitCarParking(3);
		
		ParkingReport report = parking.getParkingReport();

        // assert statements
       assertEquals(1, report.getParkingTrucks());
       assertEquals(1, report.getParkingCars());
       assertEquals(6, report.getFeesPaid());
	}
	

}
