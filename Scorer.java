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
    
    public static void main(String[] args) {
    }
    
    public static void getInput(){
        Scanner scan = new Scanner(System.in);
        double[][] score = new double[3][3]; // sets up our 2D array
        int x=0;
        while (x!=3){
           int i = 0;
           while(i != 3){
               System.out.println("Enter a number: ");
               score[x][i] = scan.nextDouble();
               i++;
           }
        x++;
        }
        averageScore(score);
    }
    
    public static void averageScore(double[][] a){
        for (int i = 0; i < 3; i++){
            double average = 0;
            for(int j = 0; j < 3; j++){
                average = average + a[i][j];
            }
        }
    }
    
    public static void scoreOutput(int i,double average){
        System.out.format("The average of row %d is %5.2f\n\n",(i+1), average);

    }
}
