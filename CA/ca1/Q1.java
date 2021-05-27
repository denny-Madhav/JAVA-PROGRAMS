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


public class Q1 {
    
    public static void main(String args[]){  
  int type;
   //It is the number variable to be checked for palindrome  
  Scanner ip = new Scanner(System.in);
  System.out.println("--------- Find weather a String or integer is palindrome or not ---------");
  System.out.println("If String give input as = 0");
  System.out.println("If Integer give input as = 1");
  type=ip.nextInt();
  if(type==0)
  {  
     String str,rev ="";
      System.out.println("Enter a string:");
      Scanner s = new Scanner(System.in);
      str=s.nextLine();
      int len=str.length();

      for (int i=len-1;i>=0;i--)
         rev=rev+str.charAt(i);
 
      if (str.equals(rev)){
         System.out.println(str+" is a palindrome");
      }
      else{
         System.out.println(str+" is not a palindrome"); 
      } }
  else if(type==1){
      
      int r,res=0,t;    
  int n;
  System.out.println("Enter a Number:");
      n=ip.nextInt();
  t=n;  
  while(n>0){    
   r=n%10;   
   res=(res*10)+r;    
   n=n/10;    
  }    
  if(t==res) {   
   System.out.println(t+" is palindrome number."); 
  }   
  else{
   System.out.println(t+" is not palindrome number."); 
  } }
  else{
      System.out.println("INVALID INPUT, TRY AGAIN.");
  }  }  }
