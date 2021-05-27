/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4th.CA.CA1;
 import java.util.Scanner;

/**
 *
 * @author lenov
 */
public class shivam {
    public static void main(String arr[]){
        
    int age;
    int age2;
    int age3;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the ages of 3 person to check who has greater and who has the lowest age: ");
    age = sc.nextInt();
    age2 = sc.nextInt();
    age3 = sc.nextInt();
        if (age>age2 && age>age3){
            System.out.println("Age of 1st person is greater than age of 2nd and 3rd person.");
            if(age2>age3)
            {
                System.out.println("3rd pweson is smallest");
            }
            
            else{
                System.out.println("2nd pweson is smallest");
            }
        }
        else if (age2>age && age2>age3){
            System.out.println("Age of 2nd person is greater than age of 3rd and 1st person.");
            if(age>age3)
            {
                System.out.println("3rd pweson is smallest");
            }
            
            else{
                System.out.println("1st pweson is smallest");
            }
        }
        else if(age3>age && age3>age2){
            System.out.println("Age of 3rd person is greater than age of 1st and 2nd person.");
            if(age>age2)
            {
                System.out.println("2nd pweson is smallest");
            }
            
            else{
                System.out.println("1st pweson is smallest");
            }
        }
        
    }
    
    
    
}
