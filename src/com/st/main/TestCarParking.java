package com.st.main;


import java.io.IOException;
import java.util.*;

import com.st.constants.Constants;
import com.st.parking.Parking;

/**
 * Simulation of Car Paking .
 * This will record vehicles entered, exited, total balance and fees paid
 * 
 * @author archana
 *
 */
public class TestCarParking {

	 public static void main(String[ ] args)
	    {
	      Scanner in = new Scanner(System.in);
	      System.out.println(Constants.ENTER_SPACES);
	      //User enters number of car spaces - ex:10
	      String s = in.nextLine( );
	      int noOfSpaces = 1;
	        try{ 
	        	noOfSpaces=Integer.parseInt(s);
	        	//check the valid number for parking.
	        	if(!(noOfSpaces > 0)){
	        		System.out.println(Constants.EXIT); return;
	        	}
	        }
	        catch (Exception e){ 
	        	System.out.println(Constants.EXIT); return;
	        
	        }
	      
	        
	        TestCarParking.takeInput(noOfSpaces,in);
	        
	    }//main ends
	 
	 /**
	  * Input of car or truck entering is used.
	  * @param noOfSpaces
	  * @param in
	  */
	 public static void takeInput(int noOfSpaces, Scanner in){
		 
		 //Parking Class for calculating
	        Parking parking = new Parking(noOfSpaces);
	        boolean loop = true;
	        while(loop)
	        {      
	        	String input = in.nextLine( );
	        	int exitTime= 1;
	        	try{
	        	
	        	if (input.startsWith(Constants.EXIT_CAR)){
             	//exited cars
                  exitTime= Integer.parseInt((input.substring("EXIT CAR".length())).trim());
                  input  = Constants.EXIT_CAR;
             }
             else if(input.startsWith(Constants.EXIT_TRUCK)){
                  exitTime=Integer.parseInt((input.substring(Constants.EXIT_TRUCK.length())).trim());
                  input  = Constants.EXIT_TRUCK;
             }
	        	
	        	if(!(exitTime > 0)){
	        		System.out.println(Constants.WRONG_INPUT); 
	        	}
	        	
	        	}catch(Exception e){
	        		System.out.println(Constants.ENTER_TIME); 
	        	}
	        	switch (input){
	            	
	        		// entered cars
	        		case Constants.ENTER_CAR: parking.enterCarParking(); 
	        		break;
	                 
	        		//exited trucks
	        		case Constants.EXIT_CAR: parking.exitCarParking(exitTime); 
	        		break;
	        		
	    	        //entered trucks
	        		case Constants.ENTER_TRUCK: parking.enterTruckParking();
	        		break;
	        		
	    	        //exited trucks
	        		case Constants.EXIT_TRUCK: parking.exitTruckParking(exitTime);
	        		break;
	        		
	    	        //report
	        		case Constants.REPORT: parking.reportParking(); 
	        		break;
	        		
	        		//EXIT
	        		case Constants.QUIT: loop = false;
	                break;
	            	           
	        		default:
	                System.out.println(Constants.WRONG_INPUT);
	                //System.out.println("Wrong Input, exiting"); return;                
	                
	        }      
	        }
	 }
}


