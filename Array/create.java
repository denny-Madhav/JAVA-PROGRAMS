/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4th.sem.Array;

/**
 *
 * @author lenov
 */
public class create {
    
    //single diemntional array

public static void main(String arg[])
{
int arr[] = new int[10];//declaration & instantiation
arr[0]=40;
arr[1]=30;
arr[2]=60;
arr[3]=70;
arr[4]=80;
arr[5]=90;
arr[6]=10;
arr[7]=20;
arr[8]=50;
arr[9]=100;
//traverse array
for(int i=0;i<arr.length;i++)
System.out.println(arr[i]);

}
}
