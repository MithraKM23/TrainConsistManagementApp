/*
 * @author Developer 
 * @version 20.0
 */

package com.TrainConsistManagementApp.main;

import java.util.Arrays;

public class Main {
	
	public static int binarySearch(String[] bogies, String key) {
        // Defensive check
        if (bogies == null || bogies.length == 0) {
            throw new IllegalStateException("No bogies available for search!");
        }

        int low = 0;
        int high = bogies.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int result = key.compareTo(bogies[mid]);

            if (result == 0) {
                return mid; // Found
            } else if (result < 0) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1; // Not found
	}
	public static void main(String[] args) {

		//Display welcome banner
		System.out.println("=========================================");
		System.out.println("=== Exceptional Handling During Search ===");
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
		
		try {
			int index=binarySearch(bogiesIds,key);
			if(index!=-1) {
				System.out.println("Bogie ID "+key+" found.");
			}
			else {
				System.out.println("Bogie ID "+key+" found.");

			}
		}
		catch(IllegalStateException e) {
			System.out.println("Error: "+e.getMessage());
		}
		
		
		System.out.println("\n");
		System.out.println("UC20 search completed...");

	}
}
