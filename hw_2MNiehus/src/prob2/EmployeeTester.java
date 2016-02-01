package prob2;

import java.util.Scanner;

public class EmployeeTester {
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.print("-->Enter a name : ");
		String name = s.nextLine();
		System.out.print("-->Enter hours worked (7 values seperated by spaces): ");
		String hoursStr = s.nextLine();
		double[] hours = new double[7];
		
		String hoursStrEdit = hoursStr.trim();
		hoursStrEdit = hoursStr.replaceAll("\\s", "");
		
		for(int i = 0; i <= hoursStrEdit.length() - 1; i++)
		{
			double number = hoursStrEdit.charAt(i);
			hours[i] = number - '0';
		}

		Employee emp1 = new Employee(name);
		
		for(int i = 0; i < hours.length; i++)
		{
			emp1.setHours(i, hours[i]);
		}
		
		System.out.println(emp1.toString());
		
		System.out.print("-->Enter a day of the week (0 - 6): ");
		int day = s.nextInt();
		
		System.out.println("hours worked on " + day + " is " + emp1.getHours(day));
		
		
		
		
		
		
		
	}

}
