/**
 * @author: Uthman Ahmed
 * Module 03: Assignment - Chapter 2,
 *This program takes the input from the user and 
 *outputs in all uppercase and then in all lowercase.
 **/



import java.util.Scanner;
//This imports the Scanner to take input from the user


public class uppercase {

	public static void main(String[] args) {
	
		Scanner input = new Scanner (System.in);
	//This makes the input a variable called input
		System.out.println( "Type a word");
		//this brings the promt before the input is given instructing the user what to input.
		String text = input.next();
		//this takes the imput and makes it into a string.
		System.out.println( text.toUpperCase());
		System.out.println( text.toLowerCase());
		//this outputs the text line
		
		
	}

}
