/*
 * @author Developer 
 * @version 11.0
 */

package com.TrainConsistManagementApp.main;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		//Display welcome banner
		System.out.println("===============================================");
		System.out.println("=== UC11 - Validate Train ID and Cargo Code ===");
		System.out.println("===============================================\n");
		
		Scanner sc=new Scanner(System.in);
		
		//Getting input
		System.out.print("Enter Train ID (Format: TRN-1234): ");
		String trainId=sc.nextLine();
		
		System.out.print("Enter Cargo Code (Format: PET-AB): ");
		String cargoCode = sc.nextLine();
		
		//TrainId and CargoCode Regex
		String trainRegex="TRN-\\d{4}";
		String cargoRegex="[A-Z]{3}-[A-Z]{2}";
		
		System.out.println("\n");
		System.out.println("Validation Results:");
		
		//Checking if the trainId and CargoCode matches the regex
		if(trainId.matches(trainRegex)) {
			System.out.println("Train ID Valid: true");
		}
		else {
			System.out.println("Train ID Valid: false");
		}
		
		if(cargoCode.matches(cargoRegex)) {
			System.out.println("Cargo Code Valid: true");
		}
		else {
			System.out.println("Cargo Code Valid: false");
		}
		System.out.println("\n");
		System.out.println("UC11 validation completed.");
		
	}
}
