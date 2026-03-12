/*
 * @author Developer 
 * @version 15.0
 */

package com.TrainConsistManagementApp.main;

public class Main {
	
	//Goods Bogie model
	static class GoodsBogie{
		String shape;
		String cargo;
		public GoodsBogie(String shape) {
			
			this.shape = shape;
		}
		
		//Assign cargo with safety validation
		public void assignCargo(String cargo) {
			try {
				
				//Rule: Rectangular bogie cannot carry petroleum
				if(shape.equalsIgnoreCase("Rectangular") && cargo.equalsIgnoreCase("Petroleum")) {
					throw new CargoSafetyException("Unsafe assignment!");
				}
				this.cargo=cargo;
				System.out.println("Cargo assigned sucessfully -> "+cargo);
			}
			catch(CargoSafetyException e) {
				System.out.println("Error: "+e.getMessage());
			}
			finally {
				System.out.println("Cargo validation completed for "+shape+" bogie");
			}
		}
	}
	
	//Custom Runtime Exception
	static class CargoSafetyException extends RuntimeException{

		public CargoSafetyException(String msg) {
			super(msg);
		}	
	}

	public static void main(String[] args) {

		//Display welcome banner
		System.out.println("====================================");
		System.out.println("=== UC15 - Safe Cargo Assignment ===");
		System.out.println("====================================\n");
		
		//Creating a bogie and assigning a cargo
		GoodsBogie bogie1=new GoodsBogie("Cylindrical");
		bogie1.assignCargo("Petroleum");
		
		System.out.println("\n");
		GoodsBogie bogie2=new GoodsBogie("Rectangular");
		bogie2.assignCargo("Petroleum");

		System.out.println("\n");
		System.out.println("UC15 runtime handling completed...");

	}
}
