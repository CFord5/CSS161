/**
 * CSS 161 B
 * Assignment: Point1D Class Warmup for Building Basic Classes
 * Objective: This class manages a value in one dimension.
 * Author: Chandler Ford
 * Last Modified Date: 3/3/2016
 */
public class Point1D
{
    //Declared the instance variable outside of the methods.
    private int x;
    
    //This is the mutator method, also known as the setter method.
    //The integer parameter "nx" will set the value of x.
    public void setX(int nx){
        x=nx;  //set x value
    }
    
    //This is the accessor method, also known as the getter method.
    //This method will return the value of x.
    public int getX(){
        return x;  //return x value
    }
    
    //This is the main method supplied by the directions.
    //This will test the output of the Point1D class.
    public static void main(String[] args){
        Point1D pt=new Point1D();  //Creates a new object "pt" of class Point1D
        
        pt.setX(10);  //Calls the setX method and sets the x value for "pt" to 10
        
        System.out.println("The point's x value is: "+pt.getX());  //Will print returned x value
    }
}
