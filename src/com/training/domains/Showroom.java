package com.training.domains;

import com.training.ifaces.Automobile;

public class Showroom {

	public Automobile getItem(int key) {
		
		switch(key){
		case 1:
			return new PassengerCar();
			
		case 2:
			return new LuxaryCar();
			
		case 3:
			return new SportsCar();
		
			default:
				 return null;
		}
		
	/**
	 * @param	polyAuto takes objects
	 * prints quotation of product selected
	 */
		
		
	}
	public void printQuote(Automobile polyAuto){
		System.out.println("=====QUOTATION=====");
		System.out.println("MOdel : "+polyAuto.getModel());
		System.out.println("Color : "+polyAuto.getColor());
		System.out.println("Price : "+polyAuto.getPrice());
	}
}
