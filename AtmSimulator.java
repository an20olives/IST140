/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmsimulator;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author aro
 */
public class AtmSimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here	
        	Scanner sc = new Scanner(System.in); 
                
                // used to format doubles into x.xx
                NumberFormat formatter = NumberFormat.getCurrencyInstance(); 

        
                // This makes the main account
		BankAccount bankMain = new BankAccount();
		bankMain.setBalance(0.00);

		boolean atmSession = true;

		while (atmSession) {

                    
			// Presents user with ATM menu options
			System.out.print("Enter the number of your desired transaction type.\n\n"
                                + "1. Balance \n"
                                + "2. Deposit \n"
                                + "3. Withdraw\n"
                                + "4. Quit\n"
				+ "\nEnter desired transaction: ");

			int selection = sc.nextInt();


			switch (selection) {
                                
                                // handles balance checking
				case 1:
                                    
                                    System.out.println("\nYour current balance is: " + formatter.format(bankMain.getBalance()));
					
                                    break;
                                    
                                // handles all deposits
				case 2:
                                    
                                    System.out.println("Enter deposit amount: ");
                                    double deposit = sc.nextDouble();

                                    bankMain.deposit(deposit);

                                    System.out.println("\nYour current balance is now: " + formatter.format(bankMain.getBalance()) + "\n");
						
                                    break;

                                // handles all withdraws 
				case 3:
					                                    
                                    System.out.println("How much money would you like to withdraw?");
                                    double withdraw = sc.nextDouble();
                                    
                                            // if else statement is used to check balance and insure an overdraw does not occur, if so returns error and represent ATM menu.
                                            if (bankMain.balance >= withdraw )
                                            
                                              {
                                                    
                                                bankMain.withdraw(withdraw);
                                                System.out.println("\nYour current balance is : " + formatter.format(bankMain.getBalance()) + "\n");
                                                
                                              }
                                            
                                            else
                                                
                                              {
                                                    
						System.out.println("Insufficient funds. Your current balance is: " + formatter.format(bankMain.getBalance()) + "\n");
                                                
                                              }
                                    break;				

                                // handles quitting of ATM menu
                                case 4:
					atmSession = false;
					
                                    break;     
                                    
                                    
                                // handles input of invalid menu choice       
                                default:
                                    
                                       System.err.println("Invalid menu choice.");
                                       atmSession = false;
                                       
                                    break;
                                
			}				 	
			
		}

		System.out.println("Good-bye");
                
	}

}

// Classes used to make ATM function
class BankAccount {
        
        // the actual account balance
	double balance;

        // sets the bank accounts balance and keep memory of what it is
	void setBalance(double accountBalance) {
		
		balance = accountBalance;
	}
        // allows for deposits into balance
	void deposit(double deposit) {
		
                // allows for adding whatever amount is deposited into balance
		balance += deposit;
	}
        // allows for withdraws from balance
	void withdraw(double withdraw) {
		
                // Same as deposit but functions with subtraction from balance
		balance -= withdraw;
	}
        // gets the current amount stored in balance
	double getBalance() {
		
		return balance;
	}
    
}
