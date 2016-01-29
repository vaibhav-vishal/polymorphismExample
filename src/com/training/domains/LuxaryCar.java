package com.training.domains;

import com.training.ifaces.Automobile;

public class LuxaryCar implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Silver";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 12000000.0;
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "veron";
	}

}
