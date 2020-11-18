//Chandler Ford
//Jan. 13 Homework

import java.util.Scanner;

public class TellingDynamicStories
{
   public static void main(String[] args){
       tellDynamicStory(); 
   }
   public static void tellDynamicStory(){
       Scanner keyboard=new Scanner(System.in);
       System.out.println("Please Enter the Title of the Story."); //Asks for user input
       String title=keyboard.nextLine(); //User input
       System.out.println("Please Enter the Content of the Story.");
       String content=keyboard.nextLine();
       System.out.println("Please Enter the End of the Story.");
       String remainder=keyboard.nextLine();
       System.out.println("\n"); //Space
       System.out.println(title);
       intro();
       System.out.println(content);
       middle();
       System.out.println(remainder);
       outro();
   }
   public static void intro(){
       System.out.println("A long time ago,");
       System.out.println("In a galaxy far, far away...");
   }
   public static void middle(){
       System.out.println("There was much strife and unrest.");
   }
   public static void outro(){
       System.out.println("<Camera pans downward past stars as the string section enters>\n");
   }
}
