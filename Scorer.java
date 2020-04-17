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
        Scanner scan = new Scanner(System.in);
        double[][] scores = new double[3][3]; //initialize the 2D Array
        int x=0;
        
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
        for(int i = 0; i < 3; i++)
       {
            double average = 0; // init variable to hold the average of each row
            for(int j = 0; j < 3; j++) //re-using our test print code to loop through each row
            {
                average = average + a[i][j];
            }
        }
        printAverage();
    }
    public static void printAverage(){
        System.out.format("The average of row %d is %5.2f\n\n",(i+1), average);

    }
}
