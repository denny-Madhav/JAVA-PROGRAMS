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

 class method{
    int accno;
    String name;
    double balance;
    public method(int a,String n,double b)
    {
    accno=a;
    name=n;
    balance=b;
    }
    void deposit(double amount)
    {
        balance=balance+amount;
        System.out.println("Deposit: "+amount);
    }
    void withdraw(double withdraw)
    {
        balance=balance-withdraw;
        System.out.println("Withdraw: "+withdraw);
    }
    void SavingAmount()
    {
        System.out.println("Saving Amount: "+balance);
    }
    void display()
    {
        System.out.println(accno+" "+name+" "+balance);
    }
}
    public class BOB{
    public static void main(String[] args) {
        method obj= new method(11111,"Shivam",50000);
        obj.deposit(1000);
        obj.withdraw(200);
        obj.SavingAmount();
        obj.display();
    }
}

