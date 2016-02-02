//************************
//Name: Morgan Niehus
//Student ID: 870537844
//Class: CS 1302-A
//HW: HomeWork 1
//Due Date: 1/27/16
//************************
package prob1;

import java.util.*;

public class MessageParser {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);//for user input
		
		System.out.println("insert a code length:");
		
		String code = s.next();//collect user input
		
		System.out.print("Youre Code:\t");
		System.out.println(message(code));//call message method

	}
	//*************************************
	//this method is designed to take a string "code" and 
	//check for two things: '#' and a number 'd'
	//when both conditions are met, the method will return
	// d letter "abc#3abcdef" --> "abc" || abc3abcef --> "null"
	//*************************************
	public static String message(String code)
	{
		
		if(code.contains("#"))//checks the condition; else null
		{
			int poundPlacement = code.indexOf("#");//find the index of '#'
			int indexValue = poundPlacement + 1;//find the index of 'd'
			int numberValueAscii = code.charAt(indexValue);//finds the ASCII value of 'd'
			char numberValueChar = (char)numberValueAscii;//convert the ASCII value to 'd'
			int numberValue = numberValueChar - '0';//convert 'd' to an Integer
			                      //'d'               //places forward
			return code.substring(indexValue + 1, indexValue + numberValue + 1);
			
		}
		else
			return null;
	}

}
