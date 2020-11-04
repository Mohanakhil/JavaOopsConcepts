package com.Oops.Concepts;

class Email {
	private String name;
	private String mailid;
	private String password;

	Email(String name, String mailid, String password) {
		this.name = name;
		this.mailid = mailid;
		this.password = password;
	}

	Email(String name, String mailid) {
		this.name = name;
		this.mailid = mailid;

	}

	void getEmail() {
		System.out.println("name= " + this.name + "mailid= " + this.mailid);
	}
}

public class ConstructorTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Email e1 = new Email("sai", "abc@xyz.com", "123abc");
		e1.getEmail();

	}

}
