/*
 * @author Developer 
 * @version 8.0
 */

package com.TrainConsistManagementApp.main;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	static class Bogie{
		String name;
		int capacity;
		public Bogie(String name, int capacity) {
			this.name = name;
			this.capacity = capacity;
		}
		
	}
	public static void main(String[] args) {
		
		//Display welcome banner
		System.out.println("==================================================");
		System.out.println("=== UC8 - Filter passenger Bogies using Streams ===");
		System.out.println("==================================================\n");
		
		// Create list of passenger bogies
		List<Bogie> bogies= new ArrayList<>();
		bogies.add(new Bogie("Sleeper",72));
		bogies.add(new Bogie("AC Chair",56));
		bogies.add(new Bogie("First Class",24));
		bogies.add(new Bogie("General",90));
		
		//Printkng all bogies before filtering
		System.out.println("\n");
		System.out.println("All Bogies:");
		for(Bogie b : bogies) {
			System.out.println(b.name+" -> "+b.capacity);
		}
		
		//Filtering all the bogies greater than 60 using stream()
		System.out.println("\n");
		System.out.println("Filtered Bogies (Capacity > 60):");
		bogies.stream().filter(b -> b.capacity >60).forEach(b -> System.out.println(b.name+" -> "+b.capacity));
		
		
		System.out.println("\n");
		System.out.println("UC8 filtering completed.");
		
	}
}
