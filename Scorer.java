/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scorer;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author aro
 */
public class scorer {
    
    public static void main(String[] args) {    
        getInput();
    } 
        
    public static void getInput(){
        // sets up the scanner to accept user input. 
        Scanner scan = new Scanner(System.in);
        // sets up the 2D array
        double[][] scores = new double[3][3];
        int x=0;
        
       // while loop to get user input and store them in the array.
       while(x!=3){
           int i = 0;
           while(i != 3){
               System.out.println("Enter a number: ");
               scores[x][i] = scan.nextDouble();
               i++;
           }
        x++;
       }
      scoreAverage(scores);
    }
    
    
    public static void scoreAverage(double[][] a){
        
        // for loop to find the average of each loop in the array. 
        for(int i = 0; i < 3; i++){
            
            //holds the average of each row
            double average = 0;
            for(int j = 0; j < 3; j++)
            {
                average = average + a[i][j];
            }
        }
        printAverage();
    }
    
    // We need to get printAverage to take everything from the other methods and print each row and the average without repeating.
    public static void printAverage(){
        System.out.format("The average of row %d is %5.2f\n\n",(i+1), average);
    // our problem is here
    }
}
