/*
 * @author Developer 
 * @version 6.0
 */

package com.TrainConsistManagementApp.main;

import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		
		//Display welcome banner
		System.out.println("=============================================");
		System.out.println("=== UC6 - Map Bogie to capacity (HashMap) ===");
		System.out.println("=============================================\n");
		
		// HashMap stores data in key->value format
		Map<String,Integer> capacityMap = new HashMap<>();
		
		//---- Insert bogie capacities ----
		capacityMap.put("First class", 24);
		capacityMap.put("Cargo", 120);
		capacityMap.put("Sleeper", 72);
		capacityMap.put("AC Chair", 56);
		
		//Displaying the mapped entries using EntrySet
		for(Map.Entry<String, Integer> entry:capacityMap.entrySet()) {
			System.out.println(entry);
		}
		
		System.out.println("\n");
		System.out.println("UC6 bogie->capacity mapping completed.");
		
	}
}
