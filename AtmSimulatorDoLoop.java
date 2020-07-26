/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package atmsimulatordoloop;
import java.util.Scanner;

        
/**
 *
 * @author aro
 */
public class AtmSimulatorDoLoop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
               
        // Declares bank account starting balance and sets up scanner.
        double startBalance = 1250.69;
        int userInput = 0;
        Scanner scan = new Scanner(System.in);
        
        while(userInput != 4){
            
            // System messages asking for user input of transaction type.
            System.out.printf("Enter the number of your desired transaction type.\n\n"
                + "Current balance: $%1.2f\n"
                + "1. Balance\n"
                + "2. Deposit\n"
                + "3. Withdrawal\n"
                + "4. Quit\n"
                + "\nEnter desired transaction: ", startBalance);
            userInput = scan.nextInt();
        
           
            switch(userInput){
              
                // handles balance checking
                case 1:
                    System.out.printf("Your current balance is, $%1.2f\n\n", startBalance);
                    break;
                    
                // handles all deposits
                case 2:
                    System.out.println("Enter deposit amount: ");
                    double deposit = scan.nextDouble();
                    startBalance = startBalance + deposit;
                    System.out.printf("\nYour current blance is now, $%1.2f\n\n", startBalance);
                    break;
                    
                // handles all withdraws
                case 3:
                    System.out.println("How much money would you like to withdraw?: ");
                    double withdraw = scan.nextDouble();
                          
                    // if else statement is used to check balance and insure an overdraw does not occur, if so returns error and represent ATM menu.
                    if (startBalance >= withdraw )
                                            
                            {
                                startBalance = startBalance - withdraw;
                                System.out.printf("\nYour current balance is now: $%1.2f\n\n", startBalance);                  
                            }
                                            
                    else
                                                
                            {                         
                                System.out.printf("Insufficient funds. Your current balance is: $%1.2f\n\n", startBalance);                  
                            }
                    break;
                    
                // handles quitting of ATM menu
                case 4:
                    System.out.println("Good-bye");
                    break;
                  
                // handles input of invalid menu choice
                default:               
                    System.err.println("Invalid menu choice." + "\n\n");                                       
                    break;
        
            }
        }
    }
}
