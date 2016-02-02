//************************
//Name: Morgan Niehus
//Student ID: 870537844
//Class: CS 1302-A
//HW: HomeWork 2
//Due Date: 2/3/16
//************************
package prob3;

public class Employee {
	
	private double[] hours = new double[7];
	private String name;
	
	public Employee(String name)
	{
		this.name = name;
	}
	public double getHours(int day)
	{
		double hoursPerDay = 0;
		for(int i = 0; i < hours.length; i++)
		{
			if(day == i)
				hoursPerDay = hours[i];
		}
		return hoursPerDay;
	}
	public void setHours(int day, double hrs)
	{
		for(int i = 0; i < hours.length; i++)
		{
			if(day == i)
			{
				hours[i] = hrs;
			}
		}
	}
	public int numDaysWorked()
	{
		int counter = 0;
		for(int i = 0; i < hours.length; i++)
		{
			counter++;
			if(hours[i] == 0)
			{
				counter--;
			}
				
		}
		return counter;
	}
	public double totalHours()
	{
		double sum = 0;
		for(int i = 0; i < hours.length; i++)
		{
			sum += hours[i];
		}
		return sum;
	}
	public String toString()
	{
		String result = " ";
		result = name + " worked " + numDaysWorked() + " Day(s) for a total of " + totalHours() + " hours.\n";
		return result;
	}

}
