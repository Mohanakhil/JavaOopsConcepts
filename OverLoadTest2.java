class A
{void m1()
{System.out.println(this);
}
}
class OverLoadTest2
{public static void main(String args[])
{A obj1=new A();
System.out.println(obj1);
A obj2=new A();
System.out.println(obj2);
obj1.m1();
obj2.m1();
}
}