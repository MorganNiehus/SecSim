//************************
//Name: Morgan Niehus
//Student ID: 870537844
//Class: CS 1302-A
//HW: HomeWork 2
//Due Date: 2/3/16
//************************
package prob2;

import java.util.Scanner;

public class EmployeeTester {
	
	public static void main(String[] args)
	{

		Scanner s = new Scanner(System.in);//scanner
		System.out.print("-->Enter a name : ");	
		String name = s.nextLine();
		System.out.print("What type of employee : "); 
		String empType = s.nextLine();
		System.out.print("What is the wage? : ");
		double wagePerHour = s.nextDouble();
		System.out.print("-->Enter hours worked (7 values seperated by spaces): ");
		String hoursStr = s.nextLine();//captures hours as a String
		s.close();

		if(empType.equals("h")){
			HourlyEmployee h = new HourlyEmployee(name, wagePerHour);
			double[] hours = hoursReturn(hoursStr);
			for(int i = 0; i < hours.length; i++)
				h.setHours(i, 8);
			displayHourly(h);
			
		}
	
	}
	
	public static void displayHourly(HourlyEmployee h){
	    
		System.out.println(h.toString());
		
	}
	
	
	public static void displaySalary(){
		
	}
	
	public static double[] hoursReturn(String hoursStr){
		double[] hours = new double[7];
		String hoursStrTrim = hoursStr.trim();
		hoursStrTrim = hoursStr.replaceAll("\\s", "");
		for(int i = 0; i <= hoursStrTrim.length() - 1; i++){
			double number = hoursStrTrim.charAt(i);
			hours[i] = number - '0';
		}
		return hours;
	}
	
	
	

}
