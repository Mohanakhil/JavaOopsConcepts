package com.Oops.Concepts;

class Student {
	private String name;
	private float rno;// rno is rollno of student
	private String course;

	void setStudent(String name, float rno, String course) {
		this.name = name;
		this.rno = rno;
		this.course = course;
	}

	void setStudent(String name, float rno) {
		this.name = name;
		this.rno = rno;
	}

	void setStudent(String course) {
		this.course = course;
	}

	void getStudent() {
		System.out.println("name= " + this.name + " rno= " + this.rno + "course= " + this.course);
	}
}

public class MethodOverloadingTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student();
		Student s2 = new Student();
		s1.setStudent("rama", 102, "java");
		s2.setStudent("sai", 103);
		s2.getStudent();
		s2.setStudent("python");
		s2.getStudent();
		s1.getStudent();

	}

}
