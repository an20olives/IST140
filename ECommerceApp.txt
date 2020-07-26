/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommerceapp;
import java.util.Scanner;

/**
 *
 * @author aro
 */
public class ECommerceApp {

    /**
     * @param args the command line arguments
     */
    
    // Static strings for productCatalog, productPrice, taxCost, and totalCost for products
    static String productsCatalog;
    static double productPrice, taxCost, totalCost;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Setup scanner for user input
        Scanner scan = new Scanner(System.in);
        
        // prints the banner to the user
        bannerPrinter();
        
        // asks user for input to search productsCatalog for entered product
        String products = productsBuilder();
        System.out.print("Enter the required product: ");
        String productSearch = scan.nextLine();
        
        
        // if else statement that if finds the product collects price, gets tax and total cost and outputs to user.
        // if statement cannot find product, prints that product can not be found. 
        if(getOrder(productSearch)){
            getPrice();
            getTax(productPrice);
            getTotal(productPrice,taxCost);
            printTotal(totalCost);
        }
         // if statement cannot find product, prints that product can not be found. 
        else{
            System.out.println("The product was not found.");
        }
    }
    
    
    
    // Sets up bannerPrinter to print banner in console
    public static void bannerPrinter(){
        System.out.println("******************************************");
        System.out.println("====== Welcome to my eCommerce app! ======");
        System.out.println("******************************************\n");
    }
    
    // productBuilder and productCatalog which contains 3 items each, 10 characters long
    public static String productsBuilder(){
        
        productsCatalog = "computer   keyboard   desk      ";
        return productsCatalog;
    }
    
    // gets product order from scanner and converts to lowercase. If product is in catalog returns true and continues if false stops
    public static boolean getOrder(String productSearch){
        if(productsCatalog.toLowerCase().contains(productSearch.toLowerCase())){
            return true;
        }
        else{ 
            return false;
        }
    }
    
    // gets a random price for the product using math to generate a random double which returns at productPrice
    public static double getPrice(){
        productPrice = ((Math.random() * 900) + 100) / 100.0;
        return productPrice;
    }
    
    // gets the tax for the total cost which simply multiplies the price by .10 or 10%
    public static double getTax(Double price){
        taxCost = price * 0.10;
        return taxCost;
    }
    
    // gets the total cost by adding the tax cost to the product cost.
    public static double getTotal(double a, double b){
        totalCost = a+b;
        return totalCost;
    }
    
    // prints the total cost in dollar format with correct symbols
    public static void printTotal(Double total){
        System.out.format("Your sale total is: $%.2f", total);
        System.out.println();
    }
}
