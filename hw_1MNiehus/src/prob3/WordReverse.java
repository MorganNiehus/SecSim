package prob3;

import java.util.ArrayList;
import java.util.Scanner;

public class WordReverse {
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		System.out.print("Input String:\t");
		String str = s.nextLine();
		
		System.out.println("reverseSentence():" + reverseSentence(str));
		
	}
	
	public static String reverseSentence(String str){
		int index = str.length() - 1;
		ArrayList<String> letters = new ArrayList<>();
		for(int i = index; i >= 0; i--)
		{
			char c = str.charAt(i);
			letters.add(c + " ");
		}
		return letters.toString().replace(",", "").replace("]", "").replace("[", "").replace("  ", "");
		
	}

}
