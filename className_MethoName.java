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
class stud{
    
    int reg;
    int sr;
    static int school;
    
    stud(int a,int b){
        this.reg=a;
        this.sr=b;
        school++;  
    }
    
   void display(){
       System.out.println(reg+" "+sr+" "+school);
   }
   
   public static void main(String arr[]){
       
       stud s1=new stud(11994545,32);
       stud s2=new stud(11993545,72);
       stud s3=new stud(11996545,53);
       stud s4=new stud(11984545,29);
       stud s5=new stud(1294545,07);
       s1.display();
       s2.display();
       s3.display();
       s4.display();
       s5.display();
       
   }
}