/*
 * @author Developer 
 * @version 5.0
 */

package com.TrainConsistManagementApp.main;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		
		//Display welcome banner
		System.out.println("================================================");
		System.out.println("=== UC5 - Preserve Insertion Order of Bogies ===");
		System.out.println("================================================");
		
		// LinkedHashSet preserves Order and ensures uniqueness
		Set<String> formation = new LinkedHashSet<>();
		
		formation.add("Engine");
		formation.add("Sleeper");
		formation.add("Cargo");
		formation.add("Guard");
		
		//Adding duplicates
		formation.add("Sleeper");
		formation.add("Guard");
		System.out.println("\n");
		System.out.println("Final train Formation:");
		System.out.println(formation);
		
		System.out.println("\nNote:\nLinkedHashSet preserves insertion order and removes duplicates automatically");
		
		System.out.println("\n");
		System.out.println("UC5 formation setup completed.");
		
	}
}
