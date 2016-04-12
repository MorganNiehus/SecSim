package simpleDivision;

import java.util.Scanner;

public class Quotiant {

	public static void main(String[] args){
		do{
		
			Scanner s = new Scanner(System.in);
		
			System.out.print("Q1: ");
			int x = s.nextInt();
			System.out.print("Q2: ");
			int y = s.nextInt();

		
			try
			{
				System.out.println(divide(x, y));
			}
			catch(ArithmeticException e)
			{
				System.out.println("Cannot divide by zero\n");
			}
		}
		while(true);
	}
	
	public static int divide(int x, int y){
		return x / y;
	}
		

}
