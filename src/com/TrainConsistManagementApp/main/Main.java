/*
 * @author Developer 
 * @version 9.0
 */

package com.TrainConsistManagementApp.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
		System.out.println("=== UC9 - Group Bogies By type ===");
		System.out.println("==================================================\n");
		
		// Create list of passenger bogies
		List<Bogie> bogies= new ArrayList<>();
		bogies.add(new Bogie("Sleeper",72));
		bogies.add(new Bogie("AC Chair",56));
		bogies.add(new Bogie("First Class",24));
		bogies.add(new Bogie("Sleeper",70));
		bogies.add(new Bogie("AC Chair",60));
		
		//Printing all bogies before grouping
		System.out.println("\n");
		System.out.println("All Bogies:");
		for(Bogie b : bogies) {
			System.out.println(b.name+" -> "+b.capacity);
		}
		
		//Grouping all the bogies using the bogie name
		Map<String, List<Bogie>> groupedbogies = bogies.stream().collect(Collectors.groupingBy(b -> b.name));
		
		//Printing all the grouped bogies
		System.out.println("\n");
		System.out.println("Grouped Bogies:");
		for(Map.Entry<String, List<Bogie>> entry : groupedbogies.entrySet()) {
			System.out.println("Bogie Type: "+entry.getKey());
			for(Bogie list:entry.getValue()) {
				System.out.println("Capacity -> "+list.capacity);
			}
			System.out.println("\n");
		}
		
		System.out.println("UC9 grouping completed.");
		
	}
}
