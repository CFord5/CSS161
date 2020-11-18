/**
 * CSS 161 B
 * Assignment: SeaHawksTracker for Building Basic Classes
 * Objective: This class manages three Seattle Seahawks score values.
 * Author: Chandler Ford
 * Last Modified Date: 3/3/2016
 */
public class SeaHawksTracker
{
    //Declared the instance variables outside of the methods.
    private int firstScore; 
    private int secondScore;
    private int thirdScore;
    
    //This is the mutator method, also known as the setter method.
    //The integer parameter "sc" will set the value of firstScore.
    public void setFirstScore(int sc){
        firstScore=sc;  //set firstScore value
    }
    
    //This is the accessor method, also known as the getter method.
    //This method will return the value of firstScore.
    public int getFirstScore(){
        return firstScore;  //return firstScore value
    }
    
    //This is the mutator method, also known as the setter method.
    //The integer parameter "sc" will set the value of secondScore.
    public void setSecondScore(int sc){
        secondScore=sc;  //set secondScore value
    }
    
    //This is the accessor method, also known as the getter method.
    //This method will return the value of secondScore.
    public int getSecondScore(){
        return secondScore;  //return secondScore value
    }
    
    //This is the mutator method, also known as the setter method.
    //The integer parameter "sc" will set the value of thirdScore.
    public void setThirdScore(int sc){
        thirdScore=sc;  //set thirdScore value
    }
    
    //This is the accessor method, also known as the getter method.
    //This method will return the value of thirdScore.
    public int getThirdScore(){
        return thirdScore;  //return thirdScore value
    }
    
    //This is a minimum method.
    //It wil return the smallest value of a,b, and c.
    public int min(int a, int b, int c){
        if(a<=b&&a<=c){  //If a is less than/equal to b and less than/equal to c
            return a;  //The a value will be returned
        }else if(b<=a&&b<=c){  //If b is less than/equal to a and less than/equal to c
            return b;  //The b value will be returned
        } 
        return c;  //If none of the above is true the c value will be returned
    }
    
    //This is a maximum method.
    //It wil return the largest value of a,b, and c.
    public int max(int a, int b, int c){
        if(a>=b&&a>=c){  //If a is greater than/equal to b and greater than/equal to c
            return a;  //The a value will be returned
        }else if(b>=a&&b>=c){  //If b is greater than/equal to a and greater than/equal to c
            return b;  //The b value will be returned
        } 
        return c;  //If none of the above is true the c value will be returned
    }
    
    //This is a middle method.
    //It will return the middle value of a,b, and c.
    public int mid(int a, int b, int c){
        if(a>=b&&a<=c||a>=c&&a<=b){  //If a is greater than b or c and less than c or b respectively 
            return a;  //The a value will be returned
        }else if(b>=a&&b<=c||b>=c&&b<=a){//If b is greater than a or c and less than c or a respectively
            return b;  //The b value will be returned
        } 
        return c;  //If none of the above is true the c value will be returned
    }
    
    //This method will desribe the SeaHawksTracker object as a String
    public String toString(){
        return "The first score was: "+firstScore+"\n"  //Print out firstScore
        +"The second score was: "+secondScore+"\n"  //Print out secondScore
        +"The third score was: "+thirdScore+"\n"  //Print out thirdScore
        +"The least of the SeaHawks' scores was: "+min(firstScore,secondScore,thirdScore)+"\n"  //min
        +"The middle of the SeaHawks' scores was: "+mid(firstScore,secondScore,thirdScore)+"\n"  //mid
        +"The greatest of the SeaHawks' scores was: "+max(firstScore,secondScore,thirdScore);  //max
    }
    
    //This is the main method supplied by the directions.
    //This will test the output of the SeaHawksTracker class.
    public static void main(String[] args){
        SeaHawksTracker stats=new SeaHawksTracker(); //Creates a new object "stats" of this class
        stats.setFirstScore(22);  //Calls the setFirstScore method and sets the value to 22
        stats.setSecondScore(11);  //Calls the setSecondScore method and sets the value to 11
        stats.setThirdScore(27);  //Calls the setThirdScore method and sets the value to 27
        
        System.out.println("---------Min, Mid, & Max---------");  //Print header
        System.out.println("The largest is: "+stats.max(3,5,1));  //Calls max and returns max value
        System.out.println("The middle is: "+stats.mid(3,5,1));  //Calls mid and returns middle value
        System.out.println("The smallest is: "+stats.min(3,5,1));  //Calls min and returns min value
        
        System.out.println("\n"+"---------Report of Scores--------");  //Print header
        System.out.println(stats.toString());  //Calls the toString method and prints out statistics
    }
}

