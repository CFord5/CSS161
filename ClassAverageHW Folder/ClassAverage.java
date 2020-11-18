import java.util.Scanner;
import java.io.*;
import java.io.IOException;
import java.io.FileNotFoundException;

//authors: Fukuda, Zander, (edited by Nash)

public class ClassAverage {
    public static void main(String[] args) throws IOException {
        int courseNumber;                     // number of the course
        Scanner inputFile = null;             // file containing data
  
        try{
            inputFile = new Scanner(new FileInputStream("data.txt.txt"));
        } catch (FileNotFoundException e){
            System.out.println("File data.txt was not found");
            System.out.println("or could not be opened.");
            System.exit(0);
        }

        final double PROGRAMSWEIGHT=inputFile.nextDouble();
        final double MIDTERMWEIGHT=inputFile.nextDouble();
        final double FINALWEIGHT=inputFile.nextDouble();
        System.out.println("Per class, this program will print");
        System.out.println("ID numbers, grades, weighted averages per");
        System.out.println("student, and a Pass or Fail programs grade.");
        System.out.println("The class average will also be printed.");
        System.out.println("The Weighted Averages are "+PROGRAMSWEIGHT+" "+MIDTERMWEIGHT+" "+FINALWEIGHT);
        System.out.println();
        
    while(inputFile.hasNextLine()){   
          courseNumber = inputFile.nextInt();
          System.out.println("Grade Data for Course Number "+courseNumber);
          String tempLine = inputFile.nextLine();//Presets the next line to tempLine
          Scanner scanLine = new Scanner(tempLine);//Creates a scanner to look through tempLine
          

          //For each student in the class, get and print their information, 
          // compute their avg, and sum the avgs
        
      while((!scanLine.equals("0"))){  
        if (courseNumber==161){
                   for (int i=0; i<3; i++) {
                    inputFile.nextLine();
                    System.out.print("Student ID\t");
                    System.out.print("Programs\t");
                    System.out.print("Midterm\t\t");
                    System.out.print("Final\t");
                    System.out.print("Student Average\t");
                    System.out.print("Programs Grade\n");
                    
                    int studentNumber=inputFile.nextInt();
                    System.out.print(studentNumber+"\t\t");
                    int programsScore=inputFile.nextInt();
                    System.out.print(programsScore+"\t\t");
                    int midtermScore=inputFile.nextInt();
                    System.out.print(midtermScore+"\t\t"); 
                    int finalScore=inputFile.nextInt();
                    System.out.print(finalScore+"\t");
                    int studentAverage=((programsScore+midtermScore+finalScore)/3);
                    System.out.print(studentAverage+"\t\t");
                    
                    if(studentAverage>=70){
                        System.out.println("PASS");
                    } else{
                        System.out.println("FAIL");
                    }
                }
          }else if (courseNumber==162){
                   for (int i=0; i<5; i++) {
                    inputFile.nextLine();
                    System.out.print("Student ID\t");
                    System.out.print("Programs\t");
                    System.out.print("Midterm\t\t");
                    System.out.print("Final\t");
                    System.out.print("Student Average\t");
                    System.out.print("Programs Grade\n");
                    
                    int studentNumber=inputFile.nextInt();
                    System.out.print(studentNumber+"\t\t");
                    int programsScore=inputFile.nextInt();
                    System.out.print(programsScore+"\t\t");
                    int midtermScore=inputFile.nextInt();
                    System.out.print(midtermScore+"\t\t"); 
                    int finalScore=inputFile.nextInt();
                    System.out.print(finalScore+"\t");
                    int studentAverage=((programsScore+midtermScore+finalScore)/3);
                    System.out.print(studentAverage+"\t\t");
                    
                    if(studentAverage>=70){
                        System.out.println("PASS");
                    } else{
                        System.out.println("FAIL");
                    }
                }
        } else if (courseNumber==263){
                   for (int i=0; i<4; i++) {
                    inputFile.nextLine();
                    System.out.print("Student ID\t");
                    System.out.print("Programs\t");
                    System.out.print("Midterm\t\t");
                    System.out.print("Final\t");
                    System.out.print("Student Average\t");
                    System.out.print("Programs Grade\n");
                    
                    int studentNumber=inputFile.nextInt();
                    System.out.print(studentNumber+"\t\t");
                    int programsScore=inputFile.nextInt();
                    System.out.print(programsScore+"\t\t");
                    int midtermScore=inputFile.nextInt();
                    System.out.print(midtermScore+"\t\t"); 
                    int finalScore=inputFile.nextInt();
                    System.out.print(finalScore+"\t");
                    int studentAverage=((programsScore+midtermScore+finalScore)/3);
                    System.out.print(studentAverage+"\t\t");
                    
                    if(studentAverage>=70){
                        System.out.println("PASS");
                    } else{
                        System.out.println("FAIL");
                    }
        
                }     
        }
     }
  }
}  
}       
