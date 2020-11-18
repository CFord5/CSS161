//Import packages
import java.util.*;
import java.io.*;

/**
Class: CSS 161 B
Assignment: Spreadsheet HW
Objective: Create a 2D array spreadsheet in java that can:
-Input numbers
-Sum up value of rows and columns
-Average rows and columns
-Calculate the sum and average of the whole array
Author: Chandler Ford
Last Modified Date: 3/10/2016
 */

public class Spreadsheet{
    //Declare global static variables
    public static double[][] spreadsheet;  //Creates new array of doubles
    public static int size = 2;  //Controls size of the array
    
    //The main method controls the program by calling methods.
    //It contains a scanner to allow the user to input values.
    //The switch statement responds accordingly to that value.
    public static void main(String[] args) {  
        //Prompt the user that the spreadsheet is initializing 
        System.out.println("Initializing Spreadsheet Program...");  //Prompt user
        System.out.println();  //Space
        initializeSpreadsheet();  //Call initializeSpreadsheet method
        
        //Declare and initialize scanner and declare user input variable
        Scanner keyboard=new Scanner(System.in);  //New scanner keyboard
        int input;  //New int variable input
           
        //While the programs is running, everything in this while loop will keep running
        while(true) {
            printSpreadsheet();  //Prints out the spreadsheet initally and after every input
            System.out.println();  //Space
            System.out.println("(1) Input (2) Row Sum (3) Col Sum (4) Row Ave (5) Col Ave (6) Sum (7) Average (8) Quit");
            System.out.println("Enter a number:");  //Prompts user to enter a number
            input=keyboard.nextInt();  //Initialize scanner, will take next int entered by user

            switch(input) {  //Switch statement that responds to user input
             case 1:  //This case will call the inputData method 
                System.out.println();  //Space
                System.out.println("You have chosen the Input operation.");  //Inform user
                System.out.println("Enter x and y coordinates:");  //Prompt user to enter coordinates
                int x=keyboard.nextInt();  //Next user entered int will be x variable
                int y=keyboard.nextInt();  //Next user entered int will be y variable
                System.out.println("Enter a double value:");  //Prompt user to enter value
                double value=keyboard.nextDouble();  //Next user entered int will be the value
                System.out.println();  //Space
                inputData(x, y, value);  //Calls inputData method
                break;
             case 2:  //This case will call the sumRow method 
                System.out.println();  //Space
                System.out.println("You have chosen the Row Sum operation.");  //Inform user
                System.out.println("Enter a row number:");  //Prompt user for targetRow
                int targetRow=keyboard.nextInt();  //Next user entered int will be the targetRow
                System.out.println("The sum of row "+targetRow+" is: "+sumRow(targetRow));  //Prints and 
                System.out.println();  //Space                                             //calls method
                break;
             case 3:  //This case will call the sumCol method 
                System.out.println();  //Space
                System.out.println("You have chosen the Col Sum operation.");  //Inform user
                System.out.println("Enter a column number:");  //Prompt user for targetCol
                int targetCol=keyboard.nextInt();  //Next user entered int willl be the targetCol
                System.out.println("The sum of column "+targetCol+" is: "+sumCol(targetCol));  //Prints and 
                System.out.println();  //Space                                                //calls method
                break;
             case 4:  //This case will call the rowAve method 
                System.out.println();  //Space
                System.out.println("You have chosen the Row Ave operation.");  //Inform user
                System.out.println("Enter a row number:");  //Prompt user for targetRow
                targetRow=keyboard.nextInt();  //Next user entered int will be the targetRow
                System.out.println("The average of row "+targetRow+" is: "+rowAve(targetRow));  //Prints and
                System.out.println();  //Space                                                 //calls method
                break;
             case 5:  //This case will call the colAve method
                System.out.println();  //Space
                System.out.println("You have chosen the Col Ave operation.");  //Inform user
                System.out.println("Enter a column number:");  //Prompt user for targetCol
                targetCol=keyboard.nextInt();  //Next user entered int willl be the targetCol
                System.out.println("The average of column "+targetCol+" is: "+colAve(targetCol));  //Prints and 
                System.out.println();  //Space                                                    //calls method
                break;
             case 6:  //This case will call the sumTotal method
                System.out.println();  //Space
                System.out.println("You have chosen the Sum operation.");  //Inform user
                System.out.println("Sum: "+sumTotal());  //Prints and calls method
                System.out.println();  //Space
                break;
             case 7:  //This case will call the average method
                System.out.println();  //Space
                System.out.println("You have chosen the Average operation.");  //Inform user
                System.out.println("Average: "+average());  //Prints and calls method
                System.out.println();  //Space
                break;
             case 8:  //This case will call the quit method
                System.out.println();  //Space
                System.out.println("You have chosen to quit.");  //Inform user
                quit();  //Calls method that exits the program
                break;
             default:  //This will occur if an unrecognized command occurs
                System.out.println();  //Space
                System.out.println("Unrecognized command. Please try again!");  //Prompts user
                System.out.println();  //Space
                break;
            }
        }   
    }
   
    //This method uses a two for-loops to set up the initial spreadsheet array.
    //The values will all be zero at first.
    public static void initializeSpreadsheet(){
        spreadsheet=new double[size][size];  //Set the spreadsheet array equal to the global variable size
        for(int y=0; y<size; y++){  //While y is less than size, and...
            for(int x=0; x<size; x++){  //While x is less than size...
                    spreadsheet[y][x]=0.00;  //The values of the array will equal 0.00
            }
        }
    }
   
    //This method will input data into the spreadsheet array.
    //It does this by taking user input from main as parameters: int x, int y, and double value 
    public static void inputData(int x, int y, double value){
        spreadsheet[y][x]=value;  //The user defined (x,y) coordinate space will hold the user defined value
    }   
    
    //This method will return the sum of the entire spreadsheet array.
    //It does this by continually adding sums of each row in the array.
    public static double sumTotal() {
        double sum = 0;  //Declares and initializes sum value
        for(int i=0; i<size; i++){  //While the variable i is less than the size
            sum+=sumRow(i);  //The sum is equal to the sum plus the sum of row i
        }
        return sum;  //Returns sum value
    }
    
    //This method will return the sum of the target row.
    //It does this by placing a user entered row number into a for-loop.
    public static double sumRow(int targetRow) {
        double sum = 0;  //Declares and initializes sum value
        for(int x=0; x<size; x++){  //While the variable x is less than the size
            sum+=spreadsheet[targetRow][x];  //The sum is equal to the value of the target row
        }
        return sum;  //Returns sum value
    }

    //This method will return the sum of the target column.
    //It does this by placing a user entered column number into a for-loop.    
    public static double sumCol(int targetCol) {
        double sum = 0;  //Declares and initializes sum value
        for(int y=0; y<size; y++){  //While the variable y is less than the size
            sum+=spreadsheet[y][targetCol];  //The sum is equal to the value of the target column
        }   
        return sum;  //Returns sum value
    }
    
    //This method will return the average of the target row.
    //It does this by dividing the sum of the target row by the size of the array.
    public static double rowAve(int targetRow) {
        double average=0;  //Declares and initializes average value
        average=(sumRow(targetRow)/size);  //The average is equal to the sum of the targeted row divided by the size
        return average;  //Returns average value
    }

    //This method will return the average of the target column.
    //It does this by dividing the sum of the target column by the size of the array.
    public static double colAve(int targetCol) {
        double average=0;  //Declares and initializes average value
        average=(sumCol(targetCol)/size);  //The average is equal to the sum of the targeted column divided by the size  
        return average;  //Returns average value
    }
    
    //This method will return the average of the entire spreadsheet array.
    //It does this by adding each row average together and then dividing by the size.
    public static double average() {
        double average=0;  //Declares and initializes average value
        for(int i=0; i<size; i++){  //While the variable i is less than size
            average+=((rowAve(i))/size);  //The average is equal to the average plus the rowAve of i divided by the size
        }
        return average;  //Returns average value
    }
    
    //This method will exit the program.
    //It prompts the user before using System.exit(0)
    public static void quit() {
        System.out.println("Goodbye!");  //Prompts user
        System.exit(0);  //Exits program
    }

    //This method will print out the spreadsheet array.
    //It does this by using two for-loops.
    //It will only print out to two places after the decimal, thanks to printf.
    public static void printSpreadsheet() {
        for(int y=0; y<size; y++){  //While y is less than the size, and...
            for(int x=0; x<size; x++){  //While x is less than the size...
                    System.out.print("|");  //Print out a line
                    System.out.printf("%.2f",spreadsheet[y][x]);  //Prints out values (up to two decimals) of coordinates 
                    System.out.print("|");  //Print out a line
            }
            System.out.println();  //Space
        }
    }
}


