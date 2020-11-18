//CSS 161 B
//Exercise 2 of Array Algotithms Homework 
//Objectives: isEven, numberOfEvens, numberOfOdds, and median
//Author: Chandler Ford
//Last Modified Date: 2/21/2016

public class Exercise2 {
	public static void main(String[] args) {	
		//Declare and initialize int arry
	    int[] data = {1,2,3,4,5,6,9};  
		
		//Print text to screen, and call isEven method
	    System.out.println("Is the first array element even? " + isEven(data[0]));  //1 is not even
		System.out.println("Is the third element even? " + isEven(data[2]));        //3 is not even
		
		//Print text to screen, and call numberOfEvens and numberOfOdds methods
		System.out.println("Number of evens in data: " + numberOfEvens(data));      //There are 3 evens
		System.out.println("Number of odds in data: " + numberOfOdds(data));        //There are 4 odds
		
		//Print text to screen, and call median method
		System.out.println("Median value: " + median(data));                        //The median value is 4
	}
	
	public static boolean isEven(int input) {  
	   //If the input is even, return true, else return false 
		if (input%2==0){
		    return true;
		  }else{
	        return false;
	   }
	}
	
	public static int numberOfEvens(int[] input) {  //must use isEven 
	    //This method returns the number of even values in input array
	    int countEven=0;  //This variable will count the number of even values
	    for (int i: input){  //Use for-each loop
	        if (isEven(i)==true){  //If the value is even, add to the counting variable
	            countEven++;
	        }
	    }
	    return countEven;
	}
		
	public static int numberOfOdds(int[] input) {  //must use numberOfEvens()
	    //This method returns the number of odd values in input array
	    int countOdd=0;  //This variable will count the number of odd values
	    for (int i: input){  //Use for-each loop
	        if(numberOfEvens(input)>0){  //If there are even values, the count of odd ones will...
	            countOdd=input.length-numberOfEvens(input);  //equal the length of the array minus evens     
	        }
	    }
	    return countOdd;
	}
	
	public static double median(int[] input) {  //must use isEven
	    //This method will return the median of the array
	    double medianValue=0;  //This value will return the median
	    for(int i: input){  //Use for-each loop
	        if(isEven(i)==false){  //If the number is not even...
	            medianValue=(input.length+1)/2;  //The median is equal to the length plus one divided by two
	        } else {
	            medianValue=(input.length/2);  //If even, the median is equal to the length divided by two
	        }
	    }
	    return medianValue;
	}
}
