/*
 * @author Developer 
 * @version 16.0
 */

package com.TrainConsistManagementApp.main;

public class Main {
	
	public static void main(String[] args) {

		//Display welcome banner
		System.out.println("===============================================");
		System.out.println("=== UC16 - Manual Sorting using Bubble Sort ===");
		System.out.println("===============================================\n");
		
		int[] capacities = {72,56,24,70,60};
		
		System.out.println("Original Capacities: ");
		for(int c : capacities) {
			System.out.print(c+" ");
		}
		
		for(int i=0;i<capacities.length-1;i++) {
			boolean swapped=true;
			for(int j=0;j<capacities.length-i-1;j++) {
				if(capacities[j]>capacities[j+1]) {
					int temp=capacities[j];
					capacities[j]=capacities[j+1];
					capacities[j+1]=temp;
					swapped=false;
				}
			}
			if(swapped) {
				break;
			}
		}
		
		System.out.println("\n");
		System.out.println("Sorted Capacities (Ascending): ");
		for(int c : capacities) {
			System.out.print(c+" ");
		}

		System.out.println("\n");
		System.out.println("UC16 sorting completed...");

	}
}
