/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package totalweight;

/**
 *
 * @author Anthony Olivieri, aro5132
 */
public class TotalWeight {

    /**
     * @param args the command line arguments
     */
    
    
    // a syntax error from a missing ";" in line 25 caused an error. 
    // a semantic error from an addition sign instead of a multiplication sign in line 28 caused an incorrect value as an output. 
    public static void main(String[] args) {
        // TODO code application logic here
        int weightOfLoaf = 16; // ounces per loaf
        int numberOfLoaves = 4;
        
        System.out.print("With a weight of " + weightOfLoaf + " ounces in each loaf, "); // missing ";" caused failure to run.
        System.out.println("and a total of " + numberOfLoaves + " loaves, ");
        int totalWeight = weightOfLoaf * numberOfLoaves; // addition sign (+) should be multiplication sign (*) for correct answer.
        System.out.println("the total weight of all " + numberOfLoaves + " loaves is " + totalWeight + " ounces.\n");
    }
    
}
