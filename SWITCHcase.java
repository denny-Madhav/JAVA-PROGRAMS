/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4th.sem;
import java.util.Scanner;

/**
 *
 * @author lenov
 */
public class SWITCHcase {
      public static void main(String[] args) {
          Scanner obj=new Scanner(System.in);
          
          System.out.println("Enter size in numeric");
        int number = obj.nextInt();
        String size;

        // switch statement to check size
        switch (number) {

            case 29:
                size = "Small";
                break;

            case 42:
                size = "Medium";
                break;

            // match the value of week
            case 44:
                size = "Large";
                break;

            case 48:
                size = "Extra Large";
                break;

            default:
                size = "Unknown";
                break;
        }
        System.out.println(size);
    }

}
