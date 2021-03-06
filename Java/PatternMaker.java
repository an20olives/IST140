/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patternmaker;
import java.util.Scanner;

/**
 *
 * @author aro
 */
public class PatternMaker {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Declare setup for pattern using scanner
        Scanner scan = new Scanner(System.in);
        
        int patternRows;
        int patternColumns;
        String startPattern;
        String endPattern;
        String patternSeperater;
        
        // Asks user for input for number of pattern rows
        System.out.println("Enter a number between 1 and 10 to represent rows: ");
        patternRows = scan.nextInt();
        
        // Asks user for input for number of pattern columns
        System.out.println("Enter another number between 1 and 10 to represent columns: ");
        patternColumns = scan.nextInt();

        // Asks user for input for pattern start ie. XX
        System.out.println("Enter a string to start your pattern: ");
        startPattern = scan.next();
        
        // Asks user for input for pattern end ie. OO
        System.out.println("Enter a string to end your pattern: ");
        endPattern = scan.next();
        
        // Asks user for input for pattern seperater ie. ***
        System.out.println("Enter a string that will seperate the start and end of pattern: ");
        patternSeperater = scan.next();

        
        // loop is used to make pattern passed on input rows and columns, then combine user symbols for pattern. 
     // Using r for rows and, c for columns
        for (int r = 0; r < patternRows; r++) {
        for (int c = 0; c < patternColumns; c++) {
            if (c != 0) {
               System.out.print(patternSeperater);
            }
        if (r % 2 == 0) {

            if (c % 2 == 0) {
                System.out.print(startPattern);
            }
            else {
                System.out.print(endPattern);
            }
        } 
        
        else if (c % 2 == 0) {
                 System.out.print(endPattern);
            }   
            else {
            System.out.print(startPattern);
        }

    }
    System.out.println("");
        }
    }
    
}
