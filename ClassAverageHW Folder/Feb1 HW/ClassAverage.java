import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileNotFoundException;

//authors: Fukuda, Zander, (edited by Nash)

public class ClassAverage {
    //... class constants go here
    
    public static void main(String[] args) throws IOException {
        int courseNumber;                     // number of the course
        int next=0;
        int sum=0;
        int count=0;
        Scanner inputFile = null;             // file containing data

        try{
            inputFile = new Scanner(new File("courseData.txt"));
        } 
        catch (FileNotFoundException e){
            System.out.println("File courseData.txt was not found");
            System.out.println("or could not be opened.");
            System.exit(0);
        }
        
        // ... any stuff you need to do one time
        System.out.println("Per class, this program will print");
        System.out.println("ID numbers, grades, weighted averages per");
        System.out.println("student, and a Pass or Fail programs grade.");
        System.out.println("The class average will also be printed.");

        //Per class, print a table of ID numbers, grades, weighted average
        // per student, and a Pass or Fail programs grade.  
        // The class average is also printed.
        for (courseNumber=1; courseNumber<=10; courseNumber++ ) {                         
            // Read class number, print class number title, headings.
            courseNumber = inputFile.nextInt();
            System.out.println(courseNumber);
            //... rest of the code goes here

            // initialization
            //... code goes here
            int idNumbers;
            int grades;
            int weightedAverages;
            boolean passOrFail;

            // Loop to handle one class.
            //For each student in the class, get and print their information, 
            // compute their avg, and sum the avgs
            while (inputFile.hasNextInt()) {                   
                //... code goes here
                next=inputFile.nextInt();
                sum+=next;
                count++;
            }

            // compute and print class average
            //... code goes here
            if (next==0){
                System.out.println("");
            } else {
                double classAverage=sum/count;
                System.out.println("The class average is "+classAverage);
            }
        }
   }
}
