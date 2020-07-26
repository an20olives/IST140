/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distancecalc;

/**
 *
 * @author aro
 */
import java.util.Scanner;
        
public class DistanceCalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner( System.in);
        
        // declaring variables
        double userGallons;
        double userMPG;
        double userDistance;
        
        // request gas tank size
        System.out.println("Please enter present gallons of fuel in gas tank: ");
        userGallons = scanner.nextDouble();
        
        // request vehcile mpg
        System.out.println("Please enter Miles Per Gallon of vehicle: ");
        userMPG = scanner.nextDouble();
        
        // calculate miles travelable
        userDistance = userMPG * userGallons;
        // rounds to the nearest 100th
        double roundOff = Math.round(userDistance * 100) / 100.0;
        
        // print calculation
        System.out.println( "You are able to travel " + roundOff + " miles on remaining fuel.");
    }
    
}
