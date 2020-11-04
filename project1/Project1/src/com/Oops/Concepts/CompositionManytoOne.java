package com.Oops.Concepts;

class Printer {
	void print(String txt) {
		System.out.println(txt);
	}
}

class NotePad {
	private static Printer p1 = new Printer();
	private String txt;

	void setNotepad(String txt) {
		this.txt = txt;
	}

	void getNotepad() {
		p1.print(txt);
	}
}

public class CompositionManytoOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NotePad n1 = new NotePad();
		NotePad n2 = new NotePad();
		n1.setNotepad("abcdefg");
		n2.setNotepad("zyxwvutsr");
		n1.getNotepad();
		n2.getNotepad();
	}

}
