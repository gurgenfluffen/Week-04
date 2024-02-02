package com.promineotech;

import java.util.Scanner;

public class CodingProjectNumbers7Through13 {

	//7. Write a method that takes a String, word, and an int, n, as arguments and returns 
			//the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, 
			//I expect the method to return “HelloHelloHello”).
	
	static String concatenateWords(String word, int n) {
		String newWord = "";
		for (int i = 0; i < n; i++) {
			
			
			newWord += word;
			
			
		} 
		return newWord;
	}
		
			
	//8. Write a method that takes two Strings, firstName and lastName, and returns a 
	//full name (the full name should be the first and the last name as a String separated by a space).
		
		public static String fullName(String firstName, String lastName) {
					
		String allName = firstName + " " + lastName;
			
			return allName;
			
		}
	
	//9. Write a method that takes an array of int and returns true if the sum of all the ints 
	//in the array is greater than 100.
		
		
		static boolean valueOf(int a, int b, int c, int d, int e) {
			
			int[] numberNine = {a, b, c, d, e};
			int sum = 0;
			
			for (int count = 0; count < numberNine.length; count++) {
				
				sum += numberNine[count];
				
			}
			
			boolean isBig = (sum > 100);
			
			return isBig;
		}
		
		
	//10. Write a method that takes an array of double and returns the average of all the elements in the array.
		
		static double averageDoubleArray(double f, double g, double h, double i, double j) {
			
			double[] doubleArray = {f, g, h, i, j};
			double doubleSum = 0;
			
			for (int ii = 0; ii < doubleArray.length; ii++) {
				
				doubleSum += doubleArray[ii];
				
			}
			
			double doubleResult = doubleSum / doubleArray.length;
			return doubleResult;
		}
		
	//11. Write a method that takes two arrays of double and returns true if the average of the 
	//elements in the first array is greater than the average of the elements in the second array.
		
		static boolean twoDoubleArrays(double array1[], double array2[]) {
			
			double array1Sum = 0;
			double array2Sum = 0;
			
			for (int i = 0; i < array1.length; i++) {
				
				array1Sum += array1[i];
				
			}
			
			double array1Average = array1Sum / array1.length;
			
			for (int i = 0; i < array2.length; i++) {
				
				array2Sum += array2[i];
				
			}
			
			double array2Average = array2Sum / array2.length;
			
			if (array1Average > array2Average) {
				
				return true;
				
			} else {
				
				return false;
			}
			
		}
		
	
	//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double 
	//moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		
		static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			
			if (moneyInPocket > 10.50 && isHotOutside) {
				
				return true;
				
			} else {
				
				return false;
			}
			
			
		}
		
		
		
	//13. Create a method of your own that solves a problem. 
	//In comments, write what the method does and why you created it.
		
		
		//I created this method to help make a decision on where purchased equipment should be stored.
		//The method should run through if else statements to create a series of boolean operations.
		//After the first round of if else statements, the method would go through the new boolean operations 
		//to eventually come to a decision on where to store equipment. 
		
		//As for why I created it, this is actually a request--which started off as a joke--from a friend of
		//mine to help them decide where to store their construction equipment after buying it. 
		//I figured that this assignment problem was the perfect place to create an idea of what I eventually
		//wanted that program to look like. This one is just small-scale.
		
		static boolean siteOrCorporate(int numOfSites, double cost, int selection) {
			
			 //I used these boolean operations to better store my scanner in the method.
			
			boolean heavy = true;
			boolean toCorporate = true;
			
			
			//This statement determines if the equipment is heavy or not.
			if (selection <= 1) {
				
				heavy = true;
				//goes to corporate
				
			} else if (selection >= 2) {
				
				heavy = false;
				//chance to go to site
				
			}
			
			//Down below, I have the main decision making conditions. 
			//These conditions use the boolean operators that I had set up previously.
			
			if (heavy = true) {
				
				toCorporate = true;
				
			}
			
			else if ((cost <= 100.00) && 
					(numOfSites >= 6) &&
					(heavy = false)) {
			
				toCorporate = false;
				
			} else if ((cost > 100.00) && 
					(numOfSites >= 6) &&
					(heavy = false)) {
				
				toCorporate = true;
				
			}
			else if ((heavy = false) && 
					(numOfSites < 6) &&
					(cost > 100.00)) {
				
				toCorporate = true;
				
			} 
			return toCorporate;
		}
		
		//I have set up a prompt in my main method below, which prompts the user to input the requested values.

		public static void main(String[] args) {
			
			Scanner in = new Scanner(System.in);
			
			System.out.println("Question #7 requires a word and an integer number.");
			String word = in.nextLine();
			int n = in.nextInt();
			System.out.println(concatenateWords(word, n));
			
			System.out.println("Question #8:");
			String firstName = "Ellie";
			String lastName = "Jacobs";
			System.out.println(fullName(firstName, lastName));
			
			System.out.println("Question #9 requires five integer numbers.");
			int a = in.nextInt();
			int b = in.nextInt();
			int c = in.nextInt();
			int d = in.nextInt();
			int e = in.nextInt();
			System.out.println(valueOf(a, b, c, d, e));
			
			
			System.out.println("Question #10:");
			double f = 13.78;
			double g = 67.89;
			double h = 35.76;
			double i = 34.66;
			double j = 19.99;
			System.out.println(averageDoubleArray(f, g, h, i, j));
			
			System.out.println("Question #11:");
			double[] array1 = {74.36, 19.57, 33.99, 27.41, 8.72};
			double[] array2 = {19.34, 46.92, 3.96, 14.567, 34.42};
			System.out.println(twoDoubleArrays(array1, array2));
			
			System.out.println("Question #12 requires one double number.");
			double moneyInPocket = in.nextDouble();
			boolean isHotOutside = true;
			System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
			
			System.out.println("Question #13:");
			int selection = in.nextInt();
			double cost = 97.35;
			int numOfSites = 4;
			System.out.println("True or false: it should go to corporate?" + "\n" + siteOrCorporate(numOfSites, cost, selection));
			
			
			in.close();
		}
}