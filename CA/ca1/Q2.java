package pkg4th.CA.CA1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author lenov
 */
public class Q2 {
    public static void main(String arr[]){
        int marks;
        System.out.println("Enter marks of one subject:");
        Scanner ip = new Scanner(System.in);
        marks=ip.nextInt();
        
        switch(marks){
                case 81,82,83,84,85,86,87,88,89,90,91,92,93,94,95,96,97,98,99,100:    
                System.out.println("Grade is - A");break;
                
                case 61,62,63,64,65,66,67,68,69,70,71,72,73,74,75,76,77,78,79,80:
                System.out.println("Grade is - B");break;
                
                case 51,52,53,54,55,56,57,58,59,60:
                System.out.println("Grade is - C");break;
                
                case 45,46,47,48,49,50:
                System.out.println("Grade is - D");break;
                
                case 25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44:
                System.out.println("Grade is - E");break;
                
                case 0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24:
                System.out.println("Grade is - F");break;
                
                default:System.out.println("Invalid input, try again.");            
        }
    }
    
}
