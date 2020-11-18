//Chandler Ford
//Jan. 13 Homework

public class TellingStories
{
   public static void main(String[] args){
    tellStoryOne(); 
    tellStoryTwo();
   }
   public static void tellStoryOne(){
       System.out.println("Episode VIII: The First Order Strikes Back");
       intro();
       System.out.println("The evil FIRST ORDER, striking from a new hidden base, has conquered much of the galaxy.");
       middle();
       System.out.println("Rey has found the missing Jedi LUKE SKYWALKER, and has begun training in the ways of the Force...");
       outro();
   }
   public static void tellStoryTwo(){
       System.out.println("Episode IX: Resurgence of the Republic");
       intro();
       System.out.println("The heroic RESISTANCE has assumed control of the New Republic."); 
       middle();
       System.out.println("PRINCESS LEIA, in preparation for a climatic battle, has sent Rey, Finn, and Poe on an important mission..."); 
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