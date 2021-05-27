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
public class break_statment {
    public static void main(String arr[]){
       System.out.println("BREAK=");
        for(int i=0;i<100;i=i+10)
        {
            if(i==40)
            {
                if (i>65)
                {
                 break;   
                }
                i=i-5;
                continue;
            }
            System.out.println(i);
        }
            
    }
    }
   // single line comment

/* multiple
      line
     comment
*/