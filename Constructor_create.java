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
public class Constructor_create {
        int x;
    Constructor_create(int y)
    {
        x=y;
        System.out.println(x);
        
    }
   public static void main(String arr[]){
      Constructor_create con= new Constructor_create(5);
   }
    
}


