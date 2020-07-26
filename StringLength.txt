/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringlength;

import java.util.Scanner;
/**
 *
 * @author aro
 */
public class StringLength {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        // declare
        String inputString;
        int length;
        
        // request string input
        System.out.println("Please input your string: ");
        inputString = in.nextLine();
        
        // determin string length
        length = inputString.length();
        
        // debug
        // System.out.println(inputString);
        // System.out.println(length);
       
        // print the total characters and the original string
        // System.out.println("Your string: " + inputString + " has a length of: " + length + " Characters.");
        System.out.println("Your string has a length of: " + length + " Characters.");
    }
}
