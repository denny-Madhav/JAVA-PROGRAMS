package pkg4th.CA.CA2;

import java.util.Scanner;

public  class Q3{  
public static void main(String args[]){ 
    Scanner ip=new Scanner(System.in);
    System.out.println("Enter your current attendence percentage :");
    int att=ip.nextInt();
    std d=new std();   
    d.display(); 
    System.out.println("Your current attendence percentage is "+att+"%");
    if(att<70)
    {   System.out.println(" ");
        System.out.println("your are not eligible to attend exam.");
    }
    else{
        System.out.println(" ");
       System.out.println("Congrats your are eligible to attend exam.!!");}}}  
class Attendence{  
int req=75;  
}  
 class std extends Attendence{ 
void display(){  
    int req=70;    
System.out.println("Previous year required attendence percentage Requied to attend ETE is "+super.req+"%");
System.out.println("On going year attendence percentge Requied to attend ETE is "+req+"%");
}  
}  