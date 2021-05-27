package pkg4th.sem.Aggregation;

class Shapes
{
int square(int n)
{
return n*n;
}
}
class Circle
{
Shapes s1;//aggregation
double pi=3.14;
double area(int radius)
{
s1= new Shapes();
int a=s1.square(radius);
return pi*a;
}

}
class Main
{
public static void main(String arr[])
{
Circle c1= new Circle();
double result= c1.area(10);
System.out.println(result);
}
}