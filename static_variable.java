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
class Student
{
String name,address;
int reg_no;
static String school="CSE";

static void change()
{
school= "SCA";
}
Student(String name,String address, int reg_no)
{
this.name= name;
this.address=address;
this.reg_no= reg_no;
}
void show()
{
System.out.println(" Name of student: "+name+"Address of student: "+address+"Roll number: "+reg_no+" "+school);
}

}
class Test
{
public static void main(String arr[])
{
Student.change();
Student s1= new Student("John","UK",1199098);
Student s2= new Student("Dev","USA",1199018);
s1.show();
s2.show();
}
}

