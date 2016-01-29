package com.training.domains;

import com.training.ifaces.Automobile;

public class SportsCar implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "White";
	}

	public double getPrice() {
		// TODO Auto-generated method stub
		return 1500000.0;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Gallardo";
	}

}
