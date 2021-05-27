abstract class T1
{
abstract void disp();
}


class T2
{
class Inner
{

void shw()
{
System.out.println("Inner class");
}
}

void show()
{
class T3
{
void dis()
{
System.out.println("Local inner class");
}
}
T3 o=new T3();
o.dis();
}

public static void main(String args[])
{
T1 obj=new T1()
{
void disp()
{
System.out.println("Anonymous inner class");
}
};
obj.disp();
T2 ob=new T2();
ob.show();
T2.Inner obj1=ob.new Inner();
obj1.shw();
}