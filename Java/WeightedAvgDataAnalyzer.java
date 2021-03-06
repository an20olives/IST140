/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weightedavgdataanalyzer;

import java.util.*;
import java.io.*;

/**
 *
 * @author aro
 */

public class WeightedAvgDataAnalyzer {
    
    public static void main(String[] args) throws FileNotFoundException {
        // Sets up the array list containing the doubles from the file read out. 
        ArrayList<Double> inputValues = readData();
        double weightedAverage = calculateWeightedAvgerage(inputValues);
        printResults(inputValues, weightedAverage);
    }
    
    // method for printing the averaged results to an output file
    private static void printResults(ArrayList<Double> inputValues, double weightedAverage) {
        // Prompts the user to enter the name of the file to output the averages.
        System.out.print("Enter output file name: ");
        // sets up the scanner and uses the scanner to get the name of the outputFile.
        Scanner input = new Scanner(System.in);
        String outputFile = input.nextLine();
            try // uses try and catch to take the average values and print them into the specified outputFile
            {
                PrintWriter writer = new PrintWriter(outputFile);
                writer.print("The weighted average of the numbers is " + weightedAverage + ", when using the data ");
                    for (int i = 2; i < inputValues.size(); i++) 
                    {
                        writer.print(inputValues.get(i) + ", ");
                    }                 
                writer.println("where " + inputValues.get(0) + " is the weight used, and the average is computed after dropping the lowest " + Integer.valueOf((int) inputValues.get(1).doubleValue()) + " values.");
                writer.close(); // closes the writer to save resources. 
            } 
            catch (FileNotFoundException exception) // catch to throw an excpetion if the input file containing the data is not found. 
            {
            exception.printStackTrace();     
            }
    }
    
    // method for calculating the weighted average of the values in the input file 
    private static double calculateWeightedAvgerage(ArrayList<Double> inputValues) {
            
        // declare required values, doubles, and new array list to calculate the average from the files.
        double sum = 0;
        double average;
        double weight = inputValues.get(0);
        int valuesToDrop = Integer.valueOf((int) inputValues.get(1).doubleValue());
        ArrayList<Double> newList = new ArrayList<>();

        // using for loops to calculate the averages from the values, and returning the average of the values at the end of the for loops
        for (int i = 2; i < inputValues.size(); i++) 
        {
            newList.add(inputValues.get(i));
        }                  
        Collections.sort(newList); 
        for (int i = (valuesToDrop); i < newList.size(); i++) 
        {
            sum += weight * newList.get(i);
        }
        average = sum / (newList.size() - valuesToDrop);         
        return average;
    }

    // method for reading the data from the input file and allowing for repeated entries
    private static ArrayList<Double> readData() throws FileNotFoundException {
        // declare needed double, string, scanner, and new ArrayList for getting the inputValues from the entered file.
        ArrayList<Double> inputValues = new ArrayList<>();
        String inputFileName;
        double value;
        Scanner input = new Scanner(System.in);
        File file;
        
        // Asks the user to enter the name of the input file
        System.out.print("Enter the name of the input file: ");
        
        do
        {
            // gets the name of the input file from the user at the next line
            inputFileName = input.nextLine();
            file = new File(inputFileName);
            try 
            {
                // uses hasNextDouble to check ahead of time whether there’s a double in the data
                input = new Scanner(file);
                while (input.hasNextDouble()) 
                {
                    value = input.nextDouble();
                    inputValues.add(value);
                }
            } 
            // catch for incorrect file name entered
            catch (FileNotFoundException exception) 
            {
                System.out.println("File not found!");
                System.out.println("Please enter file name again: ");
            }
        } 
        while (!file.exists() && !file.isDirectory());
        return inputValues;
    }
}
