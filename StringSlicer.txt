/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringslicer;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author aro
 */
public class StringSlicer {

    public static String inputWord;
    public static ArrayList<Character> characterNames = new ArrayList<Character>();

    
    public static void main(String[] args) {
        getInput();
        arraySlice();
        printOutput();
    }
    //method to get the user input and stores in inputWord
    public static void getInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        inputWord = scan.nextLine();
    }
    
    // method to split the entered string into individual letters using a for loop
    public static void arraySlice(){

        for (int i = 0; i < inputWord.length(); i++){
            characterNames.add(inputWord.charAt(i));
        }
    }
    // prints the output of the array with a letter on each new line
    public static void printOutput(){
        Object[] chars = characterNames.toArray();
        System.out.println();
	for (Object obj : chars){
            System.out.println(obj+" ");
        }
        
        
    }
}
