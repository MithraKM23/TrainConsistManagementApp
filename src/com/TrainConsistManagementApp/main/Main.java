/*
 * @author Developer 
 * @version 10.0
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
		System.out.println("=========================================");
		System.out.println("=== UC10 - Count total Seats in train ===");
		System.out.println("=========================================\n");
		
		// Create list of passenger bogies
		List<Bogie> bogies= new ArrayList<>();
		bogies.add(new Bogie("Sleeper",72));
		bogies.add(new Bogie("AC Chair",56));
		bogies.add(new Bogie("First Class",24));
		bogies.add(new Bogie("Sleeper",70));
		
		//Printing all bogies
		System.out.println("\n");
		System.out.println("Bogies in train:");
		for(Bogie b : bogies) {
			System.out.println(b.name+" -> "+b.capacity);
		}
		
		//----AGGREGATE USING REDUCE----
		//map() extracts capacity field from Bogie object
		int totalSeats=bogies.stream().map(b -> b.capacity).reduce(0, (a,b) -> a+b);
		System.out.println("\n");
		System.out.println("Total Seating Capacity of Train: "+totalSeats);
		System.out.println("\n");
		System.out.println("UC10 aggregation completed.");
		
	}
}
