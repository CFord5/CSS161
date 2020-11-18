import java.io.*;
import java.util.*;
import java.awt.*;

/**
 * Diamonds.java program for CSS 161 B Homework
 * 
 * Chandler Ford
 * Feb. 15, 2016
 */
public class Diamonds
{
   public static void main(String[] args) throws IOException, InputMismatchException{
       //Declare scanner
       Scanner input = null; 
       try {
            //Initialize input scanner
            input=new Scanner(new FileInputStream("config.txt"));
       } catch (FileNotFoundException e) {
            //Informs user if file can't be found and exits
            System.out.println("This machine could not find the file specified!");
            System.exit(0);
       } catch (InputMismatchException e){
            //I had this error early on so I put this catch in
            System.out.println("Something went wrong!");
            System.exit(0);
       }
       //Intro text
       System.out.println("Welcome to my Nested Loops With Diamonds project.");
       System.out.println("This program will take input from config.txt and print out diamonds.");
       System.out.println();
       System.out.println("Reading input from config.txt...");
       System.out.println("Complete!");
       System.out.println();
       
       //Declare the four variables, and initialize them with data from the text file using scanner
       int sizeInt=input.nextInt();
       int numberOfLogosChar=input.nextInt();
       String firstLetter=input.next();
       char firstLetterChar=firstLetter.charAt(0);
       String secondLetter=input.next();
       char secondLetterChar=secondLetter.charAt(0);
      
       //Print out information for user
       System.out.println("Size of Triangle");
       System.out.println(sizeInt);
       System.out.println("Size of Diamond");
       System.out.println(sizeInt+" * 2 = "+(sizeInt*2));
       System.out.println("Number of Diamonds");
       System.out.println(numberOfLogosChar);
       System.out.println("Character to Draw Diamond");
       System.out.println(firstLetterChar);
       System.out.println("Character Used to Draw Space");
       System.out.println(secondLetter);
       System.out.println();
       
       //This while loop calls the drawDiamond method and feeds it parameters from the file
       int loopCount=0;
        while (loopCount<numberOfLogosChar){
        drawDiamond(sizeInt,firstLetterChar, secondLetterChar);
        System.out.println();
        loopCount++;
       }
        
       //Close input and exit system
       System.out.println("Program complete.");
       input.close();
       System.exit(0);
   }
   public static void drawDiamond(int sizeInt, char firstLetterChar, char secondLetterChar){ //parameters
       //Declare variables to create diamond, lines equivalent to y, spaces equivalent to x
       int lines, spaces; 
  
       //This loop controls the number of lines for the top triangle 
       for (lines = 0; lines < sizeInt; lines++) { 
           //This loop controls controls the space on the line
           for (spaces = 0; spaces < sizeInt - lines; spaces++) { 
           System.out.print(secondLetterChar); //Will print out char from file
           } 
           if (lines == 0) { //Prints character at top of triangle
            System.out.println(firstLetterChar); //Will print out char from file
           } else { 
            // This loop prints characters in the shape of a triangle
             for (spaces = 0; spaces < (lines * 2) + 1; spaces++) { 
                System.out.print(firstLetterChar); //Will print out char from file
                } 
            System.out.println(); 
           } 
       } 
       
       //This loop controls the number of lines for the bottom triangle 
       for (lines = 0; lines <= sizeInt; lines++) { //Set lines less than or equal to sizeInt
           //This loop controls controls the space on the line
           for (spaces = sizeInt; spaces > sizeInt - lines; spaces--) { 
           System.out.print(secondLetterChar); //Will print out char from file
           }  
           //This loop prints characters in the shape of a triangle 
           for (spaces = sizeInt*2; spaces > (lines * 2) - 1; spaces--) { 
                System.out.print(firstLetterChar); //Will print out char from file
           } 
           System.out.println(); 
       } 
   }        
}
