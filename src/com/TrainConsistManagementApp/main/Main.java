/*
 * @author Developer 
 * @version 7.0
 */

package com.TrainConsistManagementApp.main;

import java.util.ArrayList;
import java.util.Comparator;
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
		System.out.println("=== UC7 - Sort Bogies by capacity (Comparator) ===");
		System.out.println("==================================================\n");
		
		// Create list of passenger bogies
		List<Bogie> bogies= new ArrayList<>();
		bogies.add(new Bogie("Sleeper",72));
		bogies.add(new Bogie("AC Chair",56));
		bogies.add(new Bogie("First Class",24));
		bogies.add(new Bogie("General",90));
		
		System.out.println("\n");
		System.out.println("Before Sorting:");
		for(Bogie b : bogies) {
			System.out.println(b.name+" -> "+b.capacity);
		}
		
		System.out.println("\n");
		System.out.println("After Sorting:");
		bogies.sort(Comparator.comparingInt(b -> b.capacity));
		for(Bogie b : bogies) {
			System.out.println(b.name+" -> "+b.capacity);
		}
		
		
		System.out.println("\n");
		System.out.println("UC7 sorting completed.");
		
	}
}
