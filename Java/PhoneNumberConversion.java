/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonenumberconversion;

/**
 *
 * @author aro
 */

import java.util.Scanner;

public class PhoneNumberConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        String phoneNumber;
       
        // input phone 10 digit phone number
        System.out.print("Input 10 digit phone number: ");
        phoneNumber = in.nextLine();
        
        // test to print ignore
        // System.out.println(phoneNumber + " debug");
        
        // use sub strings to organize numbers as needed
        String sub1 = phoneNumber.substring(0,3);
        String sub2 = phoneNumber.substring(3,6);
        String sub3 = phoneNumber.substring(6,10);
        
        // tests to print ignore
        // System.out.println(sub1 + " debug");
        // System.out.println(sub2 + " debug");
        // System.out.println(sub3 + " debug");
        
        // print substring in required format
        System.out.print("(" + sub1 + ") ");
        System.out.print(sub2 + " - ");
        System.out.println(sub3);

    }
    
}
