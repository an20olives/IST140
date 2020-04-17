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

    // sets up required array and string for input and arrayList
    public static String inputWord;
    public static ArrayList<Character> characterNames = new ArrayList<>();

    
    public static void main(String[] args) {
        getInput();
        arraySlice();
        printOutput();
    }
    
    // method for getting the input of the user using a scanner
    public static void getInput(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        inputWord = scan.nextLine();
    }
    
    // method for taking the array and seperating each letter on a line.
    public static void arraySlice(){
        for (int i = 0; i < inputWord.length(); i++){
            characterNames.add(inputWord.charAt(i));
            System.out.println(inputWord.charAt(i));

        }
    }
    
    public static void printOutput(){
    }
}
