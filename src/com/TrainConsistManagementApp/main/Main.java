/*
 * @author Developer 
 * @version 2.0
 */

package com.TrainConsistManagementApp.main;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		//Display welcome banner
		System.out.println("====================================");
		System.out.println("=== Add Pasanger bogies to train ===");
		System.out.println("====================================");
		
		//Create a dynamic list to store train bogies
		List<String> trainConsist = new ArrayList<>();
		
		//Adding train bogies to the list
		System.out.println("\n");
		System.out.println("After Adding Bogies: ");
		trainConsist.add("Sleeper");
		trainConsist.add("AC Chair");
		trainConsist.add("First Class");
		System.out.println("Passenger Bogies : "+trainConsist);
		
		//Removing AC chair from the list
		System.out.println("\n");
		System.out.println("After removing 'AC Chair' :");
		trainConsist.remove(1);
		System.out.println("Passenger Bogies : "+trainConsist);
		
		//Checking if sleeper exists in the bogie train
		System.out.println("\n");
		System.out.println("Checking if 'Sleeper' exists:");
		System.out.println("Contains Sleeper? : "+trainConsist.contains("Sleeper"));
		
		System.out.println("\n");
		System.out.println("Final Train Passenger Consist:");
		System.out.println(trainConsist);
		
		System.out.println("\n");
		System.out.println("UC2 operations completed successfully");
		
	}
}
