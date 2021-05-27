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
public class this_constructor {
    
    this_constructor(){ // i want this to print first
        //this(45);
        System.out.println("Would you like some TEA."); // this is not printing
    }
    
    this_constructor(int a){
        this();
        int b=a;
        ++a;
        System.out.println("No thanks ");
        System.out.println("by the way A just incremented from "+ b +" to "+a+" ");
    }
    
}

class text{
    public static void main(String arr[]){
        
        this_constructor o1=new this_constructor();  
    }
}
