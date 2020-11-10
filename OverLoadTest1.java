class A
{void m1()
{System.out.println("inside m1 of class A");
}
void m2()
{this.m1();
System.out.println("inside m2 of class A");
}
}
class OverLoadTest1
{public static void main(String args[])
{A obj1=new A();
obj1.m2();
}
}