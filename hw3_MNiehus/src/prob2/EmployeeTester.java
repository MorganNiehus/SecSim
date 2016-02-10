package prob2;

import java.util.Scanner;

public class EmployeeTester {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);//scanner

		System.out.print("input name: ");
		String name = scan.nextLine();

		System.out.print("input type: ");
		String type = scan.nextLine();

		System.out.print("input payRate: ");
		double payRate = scan.nextDouble();
		
		System.out.print("input hour: ");



		if(type.equals("h")){

            // it is usually best to declare variables as the "highest type"
            // the employee class has all of the functionality that is required
			Employee h = new HourlyEmployee(name, payRate);
			
			for(int i = 0; i < 6; i++)
				h.setHours(i, scan.nextDouble());

            // numDays worked will always be 0 because the employee
            // has just been instantiated
			displayEmployee(h);
		}
		else if(type.equals("s"))
		{
			Employee s = new SalariedEmployee(name, payRate);
			
			for(int i = 0; i < 6; i++)
				s.setHours(i, scan.nextDouble());
			
			displayEmployee(s);
			
		}
		else if(type.equals("e"))
		{
			Employee e = new Employee(name, payRate);
			
			for(int i = 0; i < 6; i++)
				e.setHours(i, scan.nextDouble());
			
			displayEmployee(e);
			
			
			
		}
		scan.close();

	}

	public static void displayEmployee(Employee h)
	{
			System.out.println(h.toString());	
	}
	



}
