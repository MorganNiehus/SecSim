//************************
//Name: Morgan Niehus
//Student ID: 870537844
//Class: CS 1302-A
//HW: HomeWork 1
//Due Date: 1/27/16
//************************
package prob3;

import java.util.ArrayList;
import java.util.Scanner;

public class WordReverse {
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);//user input
		System.out.print("Input String:\t");
		String str = s.nextLine();//capture user input
		
		System.out.println("reverseSentence():" + reverseSentence(str));//call reverseSentence method
		
	}
	//****************************************
	//this method accepts a String "str"
	//and reverses it "Andrew" --> "werdnA"
	//****************************************
	public static String reverseSentence(String str){
		int index = str.length() - 1;//this find the last character in "str"
		ArrayList<String> letters = new ArrayList<>();//this will contain all the letters
		for(int i = index; i >= 0; i--)//this loop then runs through "str" from back to front
		{
			char c = str.charAt(i);//this makes sure that "i" is grabbing all the characters
			letters.add(c + " ");//this is adding the characters into the ArrayList in reverse
		}
		return letters.toString().replace(",", "").replace("]", "").replace("[", "").replace("  ", "");
		//this will return the reversed String minus all the ArrayList contents: [],
		
	}

}
