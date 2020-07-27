/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package incometax;
import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;

/**
 *
 * @author aro
 */
public class IncomeTax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // used to format doubles into x.xx
        NumberFormat formatter = NumberFormat.getCurrencyInstance(); 
        // used to format percentage values
        DecimalFormat df = new DecimalFormat("#%");

        // doubles to hold tax rates and the income limit for if statements
        final double RATE1_SINGLE = 0.15;
        final double RATE2_SINGLE = 0.25;
        final double RATE1_MARRIED = 0.12;
        final double RATE2_MARRIED = 0.20;
        final double INCOME_LIMIT = 30000;
                
        double tax = 0;
        
        // Enter the income amount
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your income: ");
        double income = in.nextDouble();
        
        // Enter marital status
        System.out.print("Please enter marital status: ");
        String maritalStatus = in.next();
        
        // Calculate taxes based on single or married
        if (maritalStatus.equals("single")){
            if (income <= INCOME_LIMIT) {
                tax = RATE1_SINGLE * income;
                
                System.out.println("\nBased on a status of '" + maritalStatus + "' " + "and an annual income of " + formatter.format(income) + ",\n"
                + "the income tax is " + df.format(RATE1_SINGLE) + " of " + formatter.format(income) + ", which equals " + formatter.format(tax) + ".");
            }
            else { 
                tax = RATE2_SINGLE * income;
                
                System.out.println("\nBased on a status of '" + maritalStatus + "' " + "and an annual income of " + formatter.format(income) + ",\n"
                + "the income tax is " + df.format(RATE2_SINGLE) + " of " + formatter.format(income) + ", which equals " + formatter.format(tax) + ".");
            }
        }
        else {
            if (income <= INCOME_LIMIT) {
                tax = RATE1_MARRIED * income;
                
                System.out.println("\nBased on a status of '" + maritalStatus + "' " + "and an annual income of " + formatter.format(income) + ",\n"
                + "the income tax is " + df.format(RATE1_MARRIED) + " of " + formatter.format(income) + ", which equals " + formatter.format(tax) + ".");
            }
            else {
                tax = RATE2_MARRIED * income;
                
                System.out.println("\nBased on a status of '" + maritalStatus + "' " + "and an annual income of " + formatter.format(income) + ",\n"
                + "the income tax is " + df.format(RATE2_MARRIED) + " of " + formatter.format(income) + ", which equals " + formatter.format(tax) + ".");
            }
        }
    }
    
}
