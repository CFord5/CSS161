/**
 * CSS 161 B
 * Assignment: Point2D for Building Basic Classes
 * Objective: This class manages two data values in two dimensions.
 * Author: Chandler Ford
 * Last Modified Date: 3/3/2016
 */
public class Point2D
{
    //Declared the instance variables outside of the methods.
    private int x; 
    private int y;
    
    //This is the mutator method, also known as the setter method.
    //The integer parameter "dx" will set the value of x.
    public void setX(int dx){
        x=dx;  //set x value
    }
    
    //This is the accessor method, also known as the getter method.
    //This method will return the value of x.
    public int getX(){
        return x;  //return x value
    }
    
    //This is the mutator method, also known as the setter method.
    //The integer parameter "dy" will set the value of y.
    public void setY(int dy){
        y=dy;  //set y value
    }
    
    //This is the accessor method, also known as the getter method.
    //This method will return the value of y.
    public int getY(){
        return y;  //return y value
    }
    
    //This method will desribe the Point2D object as a String
    public String toString(){
        return "Point2D at ("+x+", "+y+")";  //Will return "Point 2D at (x value,y value)"
    }
    
    //This is the main method supplied by the directions.
    //This will test the output of the Point2D class.
    public static void main(String[] args){
        Point2D pt=new Point2D();  //Creates a new object "pt" of class Point2D
        
        pt.setX(5);  //Calls the setX method and sets the x value for "pt" to 5
        pt.setY(2);  //Calls the setY method and sets the y value for "pt" to 2
        
        System.out.println("The 2D point's x value is: "+pt.getX());  //Will print returned x value
        System.out.println("The 2D point's y value is: "+pt.getY());  //Will print returned y value
        
        System.out.println(pt.toString());  //Calls the toString method and prints out coordinates
    }
}
