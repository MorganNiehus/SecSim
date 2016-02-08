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

            // it is usually best to declare variables as the "highest type"
            // the employee class has all of the functionality that is required
			Employee h = new HourlyEmployee(name, payRate);

            // numDays worked will always be 0 because the employee
            // has just been instantiated
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
