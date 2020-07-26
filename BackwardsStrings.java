/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backwardsstrings;

import java.util.Scanner;
/**
 *
 * @author aro
 */
public class BackwardsStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        
        // Strings
        System.out.println("Enter 3 character string: ");
        String first = in.next();

        System.out.println("Enter second 3 character string: ");
        String second = in.next();
        
        // Print normal strings
        String firstSet = first + " " + second;

        if (firstSet.length() > 7) {
            
            System.out.println("Invalid string length for one or both inputs.");
        }
        else {
        System.out.println("The two strings you entered are: " + firstSet);        
        
        // Print reversed strings
        System.out.println("The two strings in reverse are: " + reverseString(firstSet));
   
          }
    }
    
    // Controls string reversing
    static String reverseString(String s) {
        if(s.length() == 0)
            return "";
            return s.charAt(s.length() - 1) + reverseString(s.substring(0,s.length()-1));
    }
    
}
