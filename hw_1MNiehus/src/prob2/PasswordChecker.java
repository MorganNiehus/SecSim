//************************
//Name: Morgan Niehus
//Student ID: 870537844
//Class: CS 1302-A
//HW: HomeWork 1
//Due Date: 1/27/16
//************************
package prob2;

import java.util.Scanner;

public class PasswordChecker {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);//user input
		
		System.out.print("Proposed Password:\t");
		String password = s.nextLine();//capture user input
		
		if(password.length() >= 5){//condition checks for string length is greater than six; else terminate
			System.out.println("isLevel1(): " + isLevel1(password));//call isLevel1() method
			System.out.println("isLevel2(): " + isLevel2(password));//call isLevel2() method
			System.out.println("passwordLevel(): " + passwordLevel(password));//call passwordLevel() method
		}
		else
			System.out.println("must be more than 6 characters!");
		

		
	}
	//*****************************************
	//this method is designed to meet two of three conditions
	//one lower case letter
	//one upper case letter
	//one digit
	//*****************************************
	
	public static boolean isLevel1(String password){
		boolean mark1 = false;
		boolean mark2 = false;
		boolean mark3 = false;
		boolean isLevel1 = false;
		if(oneLowerCase(password) == true)//call oneLowerCase helper method
		{
			mark1 = true;
		}
		if(oneUpperCase(password) == true)//call oneUpperCase helper method
		{
			mark2 = true;
		}
		if(oneDigit(password) == true)//call oneDigit helper method
		{
			mark3 = true;
		}
		if((mark1 && mark2) || (mark2 && mark3) || (mark1 && mark3)){//condition checks that "password" meets two of three conditions
			isLevel1 = true;
		}
		return isLevel1;
	}
	//*****************************************
	//this method is designed to meet all conditions
	//one lower case letter
	//one upper case letter
	//one digit
	//much like the one above except with different conditions
	//*****************************************
	public static boolean isLevel2(String password){
		boolean mark1 = false;
		boolean mark2 = false;
		boolean mark3 = false;
		boolean isLevel2 = false;
		if(oneLowerCase(password) == true)//call oneLowerCase helper method
		{
			mark1 = true;
		}
		if(oneUpperCase(password) == true)//call oneUpperCase helper method
		{
			mark2 = true;
		}
		if(oneDigit(password) == true)//call oneDigit helper method
		{
			mark3 = true;
		}
		if(mark1 && mark2 && mark3){//must meet all conditions
			isLevel2 = true;
		}
		return isLevel2;
	}
	//*******************************
	//method simply tells the user what level his password falls under
	//using a simple condition based on the two first methods
	//*******************************
	public static int passwordLevel(String password){
		if(isLevel2(password) == true)
		{
			return 2;
		}
		else if(isLevel1(password) == true)
		{
			return 1;
		}

		else
			return 0;
	}
	
	//*************************************
	//this helper method simply checks to see if
	//the String "password" contains a lower case letter
	//if not, then it returns false
	//*************************************
	public static boolean oneLowerCase(String password){
		boolean hasLowerCase = false;//default
		for(int i = 0; i < password.length(); i++){//loop runs through "password"
			char c = password.charAt(i);//sets 'c' to check the indexes of "password"
			if(c >= 'a' && c <= 'z'){//using ASCII, if 'c' contains any letter from a - z
				hasLowerCase = true; //then return true and break from the loop
				break;
			}
			else{
				hasLowerCase = false;
			}
		}
		return hasLowerCase;
	}
	//*************************************
	//this helper method simply checks to see if
	//the String "password" contains an Upper case letter
	//if not, then it returns false
	//*************************************
	public static boolean oneUpperCase(String password){
		boolean hasUpperCase = false;//default
		for(int i = 0; i < password.length(); i++){//loop runs through "password"
			char c = password.charAt(i);
			if(c >= 'A' && c <= 'Z'){//same as before except the letters are UPPERCASE
				hasUpperCase = true;
				break;
			}
			else{
				hasUpperCase = false;
			}
		}
		return hasUpperCase;
	}
	//*************************************
	//this helper method simply checks to see if
	//the String "password" contains a digit
	//if not, then it returns false
	//*************************************
	public static boolean oneDigit(String password){
		boolean hasDigit = false;
		for(int i = 0; i < password.length(); i++){
			int currentChar = password.charAt(i);//the difference here is that currentChar is type Integer.
			if(currentChar >= '0' && currentChar <= '9'){//but it still checks for numbers
				hasDigit = true;
				break;
			}
			else{
				hasDigit = false;
			}
		}
		return hasDigit;
	}

}//end of PassWordChecker.java
