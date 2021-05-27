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
public class classPrac2 {
    public static void main(String arr[]){
        bank obj= new bank(445566,"denny",2000);
        
        obj.deposit(600);
        obj.withdraw(275);
        obj.display();
    }
    
}

class bank{
    long acc;
    String name;
    int money;
    
    bank(int a,String n, int bal){
        acc=a;
        name=n;
        money=bal;
       } 
        void deposit(int am){ 
        System.out.println("Deposited amount: "+am);
        money=money+am; 
        System.out.println("Amount after deposit: "+money);
        }
        
        void withdraw(int wd){
            System.out.println("withdrawn amount: "+wd);
            money=money-wd;
            System.out.println("Amount after withdraw: "+money);
        }
        
        void display(){
            
            System.out.println("\n"+"ACC no : "+acc+"\n"+"NAME : "+name+"\n"+"CURRENT BALANCE : "+money+"\n");
              
        }
        
}

