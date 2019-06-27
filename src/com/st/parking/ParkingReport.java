package com.st.parking;

/**
 * Its a plain pojo for holding the
 * data required to print the report
 * 
 * @author archana
 *
 */
public class ParkingReport {

	private int carsEntered = 0 ;
	private int trucksEntered = 0;
	private int carsExited = 0;
	private int trucksExited =0;
	private int parkingCars =0;
	private int parkingTrucks =0;
	private int spacesAvailable=0;
	private int feesPaid=0;
	
	public int getCarsEntered() {
		return carsEntered;
	}
	public void setCarsEntered(int carsEntered) {
		this.carsEntered = carsEntered;
	}
	public int getTrucksEntered() {
		return trucksEntered;
	}
	public void setTrucksEntered(int trucksEntered) {
		this.trucksEntered = trucksEntered;
	}
	public int getCarsExited() {
		return carsExited;
	}
	public void setCarsExited(int carsExited) {
		this.carsExited = carsExited;
	}
	public int getTrucksExited() {
		return trucksExited;
	}
	public void setTrucksExited(int trucksExited) {
		this.trucksExited = trucksExited;
	}
	public int getParkingCars() {
		return parkingCars;
	}
	public void setParkingCars(int parkingCars) {
		this.parkingCars = parkingCars;
	}
	public int getParkingTrucks() {
		return parkingTrucks;
	}
	public void setParkingTrucks(int parkingTrucks) {
		this.parkingTrucks = parkingTrucks;
	}
	public int getSpacesAvailable() {
		return spacesAvailable;
	}
	public void setSpacesAvailable(int spacesAvailable) {
		this.spacesAvailable = spacesAvailable;
	}
	public int getFeesPaid() {
		return feesPaid;
	}
	public void setFeesPaid(int feesPaid) {
		this.feesPaid = feesPaid;
	}
	
	

}
