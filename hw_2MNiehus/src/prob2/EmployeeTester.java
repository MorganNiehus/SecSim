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
		String name = s.nextLine();//capture next line
		System.out.print("-->Enter hours worked (7 values seperated by spaces): ");
		String hoursStr = s.nextLine();//captures hours as a String
		double[] hours = new double[7];//new array for hours
		
		String hoursStrEdit = hoursStr.trim();//trim the spaces
		hoursStrEdit = hoursStr.replaceAll("\\s", "");//replace the spaces
		
		for(int i = 0; i <= hoursStrEdit.length() - 1; i++)//inserts all string numbers into the array
		{
			double number = hoursStrEdit.charAt(i);
			hours[i] = number - '0';
		}

		Employee emp1 = new Employee(name);//new object

		
		for(int i = 0; i < hours.length; i++)//set all hours
		{
			emp1.setHours(i, hours[i]);
		}
		
		System.out.println(emp1.toString());

		
		System.out.print("-->Enter a day of the week (0 - 6): ");
		int day = s.nextInt();//capture day of the week
		s.close();//close the scanner
		
		System.out.println("hours worked on " + day + " is " + emp1.getHours(day));
		
	}

}
