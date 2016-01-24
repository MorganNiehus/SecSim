package prob1;

import java.util.*;

public class MessageParser {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("insert a code length:");
		
		String code = s.next();
		
		System.out.print("Youre Code:\t");
		System.out.println(message(code));

	}
	
	public static String message(String code)
	{
		
		if(code.contains("#"))
		{
			int poundPlacement = code.indexOf("#");
			int indexValue = poundPlacement + 1;
			int numberValueAscii = code.charAt(indexValue);
			char numberValueChar = (char)numberValueAscii;
			int numberValue = numberValueChar - '0';
			
			return code.substring(indexValue + 1, indexValue + numberValue + 1);
			
		}
		else
			return null;
	}

}
