package prob2;

import java.util.Scanner;

public class PasswordChecker {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Input password:");
		String password = s.nextLine();
		
		if(password.length() >= 5){
			System.out.println(isLevel1(password));
			System.out.println(isLevel2(password));
			System.out.println(passwordLevel(password));
		}
		else
			System.out.println("must be more than 6 characters!");
		

		
	}
	
	public static boolean isLevel1(String password){
		boolean mark1 = false;
		boolean mark2 = false;
		boolean mark3 = false;
		boolean isLevel1 = false;
		if(oneLowerCase(password) == true)
		{
			mark1 = true;
		}
		if(oneUpperCase(password) == true)
		{
			mark2 = true;
		}
		if(oneDigit(password) == true)
		{
			mark3 = true;
		}
		if((mark1 && mark2) || (mark2 && mark3) || (mark1 && mark3)){
			isLevel1 = true;
		}
		return isLevel1;
	}
	public static boolean isLevel2(String password){
		boolean mark1 = false;
		boolean mark2 = false;
		boolean mark3 = false;
		boolean isLevel2 = false;
		if(oneLowerCase(password) == true)
		{
			mark1 = true;
		}
		if(oneUpperCase(password) == true)
		{
			mark2 = true;
		}
		if(oneDigit(password) == true)
		{
			mark3 = true;
		}
		if(mark1 && mark2 && mark3){
			isLevel2 = true;
		}
		return isLevel2;
	}
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
	
	
	public static boolean oneLowerCase(String password){
		boolean hasLowerCase = false;
		for(int i = 0; i < password.length(); i++){
			char c = password.charAt(i);
			if(c >= 'a' && c <= 'z'){
				hasLowerCase = true;
				break;
			}
			else{
				hasLowerCase = false;
			}
		}
		return hasLowerCase;
	}
	public static boolean oneUpperCase(String password){
		boolean hasUpperCase = false;
		for(int i = 0; i < password.length(); i++){
			char c = password.charAt(i);
			if(c >= 'A' && c <= 'Z'){
				hasUpperCase = true;
				break;
			}
			else{
				hasUpperCase = false;
			}
		}
		return hasUpperCase;
	}
	public static boolean oneDigit(String password){
		boolean hasDigit = false;
		for(int i = 0; i < password.length(); i++){
			int currentChar = password.charAt(i);
			if(currentChar >= '0' && currentChar <= '9'){
				hasDigit = true;
				break;
			}
			else{
				hasDigit = false;
			}
		}
		return hasDigit;
	}

}
