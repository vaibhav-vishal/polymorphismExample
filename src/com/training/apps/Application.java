package com.training.apps;

//import java.util.Scanner;

//import com.training.domains.Showroom;
import com.training.domains.Showroom_b;
import com.training.ifaces.Automobile;

public class Application {

	public static void main(String[] args) {
		Showroom_b showRoom = new Showroom_b();
		Automobile polyAuto=null;
		//System.out.println("Select type  \n1.Passenger 2.Luxury 3.Sports 4.Bike");
		//Scanner sc= new Scanner(System.in);
		//int key=sc.nextInt();

		int key=5;
		polyAuto = showRoom.getItem(key);
		if(polyAuto!=null)
		showRoom.printQuote(polyAuto);
		else System.out.println("Invalid option!");
//sc.close();
	}

}
