package com.Oops.Concepts;

//composition 
class Engine// substance
{
	void engineStart() {
		System.out.println("engine started");
	}

	void engineStop() {
		System.out.println("engine stopped");
	}
}

class Bike// container
{
	Engine e = new Engine();

	void kickOn() {
		e.engineStart();
	}

	void turnoff() {
		e.engineStop();
	}
}

public class BikeTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike b1 = new Bike();
		b1.kickOn();
		b1.turnoff();
	}

}
