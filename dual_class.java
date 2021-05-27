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
 class dc {    
 double contact;
 String name;
 int salary; 
}
public class dual_class{
public static void main(String[] args) {
		dc t= new dc();
		t.contact=1234567890;
		t.name="denny";
                t.salary=45000;
                 System.out.println("contact="+t.contact);
                 System.out.println("name="+t.name);
                 System.out.println("salary="+t.salary);
                 
                 dc s= new dc();
                 s.contact=1134567890;
                 s.name="herpreet";
                 s.salary=55000;
                 System.out.println("contact="+s.contact);
                 System.out.println("name="+s.name);
                 System.out.println("salary="+s.salary);
                 
                 
	}

    }

