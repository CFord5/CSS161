
/**
 * Write a description of class MitsubishLogo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MitsubishLogo
{
  public static void main(String[] args){
   int size = 5; 
   //Declare variables to create diamond
   int lines, spaces; 
  
   //This loop controls the number of lines for the top triangle 
   for (lines = 0; lines < size; lines++) { 
       //This loop controls controls the space on the line
       for (spaces = 0; spaces < size - lines; spaces++) { 
           System.out.print("-"); 
        } 
       if (lines == 0) { //Prints character at top of triangle
            System.out.println("*"); 
       } else { 
            // This loop prints characters in the shape of a triangle
            for (spaces = 0; spaces < (lines * 2) + 1; spaces++) { 
                System.out.print("*"); 
            } 
            System.out.println(); 
       } 
   } 
   //This loop controls the number of lines for the bottom triangle 
   for (lines = 0; lines <= size; lines++) { 
       //This loop controls controls the space on the line
       for (spaces = size; spaces > size - lines; spaces--) { 
           System.out.print("-"); 
        }  
       //This loop prints characters in the shape of a triangle 
       for (spaces = size*2; spaces > (lines * 2) - 1; spaces--) { 
                System.out.print("*"); 
       } 
       System.out.println(); 
       } 
   } 
 }
  

