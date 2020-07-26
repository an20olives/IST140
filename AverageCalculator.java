/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package averagecalculator;
/**
 *
 * @author aro
 */

import java.util.Scanner;

public class AverageCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        System.out.print("Input first number: ");
        double num1 = in.nextDouble();
        
        System.out.print("Input second number: ");
        double num2 = in.nextDouble();
        
        System.out.print("Input third number: ");
        double num3 = in.nextDouble();
        
        
        System.out.print("The average of: ");
        System.out.print(num1 + ", " + num2 + ", and " + num3);
        System.out.println(" is: " + (num1 + num2 + num3) / 3 );
    }
    
}
