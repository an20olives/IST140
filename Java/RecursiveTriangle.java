/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursivetriangle;
import java.util.Scanner;


/**
 *
 * @author aro
 */
public class RecursiveTriangle {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args){
          //Gets the number of lines input by the user
          int numLines = getNumberOfLines();

          //Assigns the value from getStringCharacter
          String pattern = getStringCharacter();

          //Calls printRecTriangle
          printTriangle (numLines, pattern);

     }
     
     public static void printTriangle (int numLines, String pattern){

          //Checks if the number of lines equals 0
          if(numLines == 0){
              //Return nothing if the number of lines is 0
              return;
          }

          else{
              // if number of lines is not 0 then prints the recursive pattern
              printPattern(numLines, pattern);
              System.out.println();
              printTriangle(numLines-1, pattern);

          }

     }

     public static void printPattern(int numLines, String pattern){

          //Checks if the number of lines equals 0
          if(numLines == 0){

              //Return nothing if the number of lines is 0
              return;
          }

          //Otherwise

          else{
              // if number of lines is not 0 then prints the recursive pattern
              System.out.print(pattern);
              printPattern(numLines-1, pattern);
          }

     }

     public static int getNumberOfLines(){

          Scanner scan = new Scanner(System.in);

          //Prompt the user to enter number of lines
          System.out.println("Enter the number of desired lines between 1 and 10: ");

          // Captures next user input
          return scan.nextInt();

     }

     public static String getStringCharacter(){

          Scanner scan = new Scanner(System.in);

          //Prompt the user to enter character fore the pattern
          System.out.println("Enter the character for the pattern: ");

          // Captures next user input
          return scan.next();

     }

}
