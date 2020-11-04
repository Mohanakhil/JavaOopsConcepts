package com.Oops.Concepts;

import java.util.Scanner;

//many to one relation
class ServerConnection {
	private String username;
	private String password;
	Scanner scan = new Scanner(System.in);

	void setServer() {
		System.out.println("enter username and password");
		this.username = scan.next();
		this.password = scan.next();

	}

	void getServer() {
		System.out.println("you are connected to server");
	}
}

class Device {
	Scanner scan = new Scanner(System.in);
	ServerConnection s1 = new ServerConnection();
	private String os;

	void setDevice() {
		System.out.println("enter name of your device os");
		this.os = scan.next();
		s1.setServer();
	}

	void getDevice() {
		System.out.println("your os is installed properly");
		s1.getServer();
	}
}

public class CompositionTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Device d1 = new Device();
		d1.setDevice();
		d1.getDevice();
		Device d2 = new Device();
		d2.setDevice();
		d2.getDevice();
	}

}
