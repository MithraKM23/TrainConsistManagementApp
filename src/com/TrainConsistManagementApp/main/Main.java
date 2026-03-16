/*
 * @author Developer 
 * @version 18.0
 */

package com.TrainConsistManagementApp.main;

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {

		//Display welcome banner
		System.out.println("=========================================");
		System.out.println("=== UC18 - Linear Search for Bogie ID ===");
		System.out.println("=========================================\n");
		
		//Creating array of bogie IDs
		String[] bogiesIds= {"BG101", "BG205", "BG309", "BG412", "BG550"};
		
		String searchId="BG309";
		
		System.out.println("Available Bogie IDs:");
		for(String id:bogiesIds) {
			System.out.println(id);
		}
		
		//Using linear search to find if the bogie is present or not
		boolean found=false;
		 for(String id:bogiesIds) {
			 if(id==searchId) {
				 found=true;
			 }
		 }
		
		if(found) {
			System.out.println("Bogie "+searchId+" found in train consist.");
		}
		else {
			System.out.println("Bogie "+searchId+" not found in train consist.");

		}
		
		
		System.out.println("\n");
		System.out.println("UC18 search completed...");

	}
}
