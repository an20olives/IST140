/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package averagewithmethods;
import java.util.Scanner;

/**
 *
 * @author aro
 */
public class AverageWithMethods {
     static Scanner in=new Scanner(System.in);
     
     //Function is used to return a string of integers
     public static int[] getUserNumber(){
         
          int n,i=0,num = 0;
          // 'a' will represent our string of integers
          int[] a=new int[5];
          
          //Prompt the user to enter the numbers
          System.out.println("Enter the numbers:");
          
          //Executes the while statement until it reaches the end of the array
          while(i<a.length){
              a[i]=in.nextInt();
              i++;
          }
          //Return 'a' the string of integers
          return a;
     }
     
     public static double avgerage(int a[]){
         
          //Declare and initialize necessary variables
          int i,sum=0;
          double avgerage;
          
          for(i=0;i<a.length;i++){
              
              //Calculate the sum of integers
              sum=sum+a[i];
          }

          //Find the average of the entered integers
          avgerage=(float)sum/a.length;

          //Returns the average
          return avgerage;

     }


     public static void printIntegers(int a[]){

          //Print the string
          System.out.print("The average of the numbers");

          //Create "for" to iterate over array elements
          for(int i=0;i<a.length;i++)

              //Print the elements with spaces
              System.out.print(" "+a[i]);

          //Print the average with two decimal places
          System.out.printf(" is %.2f",avgerage(a));
          System.out.println();

     }


     public static void main(String[] args){

          //getUserNumber assigned to 'b' from the array
          int[] b = getUserNumber();

          //prints the output
          printIntegers(b);

     }

}
