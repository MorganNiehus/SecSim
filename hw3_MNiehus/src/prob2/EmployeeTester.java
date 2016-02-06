package prob2;

import java.util.Scanner;

public class EmployeeTester {
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.print("input name: ");
		String name = s.nextLine();
		
		System.out.print("input type: ");
		String type = s.nextLine();
		
		System.out.print("input hour: ");
		String hours= s.nextLine();
			
		System.out.print("input payRate: ");
		double payRate = s.nextDouble();
		s.close();
		
		if(type.equals("h")){
			HourlyEmployee h = new HourlyEmployee(name, payRate);
			for(int i = 0; i < h.numDaysWorked(); i++){
			}
			displayHourly(h);
		}
	}
	
	public static void displayHourly(HourlyEmployee h)
	{
		System.out.println(h.toString());
	}
	


}
