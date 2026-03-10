/*
 * @author Developer 
 * @version 1.0
 */

package com.TrainConsistManagementApp.main;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		//Display welcome banner
		System.out.println("====================================");
		System.out.println("=== Train Consist Management App ===");
		System.out.println("====================================");
		
		//Create a dynamic list to store train bogies
		List<String> trainConsist = new ArrayList<>();
		
		//Display initial consist information
		System.out.println("\n");
		System.out.println("Train Initialised successfully...");
		System.out.println("Initial bogie count: "+trainConsist.size());
		System.out.println("Current train Consist: "+trainConsist);
		System.out.println("\n");
		System.out.println("System ready for operations...");
	}
}
