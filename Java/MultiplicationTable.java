/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicationtable;

/**
 *
 * @author aro
 */
public class MultiplicationTable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int tableColumns = 9;
        int tableRows = 9;
        
            System.out.print("   "); // spacing for the column
        for (int j = 1; j <= tableColumns; j++) {
            System.out.printf("%5d", j); // don't need a i * j when i is 1.
       }
            System.out.println();
            System.out.print("   "); // spacing for the column
        for (int j = 1; j <= tableColumns; j++) {
            System.out.print("    -"); // print text instead of numbers
}

        for (int i = 1; i <= tableRows; i++) {
            System.out.println("");
            System.out.printf("%d |", i);

        for (int j = 1; j <= tableColumns; j++) {
            System.out.printf("%5d", i * j);
        }
    
    }
    System.out.println();
 }
}
