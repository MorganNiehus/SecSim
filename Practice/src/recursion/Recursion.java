package recursion;

public class Recursion {

	public static void main(String[] args) {
		
		System.out.println(reverse("Hello"));

	}
	
	public static int factorial(int x){
		if(x == 0){
			return 1;
		}
		else 
			return x * factorial(x - 1);
	}
	
	public static int power(int base,int x){
		if(x <= 0){
			return 1;
		}
		if(x % 2 == 1)
			return power(base, x - 1);
		else
			return (int) (Math.pow(base, x) + power(base, x - 2));
	}
	
	public static String reverse(String str){

		if(str.length() == 0)
			return "";
		else
			return  str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
	}
	
	
}
