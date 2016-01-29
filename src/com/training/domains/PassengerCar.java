package com.training.domains;

import com.training.ifaces.Automobile;

public class PassengerCar implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Gold";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 500000.0;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "i10";
	}

}
