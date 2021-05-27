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
 class  info{
    
    int id;
    String name;
    void assign(int a,String b)
    {
       id=a;
       name=b;
    }
    void out(){
        System.out.println("Name = "+name+"\n"+"ID = "+id);
    }
    
}

 class class_method
{
    public static void main(String arr[]){
        info hmm= new info();
        hmm.assign(45,"denny");
        hmm.out();
    }
}
