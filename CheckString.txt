/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkstring;

import java.util.*;
import java.io.*;
/**
 *
 * @author aro
 */
public class CheckString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // declare needed variables
        String file = "data.txt";
        
        // prints string from getWord method
        System.out.println(getWord());
        // puts strings into the stringArray
        ArrayList<String> testData = new ArrayList<>();
        testData.add("Hello world!");
        testData.add("Its Anthony");
        testData.add("Can I have summer now?");
        
        // writeFile takes the array testData and adds it to our "file". 
        writeFile(testData,file);
        // declares and initializes array with the output from readFile
        ArrayList<String> fileContents = readFile(file);
                
        // for loop to print fileContents
        for(int x = 0; x < fileContents.size(); x++) {
            System.out.println(fileContents.get(x));
        } 
    }
    
    // method to check a  word from the user, checks to make sure only a string is entered. 
    public static void checkWord(String word) throws Exception { 
       // try and catch used to ensure that entered characters are letters, and sets up exception if not
       try
       {
           char firstCharacter = word.charAt(0);
           // checks if first character is a letter, if not then an exception is thrown.
           if(!Character.isLetter(firstCharacter)){
               throw new Exception("This is not a word: ");
           }
       } 
       // catch seting up the exception
       catch(Exception exception)
       {
           System.out.printf(exception.getMessage());
       }
    }
    
    
    // method to get a new word from the user using a scanner
    public static String getWord() throws Exception {
        // sets up scanner to get input from the user
        Scanner scan = new Scanner(System.in);
        // declare string to hold the user input
        String userInput;
        // asks user for a string to store in userInput using a scanner.
        System.out.print("Enter a string: ");
        userInput = scan.nextLine();
        // uses checkWord method to ensure that the entered string is a string, if not throws an exception
        checkWord(userInput);
        
        // returns user input
        return userInput;
    }

    // method to write to the "file" 
    public static void writeFile(ArrayList<String> arrayToWrite, String filename) throws Exception{
        // declares new file and uses a writer to write to the file
        File file = new File(filename);
        file.createNewFile();
        FileWriter writer = new FileWriter(file);
        
        // for loop to write the array
        for(int x = 0; x < arrayToWrite.size(); x++)
        {
            writer.write(arrayToWrite.get(x) + "\n");
        }
        // closes the writer to save resources
        writer.flush();
        writer.close();
    }
    
    // method to read the  file
    public static ArrayList<String> readFile(String filename) throws Exception{
        
        // array to hold the files contents
        ArrayList<String> fileContents = new ArrayList<String>();
        String line;
        // reads the file
        FileReader fileReader = new FileReader(filename);
        BufferedReader bufferReader = new BufferedReader(fileReader);
        while((line = bufferReader.readLine()) != null) 
        {
            fileContents.add(line);
        }
        // closes and returns the reader to save resources
        bufferReader.close();
        return fileContents;
        }
    }
