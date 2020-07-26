/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parser;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author aro
 */
public class Parser {

    /**
     * @param args the command line arguments
     */
    
    //declare string and array for use between methods. 
    public static String userInput;
    public static String[] intOnly;
    public static ArrayList<Integer> intList;
    
    public static void main(String[] args) {
        //call all methods for use
        getInput();
        intArray();
        printArray();
    }
    
    //method for getting the input from the user using scanner
    public static String getInput(){
        Scanner scan = new Scanner(System.in);
        
        //scanner requests input and stores it in userInput
        userInput = null;
        System.out.println("Enter a string of numbers seperated by a comma: ");
        userInput = scan.nextLine();
        
        return userInput;
    }
    
    //method for creating the array and storing userInput without ", "
    public static void intArray(){
        intList = new ArrayList<Integer>();
        intOnly = userInput.split(", ");
    }
    
    //method for priting the array
    public static void printArray(){
        //uses wild loop to print each array character on a seperate line. 
        for(String x: intOnly){
            intList.add(Integer.parseInt(x));
            System.out.println(x);
        }
    }
}
