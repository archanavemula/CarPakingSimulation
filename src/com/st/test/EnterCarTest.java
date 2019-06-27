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
public class EnterCarTest {

	@Test
	public void test() {
		Parking parking = new Parking(10);
		parking.enterCarParking();
		parking.enterCarParking();
		
		ParkingReport report = parking.getParkingReport();

        // assert statements
       //if(assertEquals(1, report.getParkingTrucks()))
    	//   else fail("Not yet implemented");
       assertEquals(2, report.getParkingCars());	
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
		parking.enterCarParking();
		
		ParkingReport report = parking.getParkingReport();

        // assert statements
       assertEquals(3, report.getParkingCars());
	}
	
	/**
	 * Test parking lot with 10 spaces
	 * @throws IOException
	 */
	@Test
	public void test2() throws IOException {
		
		Parking parking = new Parking(3);
		parking.enterCarParking();
		parking.enterCarParking();
		parking.enterCarParking();
		parking.enterCarParking();
		
		ParkingReport report = parking.getParkingReport();

        // assert statements
       assertEquals(3, report.getParkingCars());
	}

}
