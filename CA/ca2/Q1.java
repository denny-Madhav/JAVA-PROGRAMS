/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4th.CA.CA2;

/**
 *
 * @author lenov
 */
public class Q1 {
              public static void main(String arr[])
              {
               daughter d= new daughter();
               System.out.println("Grand father name: "+d.gfname);
               System.out.println("Father name: "+d.fname);
               System.out.println("Daughter name: "+d.dname);
              }
      
}
class grandfather{
    String gfname="Amitabh Bachchan";
}

class father extends grandfather{
    String fname="Abhishek Bachchan";   
}

class daughter extends father{
    String dname="Aaradhya";
}


