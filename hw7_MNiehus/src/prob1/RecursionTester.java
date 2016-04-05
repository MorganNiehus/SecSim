//************************
//Name: Morgan Niehus
//Student ID: 870537844
//Class: CS 1302-A
//HW: HomeWork 4
//Due Date: 2/24/16
//************************
package prob1;

public class RecursionTester {
	
	public static void main(String[] args){
		
	}
	
	public static int power(int base, int n) {
		  if (n <= 0)//baseCase
		   return 1;
		  else if (n % 2 == 0)
		   return (int) Math.pow(base, n) + power(base, n - 2);
		  else
		   return power(base, n - 1);
		 }
	
	public static String reverseString(String x){
		if(x.length() == 0)//base case
			return "";
		else
			return x.charAt(x.length() - 1) + reverseString(x.substring(0, x.length() - 1));
		
	}
	
	public static int countOccurrences(String str, char key){
		if(str.length() == 0)//basecase
			return 0;
		if(str.charAt(0) == key)
			return 1 + countOccurrences(str.substring(1, str.length()-1), key);
		else
			return countOccurrences(str.substring(1, str.length()-1), key);
		
	}
	
	public static String makePalindrome(String s)
	 {
	  if(s.length() == 0)//base case
	   return "";
	  else
	  {
	   String k = makePalindrome(s.substring(1, s.length()));
	   return s.charAt(0 ) + k + s.charAt(0 );
	  }
	 }

}
