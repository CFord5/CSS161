
/**
 * Write a description of class powerMethod here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class powerMethod
{
   public static int power(int a, int b) { 
     int answer = 1; // answer to be returned 
      for(int i = 0; i < b; i++) { // for loop calculates answer 
        answer *= a; 
      } 
     return answer; // return answer 
  }
}