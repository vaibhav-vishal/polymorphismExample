package com.training.domains;

import com.training.ifaces.Automobile;

public class Showroom_b extends Showroom {
	
	public Automobile getItem(int key) {
		if(key==4)
		return  new SportsBike();
		else
			return super.getItem(key);
	}

}
