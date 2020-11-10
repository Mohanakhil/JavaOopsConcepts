class Point
{private int x;
private int y;
void setPoint(int x,int y)
{this.x=x;
this.y=y;
}
void printPoint()
{System.out.println(this.x+","+this.y);
}
}
class PointTest1
{ public static void main(String args[])
{Point p1=new Point();
p1.setPoint(10,20);
p1.printPoint();
}
}