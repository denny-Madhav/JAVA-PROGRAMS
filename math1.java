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
public class math1 {
    public static void main(String arr[]){
        int a,b=1;
        int one=10;
        int two=5;
        
        /* ------------------------------------------------------ARTHEMATIC OPERATOR--------------------------------------------------------*/
        a=one+two;
        System.out.println("Addition of 10+5="+a);
         System.out.println("");
         
        
        a=one-two;
        System.out.println("Substraction of 10-5="+a);
        System.out.println("");
        
        a=one*two;
        System.out.println("Multiplication of 10 x 5="+a);
        System.out.println("");
        
        a=one%two;
        System.out.println("Division of 10%5="+a);
        System.out.println("");
        
        a=one/two;
        System.out.println("by of 10/5="+a);
        System.out.println("");
        
        /*-----------------------------------------------------UNARY OPERATOR--------------------------------------------------------------*/
        System.out.println(" post increment"+b++);
        System.out.println(" ");
        
        System.out.println(" pre increment"+ ++b);
        System.out.println(" ");
        
        System.out.println(" post decrement"+ b--);
        System.out.println(" ");
        
        System.out.println(" pre increment"+ --b);
        System.out.println(" ");
        
        // Comparison Operator
     int x = 5;
     int y = 3;
     System.out.println(x == y);
     System.out.println(x != y);
     System.out.println(x > y);
     System.out.println(x < y);
     System.out.println(x <= y);
     System.out.println(x >= y);
     
        
     // Logical Operator
     int z=5;
     System.out.println(z > 3 && z < 10);  
     System.out.println(z < 5 || z < 4);
     System.out.println(!(z < 5 && z < 10));
     
     
     // bitwise operators 

		//Initial values 
		int c = 5; 
		int d = 7; 

		// bitwise and 
		System.out.println("a&b = " + (c & d)); 

		// bitwise or 
		System.out.println("a|b = " + (c | d)); 

		// bitwise xor 
		System.out.println("a^b = " + (c ^ d)); 

		// bitwise and 
		System.out.println("~a = " + ~c); 
		a &= b; 
		System.out.println("a= " + c);
    }
    
    
}
