/*
 * @author Developer 
 * @version 19.0
 */

package com.TrainConsistManagementApp.main;

import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {

		//Display welcome banner
		System.out.println("=========================================");
		System.out.println("=== UC19 - Binary Search for Bogie ID ===");
		System.out.println("=========================================\n");
		
		//Creating array of bogie IDs
		String[] bogiesIds= {"BG101", "BG205", "BG309", "BG412", "BG550"};
		
		//Ensuring data is sorted before binary search
		Arrays.sort(bogiesIds);
		
		//Search key
		String key="BG309";
		
		//Display available bogies
		System.out.println("Available Bogie IDs:");
		for(String id:bogiesIds) {
			System.out.println(id);
		}
		
		boolean result=false;
		int low=0;
		int high=bogiesIds.length-1;
		
		//Binary search logic
		while(low<=high) {
			int mid=(low+high)/2;
			int output=key.compareTo(bogiesIds[mid]);
			if(output==0) {
				result=true;
				break;
			}
			else if(output < 0) {
				high=mid-1;
			}
			else {
				low=mid+1;
			}
			result=false;
		}
		
		if(result) {
			System.out.println("Bogie "+key+" found in train consist.");
		}
		else {
			System.out.println("Bogie "+key+" not found in train consist.");

		}
		
		
		System.out.println("\n");
		System.out.println("UC19 search completed...");

	}
}
