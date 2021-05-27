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
public class this_demo {
    int rn=56;
    long nn=555;
    
    this_demo(int rn,long nn){
        this.rn=rn;
        this.nn=nn;
    }
    
    void display(){
        System.out.println(rn+" "+nn);
    }
    
}

class test_this{
    public static void main(String arr[]){
        this_demo t1 = new this_demo(45,555555555);
        this_demo t2 = new this_demo(46,666666666);
        t1.display();
        t2.display();
    }
    
}
