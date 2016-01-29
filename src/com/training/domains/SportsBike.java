package com.training.domains;

import com.training.ifaces.Automobile;

public class SportsBike implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Black";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 100000.0;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "Duke-300";
	}

}
