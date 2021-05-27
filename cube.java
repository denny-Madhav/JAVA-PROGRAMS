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
public class cube {
    static int a;
    
   public cube(int b){
        a=b*b*b;
         
    }
    void display(){
        System.out.println("cube of "+"5"+" = "+a);
    }
    }
class test{
     public static void main(String arr[]){
       cube o1=new cube(5);
       o1.display();
    }
}
