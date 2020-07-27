/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordchecker;

import java.util.Scanner;


/**
 *
 * @author aro
 */
public class PasswordChecker {

    /**
     * @param args the command line arguments
     */
    
    public static final int exactPassLength = 3; 

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        
        // Password requirements presented to the user.
        System.out.print(
           "1. A password must be exactly three character. \n"  +
           "2. A password must contain atleast one digit. \n" + 
           "3. A password must contain atleast one uppercase character. \n " + 
           "Input a password: ");
        String passwordInput = input.nextLine();
        
        if (validPassword(passwordInput)) {
            System.out.println("The provided password is valid.");
        }
        else { 
            System.out.print("The provided password is invalid because it must be three characters in length and include at least one digit and at least one uppercase character. Please try again.");
        }
     
    }
    // Sets the limit on the length of the password ensuring it can only be 3 characters long
    public static boolean validPassword(String password){
        if (password.length() < exactPassLength) return false;
        if (password.length() > exactPassLength) return false;
        
        
        // Keep track of the amount of characters and numbers in the password to check requirements.
        int characterCount = 0;
        int numberCount = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            
            // Adds to each count depending on what is input
            if (isNumber(ch)) numberCount++;
            else if (isLetter(ch)) characterCount++;
            else return false;
            
        }
      
        return (characterCount >= 1 && numberCount >= 1);
        
    }
    
    // Looks for uppercase characters in the password
    public static boolean isLetter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }
    
    // Looks for numbers in the password
    public static boolean isNumber(char ch) {
        
        return (ch >= '0' && ch <= '9');
    }
}
