/*
 * @author Developer 
 * @version 17.0
 */

package com.TrainConsistManagementApp.main;

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {

		//Display welcome banner
		System.out.println("===================================================");
		System.out.println("=== UC17 - Sort Bogie Names Using Arrays.sort() ===");
		System.out.println("===================================================\n");
		
		//Creating bogies using array of strings
		String[] bogies= {"Sleeper","AC Chair","First Class","General","Luxury"};
		
		//Printing the bogies before sorting
		System.out.println("Original Bogie Names: ");
		for(String s:bogies) {
			System.out.print(s+", ");
		}
		
		//Sorting the bogies using Arrays.sort()
		Arrays.sort(bogies);
		
		//Printing the bogies after sorting using for loop
		System.out.println("\n");
		System.out.println("Sorted Bogie Names (Alphabetical):");
		for(String s:bogies) {
			System.out.print(s+", ");
		}
		
		System.out.println("\n");
		System.out.println("UC17 sorting completed...");

	}
}
