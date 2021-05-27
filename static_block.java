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
public class static_block {
    
    static int n1;
    static  int n2;
    
    static{
        n1=55;
        n2=56;
    }
    
    public static void main(String arr[])
    {
        System.out.println(n1);
        System.out.println(n2);
    }
}
