/*
 * @author Developer 
 * @version 13.0
 */

package com.TrainConsistManagementApp.main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	static class Bogie{
		String type;
		int capacity;
		public Bogie(String type, int capacity) {
			this.type = type;
			this.capacity = capacity;
		}

	}

	public static void main(String[] args) {

		//Display welcome banner
		System.out.println("=======================================================");
		System.out.println("=== UC13 - Performance Comparison (Loops vs Streams ===");
		System.out.println("=======================================================\n");

		// Create list of passenger bogies
		List<Bogie> bogies= new ArrayList<>();
		bogies.add(new Bogie("Sleeper",72));
		bogies.add(new Bogie("AC Chair",56));
		bogies.add(new Bogie("First Class",24));
		bogies.add(new Bogie("General",90));

		List<Bogie> list=new ArrayList<>();

		//Filtering the bogies using for loop
		long loopstart=System.nanoTime();
		for(Bogie b: bogies) {
			if(b.capacity>60) {
				list.add(b);
			}
		}
		long loopend=System.nanoTime();
		long looptime=loopend-loopstart;
		System.out.println("Loop Execution Time (ns): "+looptime);

		//Filtering all the bogies greater than 60 using stream()
		long streamstart=System.nanoTime();
		bogies.stream().filter(b -> b.capacity >60).collect(Collectors.toList());
		long streamend = System.nanoTime();
		long streamtime=streamend-streamstart;
		System.out.println("Stream Execution Time (ns): "+streamtime);




		System.out.println("\n");
		System.out.println("UC13 performance benchmarking completed...");

	}
}
