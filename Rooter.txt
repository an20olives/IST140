/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rooter;
import java.util.Scanner;
//import java.text.DecimalFormat;

/**
 *
 * @author aro
 */
public class Rooter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Sets up scanner for user input
        Scanner scan = new Scanner(System.in);
        // declare root 
        int root;
        root = 0;
        
        // Asks  user for number greater than  0, if not then program asks again. 
        while(root <= 0){    
            System.out.println("Please enter a number to square root: ");
            root = scan.nextInt();
            
            // Runs if the entered number is not greater than 0.
            if(root <= 0){
                System.out.format("Please enter a number greater than 0: \n", root);
            }}
        // If input is greater than 0 square root is calculated using math.sqrt to also give us 4th decimal place with descending roots. 
        while(root != -1){
            System.out.format("The square root of %d is %.4f%n", root, Math.sqrt(root));
            root--;
        }
        
    }
    
}
