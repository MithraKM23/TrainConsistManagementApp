/*
 * @author Developer 
 * @version 3.0
 */

package com.TrainConsistManagementApp.main;

import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		
		//Display welcome banner
		System.out.println("====================================");
		System.out.println("=== UC3 - Track unique Bogie IDs ===");
		System.out.println("====================================");
		
		//Create a Set to store unique Bogie IDs
		// HashSet stores only unique values
		Set<String> bogies = new HashSet<>();
		
		//----ADD IDs (including duplicates)----
		// add() inserts bogie IDs into the set
		bogies.add("BG101");
		bogies.add("BG102");
		bogies.add("BG103");
		bogies.add("BG104");
		
		//Duplicate entries will be ignored internally by HashSet
		bogies.add("BG101");
		bogies.add("BG102");
		System.out.println("\n");
		System.out.println("Bogie IDs After Insertion:\n"+bogies);
		
		System.out.println("\n");
		System.out.println("Note: \nDuplicates are automatically ignored by HashSet");
		System.out.println("\n");
		System.out.println("UC3 uniqueness validation completed...");
		
	}
}
