/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4th.sem;

/**
 *
 * @author lenov
 */
class BMW
{
String brand;
int price;
int speed;
int mileage;
BMW(String b,int p,int s,int m)
{
brand=b;
price=p;
speed=s;
mileage=m;
}
BMW()
{}
void display()
{
System.out.println(brand+ " " +price+ " " +speed+ " " +mileage);
}
}
class Thar
{
public static void main(String arr[])
{
BMW a1=new BMW("BMW Motorrad",200000000,34,76);
BMW a2=new BMW();
a2.brand=a1.brand;
a2.speed=a1.speed;
a2.price=a1.price;
a2.mileage=a1.mileage;
a1.display();
a2.display();
}
}