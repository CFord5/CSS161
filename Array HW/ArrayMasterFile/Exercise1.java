//CSS 161 B
//Exercise 1 of Array Algotithms Homework 
//Objectives: contains, indexOf, count, and duplicates
//Author: Chandler Ford
//Last Modified Date: 2/21/2016

import java.util.Arrays;

public class Exercise1 {
	public static void main(String[] args) {
		//Declare and initialize two int arrays
	    int[] data = {1,3,5,4,7,9,1,3};
		int[] output = new int[data.length];
		
		//Print text out to screen, and call methods
		System.out.println("Does our array contain a '1': "+contains(data, 1)); 	    //true
		System.out.println("Does our array contain a '0': "+contains(data, 0)); 	    //false
		System.out.println("What is the index of '4'? " + indexOf(data, 4)); 	    //3
		System.out.println("The number of occurrences of '1'? " + count(data, 1)); 	//2
		
		//Calls duplicates method, prints out information for user, and then prints an array
		duplicates(data, output);
		System.out.println("After removing duplicates from data:");
		System.out.println(Arrays.toString(output));
	}
	public static boolean contains(int[] input, int target) {
		//This method will return true if the input contains the target, otherwise it returns false
        for (int i: input){  //Use for-each loop
            if(i==target){ //If the target is found, return true
                return true;
            }
        }
		return false;  
	}
	public static int indexOf(int[] input, int target) {
		//If the contains method returns true, this method can be used to find the index of the target
        if (contains(input, target)==true){  //If the target was contained in the input
            for (int i=0; i<=input.length; i++){  //For loop will loop until it reaches the end of input array
               if (input[i]==target){  //If the index equals the target, return the value     
                 return i;
               }
            }
        }
        return -1;
	}
	public static int count(int[] input, int target){
		//If the method contains returns true, this method can count the number of times the target appears
	    int retVal = 0;  //This variable will keep track of how many times the target appears in input
		 if (contains(input, target)==true){  //If the target was contained in the input
		     for(int i: input){  //Use for-each loop
		         if(i==target){  //If the target is found, add to retVal counter
		             retVal++;
		          }
		      }
		  }
		
		return retVal;
	}
	public static void duplicates(int[] input, int[] output) {
        //This method will take targets that appear more than once in input and put them into output 
	    for(int i: input){  //Use for-each loop
            if (count(input, i)>=2){  //If the count method counted a number two or more times
                output[i-1]=i;  //Add value to new array output
            }
        }
	}
}
