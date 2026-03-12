/*
 * @author Developer 
 * @version 14.0
 */

package com.TrainConsistManagementApp.main;

public class Main {
	static class PassengerBogie{
		String type;
		int capacity;
		public PassengerBogie(String type, int capacity) throws InvalidCapacityException {
			if(capacity<=0) {
				throw new InvalidCapacityException("Error: Capacity must be greater than zero");
			}
			this.type = type;
			this.capacity = capacity;
		}
		public String toString() {
			return type+" -> "+capacity;
		}
	}
	static class InvalidCapacityException extends Exception{

		public InvalidCapacityException(String msg) {
			super(msg);
		}
		
	}

	public static void main(String[] args) {

		//Display welcome banner
		System.out.println("============================================");
		System.out.println("=== UC14 - Handle Invalid Bogie Capacity ===");
		System.out.println("============================================\n");
		try {
		PassengerBogie sleeper=new PassengerBogie("Sleeper",72);
		System.out.println("Creeated Bogie: "+sleeper);
		
		PassengerBogie ac=new PassengerBogie("AC Chair",0);
		System.out.println("Created Bogie: "+ac);
		}
		catch(InvalidCapacityException e) {
			System.out.println("Error: "+e.getMessage());
		}
		
		System.out.println("\n");
		System.out.println("UC14 exception handling completed...");

	}
}
