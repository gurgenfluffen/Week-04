package com.promineotech;

public class CodingProjectNumbers1Through6 {

	public static void main(String[] args) {
		
		//1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		
		System.out.println("Question #1: ");
		
		// Programmatically subtract the value of the first element in the array from the value in 
		//the last element of the array (i.e. do not use ages[7] in your code). 
		//Print the result to the console.
		
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		int result = ages[ages.length - 1] - ages[0];
		System.out.println(result);
		
		//Create a new array of int called ages2 with 9 elements 
		//(ages2 will be longer than the ages array, and have more elements).  
		//i. Make sure that there are 9 elements of type int in this new array.
		//ii. Repeat the subtraction from Step 1.a. (Programmatically subtract the value of
		//the first element in the new array ages2 from the last element of ages2). 
		//Show that using the index values for the elements is dynamic (works for arrays 
		//of different lengths).
		
		int[] ages2 = {5, 37, 96, 12, 84, 26, 59, 10, 66};
		
		int result2 = ages2[ages2.length - 1] - ages2[0];
		System.out.println(result2);
		
		//Use a loop to iterate through the array and calculate 
		//the average age. Print the result to the console.
		
		int sum = 0;
		for (int age : ages) {
			
			sum += age;
			age++;
			
		}
		double newResult = sum / ages.length;
		System.out.println(newResult);
		
		//2. Create an array of String called names that contains the following values: 
		//“Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.

		System.out.println("Question # 2: ");
		
		String[] names = new String[6];
		
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
		
		//a. Use a loop to iterate through the array and calculate the average number of 
		//letters per name. Print the result to the console.
		int letterTotal = 0;
		double letterAverage = 0;
		
		for (int counter = 0; counter < names.length; counter++) {
			
			letterTotal += names[counter].length();
				
			}
		System.out.println(letterTotal / names.length);
		
		//b. Use a loop to iterate through the array again and concatenate all the names together, 
		//separated by spaces, and print the result to the console.
	
	
		for (int i = 0; i < names.length; i++) {
			
			String namesTogether = names[i] + " ";
			System.out.print(namesTogether);
		}
		
		//3. How do you access the last element of any array?
		System.out.println("\n" + "Question #3: ");
		System.out.println("array[array.length - 1]");
		
		//4. How do you access the first element of any array?
		System.out.println("Question #4: ");
		System.out.println("array[0]");
		
		//5. Create a new array of int called nameLengths. Write a loop to iterate over the previously 
		//created names array and add the length of each name to the nameLengths array.
		
		
		int[] nameLengths = new int[names.length];
		
		
		for (int i = 0; i < names.length; i++) {
			
			nameLengths[i] += names[i].length();
			
		}
		
		
		
		//6. Write a loop to iterate over the nameLengths array and calculate the sum of all the 
		//elements in the array. Print the result to the console.
		System.out.println("Question #6: ");
		
		int letterSum = 0;
		for (int counter = 0; counter < nameLengths.length; counter++) {
			
		letterSum += nameLengths[counter];
			
		}
		System.out.println(letterSum);
		
		
		
		
		
	}

}
