import java.io.*;
import java.util.*;
import java.awt.*;

//authors: Fukuda, Zander, (edited by Nash) 
//Chandler Ford
//February 2nd, 2016
//Class Averaging Homework
//CSS 161 B

public class ClassAverage2 { 
    public static void main(String[] args) throws IOException { 
        int courseNumber;                     // number of the course 
        Scanner inputFile = null;             // file containing data 
        //I used the try/catch setup described in the book
        //The scanner is called inputFile, and reads from "data.txt"
        //If Java can't find "data.txt" it will say so and then exit the program
        try{
            inputFile = new Scanner(new File("data.txt."));
        } catch (FileNotFoundException e){
            System.out.println("File data.txt was not found");
            System.out.println("or could not be opened.");
            System.exit(0);
        } 
        
        // ... any stuff you need to do one time 
        //I made the weights doubles since they are fractions
        //I made them final because that way the loop won't change their value
        final double PROGRAMSWEIGHT=inputFile.nextDouble();
        final double MIDTERMWEIGHT=inputFile.nextDouble();
        final double FINALWEIGHT=inputFile.nextDouble();
        //I added some intro text so the user knows what the program will do
        System.out.println("Per class, this program will print");
        System.out.println("ID numbers, grades, weighted averages per");
        System.out.println("student, and a Pass or Fail programs grade.");
        //I listed the weights for reference
        System.out.println("The weights are "+PROGRAMSWEIGHT+", "+MIDTERMWEIGHT+", and "+FINALWEIGHT);
        System.out.println();

        //Per class, print a table of ID numbers, grades, weighted average per student, and a Pass or Fail programs grade. The class average is also printed. 
        // Loop to handle one class. For each student in the class, get and print their information, compute their avg, and sum the avgs 
        //This first loop will keep going as long as the scanner can find lines in "data.txt"
        while(inputFile.hasNextLine()){   
          //The outer loop concerns itself with finding the course number and dealing with zeroes
          courseNumber = inputFile.nextInt();
          //Skip a line
          inputFile.nextLine();
          System.out.println();
          //Tells the user what course number the class is
          System.out.println("Grade Data for Course Number "+courseNumber);
          //Presets the next line to tempLine, this takes the zero in as a string, kudos to one of my friends at UW Seattle for helping me with this
          String tempLine = inputFile.nextLine();
          //Creates a scanner to look through tempLine, so the program can get to the actual course number instead of the zero
          Scanner scanLine = new Scanner(tempLine);
          
          //For each student in the class, get and print their information, compute their avg, and sum the avgs
          //When the scanner isn't zero, it will loop through the below program
          while((!tempLine.equals("0"))){  
                    //I printed all the headers here, and arranged them using \t to tab
                    System.out.print("Student ID\t");
                    System.out.print("Programs\t");
                    System.out.print("Midterm\t\t");
                    System.out.print("Final\t");
                    System.out.print("Weighted Average\t");
                    System.out.print("Programs Grade\n");              
                    //I set up all the rest of the variables here, and set them equal to the next line in the file so the scanner could read them
                    //I also printed out the value, using the same tabbing method as above
                    int studentNumber=scanLine.nextInt();
                    System.out.print(studentNumber+"\t\t");
                    int programsScore=scanLine.nextInt();
                    System.out.print(programsScore+"\t\t");
                    int midtermScore=scanLine.nextInt();
                    System.out.print(midtermScore+"\t\t"); 
                    int finalScore=scanLine.nextInt();
                    System.out.print(finalScore+"\t\t");
                    //I used the formula given out in the instructions to calculate each student's weighted average
                    double weightedAverage=((PROGRAMSWEIGHT*programsScore) +(MIDTERMWEIGHT*midtermScore) +( FINALWEIGHT*finalScore)); 
                    System.out.print(weightedAverage+"\t\t");
                    //As per the instructions, students who earn a weighted average of greater than or equal to 70 pass
                    //if they don't get over or equal to 70, they fail
                    //The result will be printed to the screen courtesy of this if/else statement
                    if(weightedAverage>=70){
                        System.out.println("PASS");
                    } else{
                        System.out.println("FAIL");
                    }
                    //My class average area returns the last student's weighted average, I couldn't figure out how to fix this
                    //The skeleton code we recieved initially had this placed outside of the loop but I didn't know how to get that working either
                    
                    /*System.out.print("Class Average: ");
                    //double classAverage=((weightedAverage+weightedAverage+weightedAverage)/3);
                    //System.out.print(classAverage);*/
                   
                    //Puts an additional space in the output
                    System.out.println("");
                    
                   //Presets the next line to tempLine, so the next zero that appears in "data.txt" will not mess up the course number list
                    tempLine = inputFile.nextLine();
                   //Creates a scanner to look through tempLine, again so the scanner can deal with the zero
                    scanLine = new Scanner(tempLine);

                }
        }
     } 
 } 


