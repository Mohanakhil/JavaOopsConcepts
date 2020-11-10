//java bank account application
import java.util.Scanner;
class BankApp
{ private int accountno;
private String name;
private float balance;
private static float minbalance;
void setAccount(int accountno,String name,float balance)
{this.accountno=accountno;
this.name=name;
this.balance=balance;
}
void printAccount()
{System.out.println("accountno= "+this.accountno+"name= "+this.name+"balance= "+this.balance);
}
void setMinbalance(float mb)
{ minbalance=mb;
}
void deposit(float transaction)
{ this.balance=this.balance+transaction;
this.printAccount();
}
void withdraw(float transaction)
{ if((this.balance-transaction)<minbalance) System.out.println("sorry insufficient balance");
else this.balance=this.balance-transaction;
this.printAccount();
}
}
class CreateAccount
{
public static void main(String args[])
{ Scanner scan=new Scanner(System.in);
BankApp b1=new BankApp();
b1.setAccount(101,"rama",50000f);
b1.setMinbalance(5000f);
byte flag=100;
System.out.println("press 1 for withdraw\n2 for deposit\n3-for statement");
flag=scan.nextByte();

switch(flag)
{case 1-> {System.out.println("enter amount of withdraw");
float transaction=scan.nextFloat();
b1.withdraw(transaction);

}
case 2->{ System.out.println("enter amount of deposit");
Float transaction=scan.nextFloat();
b1.deposit(transaction);
}
case 3-> b1.printAccount();
default->System.out.println("Invalid option");
}//end of switch

}}