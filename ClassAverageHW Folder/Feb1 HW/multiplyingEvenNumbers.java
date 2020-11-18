
/**
 * Write a description of class multiplyingEvenNumbers here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class multiplyingEvenNumbers
{
   public static void main (String[] args){
    int answer=1;
       for (int i=0; i<=8; i++){
           if (i%2==0){
           answer*=i+2;
        } 
    }
    System.out.println("Total= "+answer);
  }
}
  