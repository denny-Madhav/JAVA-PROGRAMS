/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4th.sem.POLYMORPHISEM;

/**
 *
 * @author lenov
 */
public class shape
{
    void draw(){
        System.out.println("parent");
    }
}

 class triangle extends shape{
     void draw(){
     System.out.println("child triangle");
     }
 }

class circle extends shape{
    void draw(){
     System.out.println("child circle");
     }
    
}

class square extends shape{
    void draw(){
     System.out.println("child square");
     }
    
}
class finall{
    public static void main(String arr[]){
     shape o5= new shape();
     o5=draw();
    shape o1= new triangle();
    o1.draw();
    shape o2= new circle();
    o2.draw();
    shape o3= new square();
    o3.draw();
    }
    
}
