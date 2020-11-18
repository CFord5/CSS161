//CSS 161 B
//Exercise 4 of Array Algotithms Homework 
//Objectives: arrayShiftLeft and arrayShiftRight
//Author: Chandler Ford
//Last Modified Date: 2/21/2016

import java.util.Arrays;

public class Exercise4 {
	public static void main(String[] args) {
		//Declare and intialize two arrays
	    int[] data = {3,9,2,0,0,0};  
		int[] data2 = {1,5,3,2,9,6};  
		
		//Shift the array data to the left
		System.out.println("The array data shifted left:");
		arrayShiftLeft(data, 0);  //Call method
		for(int i = 0; i < data.length; i++){  //Print out array
		    System.out.print(data[i]);
		    System.out.print(", ");
		}
		
		//Space
		System.out.println();
		System.out.println();
		
		//Shift the array data2 to the left
		System.out.println("The array data2 shifted left:");
		arrayShiftLeft(data2, 0);  //Call method
		for(int i = 0; i < data2.length; i++){  //Print out array
		    System.out.print(data2[i]);
		    System.out.print(", ");
		}
		
		//Space
		System.out.println();
		System.out.println();
		
		//Shift the array data to the right
		System.out.println("The array data shifted right:");
		arrayShiftRight(data, 0);  //Call method
		for(int i = 0; i < data.length; i++){  //Print out array
		    System.out.print(data[i]);
		    System.out.print(", ");
		}
		
		//Space
		System.out.println();
		System.out.println();
		
		//Shift the array data2 to the right
		System.out.println("The array data2 shifted right:");
		arrayShiftRight(data2, 0);  //Call method
		for(int i = 0; i < data2.length; i++){  //Print out array
		    System.out.print(data2[i]);
		    System.out.print(", ");
		}
	}

	public static void arrayShiftLeft(int[] input, int startIndex) { 
	    //This method will shift the array to the left
        for(int i=startIndex; i<input.length-1; i++){  //Begins at specified starting index, loop to length-1
            input[i]=input[i+1];  //Input shifts one to the left 
        }
	}

	public static void arrayShiftRight(int[] input, int startIndex) {
	    //This method will shift the array to the right
        for(int i=input.length-1; i>startIndex; i--){  //Reverse arrayShiftLeft, starts at length and goes back
            input[i]=input[i-1];  //Input shifts one to the right
        }
	}
}
