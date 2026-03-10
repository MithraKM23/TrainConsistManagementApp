/*
 * @author Developer 
 * @version 4.0
 */

package com.TrainConsistManagementApp.main;

import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		//Display welcome banner
		System.out.println("============================================");
		System.out.println("=== UC4 - Maintain Ordered Bogie Consist ===");
		System.out.println("============================================");
		
		//Create a LinkedList
		// LinkedList maintains insertion order and allows fast inserts
		List<String> trainConsist = new LinkedList<>();
		
		//----ADD IDs (including duplicates)----
		// add() inserts bogie IDs into the set
		trainConsist.add("Engine");
		trainConsist.add("Sleeper");
		trainConsist.add("AC");
		trainConsist.add("Cargo");
		trainConsist.add("Guard");
		System.out.println("\n");
		System.out.println("Initial train Consist");
		System.out.println(trainConsist);
		
		trainConsist.add(2, "Pantry Car");
		System.out.println("\n");
		System.out.println("After inserting 'Pantry Car' at position 2:");
		System.out.println(trainConsist);
		
		trainConsist.removeFirst();
		trainConsist.removeLast();
		System.out.println("\n");
		System.out.println("After removing first and last bogie:");
		System.out.println(trainConsist);
		
		
		System.out.println("\n");
		System.out.println("UC4 ordered consist operations completed.");
		
	}
}
