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
public class multi_inheritence {
    
    public static void main(String arr[]){
        son s1=new son();
        System.out.println(s1.nu);
        System.out.println(s1.bus);
        System.out.println(s1.name);
    }
    
}

class father extends gf{
    String bus="yoo";
}

class son extends father {//EXTENDS key word must be used to do this inheritence
    String name="yoo";
}

class gf{
    int nu=45;
}
