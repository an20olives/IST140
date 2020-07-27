/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charcounter;
import java.util.Scanner;

/**
 *
 * @author aro
 */
public class CharCounter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String inputEntry;
        String inputCharacter;
        int count = 0;
        
        
        // Scanner object for user input
        Scanner scnr = new Scanner(System.in);
        System.out.println("Enter word: ");        
        inputEntry = scnr.nextLine();
        System.out.println("Enter character: ");
        inputCharacter = scnr.nextLine();
        
        // if else statement to ensure inputCharacter can be only one character.
        if (inputCharacter.length() > 1) { 
            System.out.println("Not enough feedback");
        }
        
        else {
        int charLength = inputCharacter.length();
        int index = inputEntry.indexOf(inputCharacter);
        
        // while loop to determing how many times the inputCharacter occurs in the inputString
        while (index < inputEntry.length() && index !=-1)
        {
            index = inputEntry.indexOf(inputCharacter, index + charLength);
            count++;
        }
        
           // Print for number of occurences of inputCharacter
         System.out.println("There is " + count + " occurence(s) of " + inputCharacter + " in " + inputEntry + "."); 
        }
    }
    
}
