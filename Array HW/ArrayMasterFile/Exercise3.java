//CSS 161 B
//Exercise 3 of Array Algotithms Homework 
//Objectives: findMin, findMax, findRange, and sum
//Author: Chandler Ford
//Last Modified Date: 2/21/2016

public class Exercise3 {
	public static void main(String[] args) {
		//Declare and intialize two int arrays
	    int[] data = {50,100,20,45};
		int[] data2 = {-4,-1,-3,-10,-2};
		
		//Print text to screen and call findMin
		System.out.println("Min element in data is: " + findMin(data));
		System.out.println("Min element data2 is: " + findMin(data2));
		
		//Print text to screen and call findMax
		System.out.println("Max element in data is: " + findMax(data));
		System.out.println("Max element data2 is: " + findMax(data2));
		
		//Print text to screen and call findMax
		System.out.println("Range of data is: " + findRange(data));
		System.out.println("Range of data2 is: " + findRange(data2));
		
		//Print text to screen and call sum
		System.out.println("The sum of data is: " + sum(data));
		System.out.println("The sum of data2 is: " + sum(data2));
	}
	
	public static int findMin(int[] input) {
	    //This method will return the smallest value in input 
	    int min=input[0];  //The variable will keep track of the smallest value, starting at index zero
	    for(int i: input){  //Use for-each loop
	        if (i<min){  //If next value is less than the current minimum, it becomes the new minimum
	            min=i;
	        }
	    }
	    return min;
	}
	
	public static int findMax(int[] input){
	    //This method will return the largest value in input 
	    int max=input[0];  //The variable will keep track of the largest value, starting at index zero
	    for(int i: input){  //Use for-each loop
	        if (i>max){  //If next value is more than the current maximum, it becomes the new maximum
	            max=i;
	        }
	    }
	    return max;
	}
	
	public static int findRange(int[] input) {  //must reuse findMin() and findMax()
	    //This method will return the range of input
	    int range=input[0];  //This variable will retrun the range
	    for(int i: input){  //Use for-each loop
	        range=findMax(input)-findMin(input);  //The range equals the maximum minus the minimum
	    }
	    return range;
	}
	
	public static int sum(int[] input) {
	    //This method will return the sum of the array
	    int sumOfArray=0;  //This variable will keep track of the sum
	    for(int i: input){  //Use for-each loop
	        sumOfArray+=i;  //The sum of the array is equal to the each value of input added together
	    }
	    return sumOfArray;
	}
}
