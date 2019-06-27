package com.st.parking;
/**
 * This class has the logic for caluculating the
 * parking amount, slots ,cars n trucks
 * @author archana
 *
 */
public class Parking {

	int noOfSpaces = 0;
	ParkingReport report;
	
	public Parking(int spaces) {
		// TODO Auto-generated constructor stub
		noOfSpaces = spaces;
		report = new ParkingReport();
		report.setSpacesAvailable(noOfSpaces);
	}
	
	
	/***
	 * once car is entered add number of cars
	 * deduct number of slots to -1
	 * no change in fees
	 */
	public void enterCarParking(){
		
		if(report.getSpacesAvailable() >=1){
			
		//update cars entered
		int carsEntered = report.getCarsEntered() + 1;
		report.setCarsEntered(carsEntered);
		
		//no of slots available
		int spacesAvailable = report.getSpacesAvailable() - 1;
		report.setSpacesAvailable(spacesAvailable);
		
		//set parking cars
		int parkedCars = report.getCarsEntered() - report.getCarsExited();
		report.setParkingCars(parkedCars);
		}
		else
		{
			System.out.println("No Space Available now. Please try after sometime");
		}
	}
	
	/**
	* *once car is exited deduct from number of cars
	* add number of slots to +1
	* update total fees amount $2 add
	*/
	public void exitCarParking(int time){
		if(report.getParkingCars() > 0){
		//update cars exited
		int carsExited = report.getCarsExited() + 1;
		report.setCarsExited(carsExited);
				
		//no of slots available
		int spacesAvailable = report.getSpacesAvailable() + 1;
		report.setSpacesAvailable(spacesAvailable);
		
		//set parking cars
		int parkedCars = report.getCarsEntered() - report.getCarsExited();
		report.setParkingCars(parkedCars);
				
		//cal fees for the hours
		int feesPaid = 2 * time;
		report.setFeesPaid(feesPaid + report.getFeesPaid());
		}
		else
		{
			System.out.println("No Cars parked. What do you want to take out?");
		}
	}
	
	/**
	 * once truck is entered add number of trucks
	 * deduct number of slots to -2
	 * no change in fees**
	 * */
	public void enterTruckParking(){
		if(report.getSpacesAvailable() >=2){
		//update truck entered
		int trucksEntered = report.getTrucksEntered() + 1;
		report.setTrucksEntered(trucksEntered);
				
		//no of slots available
		int spacesAvailable = report.getSpacesAvailable() - 2;
		report.setSpacesAvailable(spacesAvailable);
		
		//set parking trucks
		int parkedTrucks = report.getTrucksEntered() - report.getTrucksExited();
		report.setParkingTrucks(parkedTrucks);
		}
		else
		{
			System.out.println("No Space Available now. Please try after sometime");
		}
	}
	
	/****
	 * once truck is exited deduct from number of truck
	 * add number of slots to +2
	 * update total fees amount $3 add
	 * @param time
	 */
	public void exitTruckParking(int time){
		//update cars exited
		if(report.getParkingTrucks() > 0){
		int trucksExited = report.getTrucksExited() + 1;
		report.setTrucksExited(trucksExited);
						
		//no of slots available
		int spacesAvailable = report.getSpacesAvailable() + 2;
		report.setSpacesAvailable(spacesAvailable);
		
		//set parking trucks
		int parkedTrucks = report.getTrucksEntered() - report.getTrucksExited();
		report.setParkingTrucks(parkedTrucks);
		
		//cal fees for the hours
		int feesPaid = 3 * time;
		report.setFeesPaid(feesPaid + report.getFeesPaid());
		}
		else
		{
			System.out.println("No Trucks parked. ");
		}
	}
	
	/**
	 * 
	 * @return ParkingReport
	 */
	public ParkingReport getParkingReport(){
		return report;
	}
	
	/**
	 * print the report of the current
	 * car parking lot status
	 */
	public void reportParking(){
		System.out.println(" Cars Entered : " + report.getCarsEntered() + " \n"
				 +" Trucks Entered : " + report.getTrucksEntered() + " \n"
				 +" Cars Exited : " + report.getCarsExited() + " \n"
				 +" Trucks Exited : " + report.getTrucksExited() + " \n"
				 +" Parking Cars : " + report.getParkingCars() + " \n"
				 +" Parking Trucks : " + report.getParkingTrucks() + " \n"
				 +" Spaces Availble : " + report.getSpacesAvailable() + " \n"
				 +" Fees Paid : " + report.getFeesPaid() + " \n");
				

	}
}
