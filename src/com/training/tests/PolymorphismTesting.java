package com.training.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.training.domains.*;
import com.training.ifaces.Automobile;

public class PolymorphismTesting {

	Showroom_b obj1 = null;
	Automobile auto1 = null;
	
	@Before
	public void setUp() throws Exception {
		obj1 = new Showroom_b();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCase1() {
		auto1 = obj1.getItem(1);
		assertTrue(auto1 instanceof PassengerCar);
	}
	
	@Test
	public void testCase2() {
		auto1 = obj1.getItem(2);
		assertTrue(auto1 instanceof LuxaryCar);
	}
	
	@Test
	public void testCase3() {
		auto1 = obj1.getItem(3);
		assertTrue(auto1 instanceof SportsCar);
	}
	
	@Test
	public void testCase4() {
		auto1 = obj1.getItem(4);
		assertTrue(auto1 instanceof SportsBike);
	}

}
