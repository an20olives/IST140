/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scorer;
import java.util.Scanner;

/**
 *
 * @author aro
 */
public class Scorer {

    public static double average;
    // sets up the 2D array 
    public static double[][] score = new double[3][3];
    
    public static void main(String[] args) {
        getInput();
        scoreOutput();
    }
    
    // method for getting the input from the user
    public static void getInput(){
        Scanner scan = new Scanner(System.in);
        int x=0;
	//uses while loop to get inputs along with scanner to store in array
        while (x!=3){
          int i = 0;
           while(i != 3){
               // gets the input from the user and stores it in the array.
               System.out.println("Enter 9 numbers, press 'enter' after each: ");
               score[x][i] = scan.nextDouble();
               i++;
           }
        x++;
        }
    }
    
    // gets the average of the rows using a for loop
    public static double getRowAverage(int a){
        double rowAverage = 0;
        int total = 0;
        for (int i = 0; i < 3; i++){
            total += score[a][i];
        }
        rowAverage += total/3;
        return rowAverage;
    }
    
    // take the average of each row and prints to the user
    public static void scoreOutput(){
        for (int i = 0; i<3; i++){
              System.out.printf("The average of row %d is %5.2f\n\n",(i+1), getRowAverage(i));
        }
    }

}


