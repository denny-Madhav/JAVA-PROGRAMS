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
public class classPractice {
    
     public static void main(String arr[]){
        
        arthematic o1= new arthematic();
        
        o1.circle(5);
        o1.square(5);
        o1.rectangle(10, 5);
        o1.triangle(10,5);
    }
    
}

class arthematic{
    
    void circle( int c){
        System.out.println("Radius : "+c);
        System.out.println("Area of circle : "+3.14*c*c+"/n");
    }
    
    void square(int s){
        System.out.println("Area of square : "+s*s);
    }
    
    void rectangle(int l,int w){
        System.out.println("Length : "+l+" width : "+w);
        System.out.println("Area of Rectangle: "+l*w+"/n");
    }
    
    void triangle (int l, int b){
        System.out.println("Area of triangle : "+0.5*l*b);
    }
    
}

