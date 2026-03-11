/*
 * @author Developer 
 * @version 12.0
 */

package com.TrainConsistManagementApp.main;

import java.util.ArrayList;
import java.util.List;

public class Main {
	static class GoodsBogies{
		String type;
		String cargo;
		public GoodsBogies(String type, String cargo) {
			this.type = type;
			this.cargo = cargo;
		}
		
	}
	
	public static void main(String[] args) {
		
		//Display welcome banner
		System.out.println("=======================================================");
		System.out.println("=== UC12 - Safety Compliance Check for Goods Bogies ===");
		System.out.println("=======================================================\n");
		
		//Creating a list and adding all goods bogies
		List<GoodsBogies> goodsbogies = new ArrayList<>();
		goodsbogies.add(new GoodsBogies("Cylindrical","Petroleum"));
		goodsbogies.add(new GoodsBogies("Open","Coal"));
		goodsbogies.add(new GoodsBogies("Box","Grain"));
		goodsbogies.add(new GoodsBogies("Cylindrical","Coal"));
		
		//Printing all the bogies
		System.out.println("Goods Bogies in Train: ");
		for(GoodsBogies b : goodsbogies) {
			System.out.println(b.type+" -> "+b.cargo);
		}
		
		//Checking if it matches the safety compliance
		boolean isSafe = goodsbogies.stream().allMatch(b -> !b.type.equalsIgnoreCase("Cylindrical") || b.cargo.equalsIgnoreCase("Petroleum"));
		
		System.out.println("\n");
		if(isSafe) {
			System.out.println("Safety Compliance Status: "+isSafe);
			System.out.println("Train formation is SAFE");
		}
		else {
			System.out.println("Safety Compliance Status: "+isSafe);
			System.out.println("Train formation is NOT SAFE");
		}
		
		System.out.println("\n");
		System.out.println("UC12 safety validation completed.");
		
	}
}
