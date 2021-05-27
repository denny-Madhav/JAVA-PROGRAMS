/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4th.sem.SuperClass;

/**
 *
 * @author lenov
 */
public class Emp {
    
    int id;
    String name;
    
     Emp(int id, String name){
         this.id=id;
         this.name=name;
    
}
    
}

class person extends Emp{
    int salary;
    person(int id,String name,int salary)
    {
        super(id,name);
        this.salary=salary;
    }
    
    void show()
    {
        System.out.println(id+" "+name+" "+salary);
    }
    
}

class test{
    
    public static void main(String arr[])
    {
        person p1=new person(33,"john",45000);
        p1.show();
    }
}
