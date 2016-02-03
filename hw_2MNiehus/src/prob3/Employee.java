//************************
//Name: Morgan Niehus
//Student ID: 870537844
//Class: CS 1302-A
//HW: HomeWork 2
//Due Date: 2/3/16
//************************
package prob3;

public class Employee {
	
	private double[] hours = new double[7];//day of the week
	private String name;
	
	public Employee(String name)
	{
		this.name = name;
	}
	//******************************
	//this will check and see if the day
	//matches a day of the week on an array
	//******************************
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
	//*************************************
	//sets the hours given by the driver
	//*************************************
	public void setHours(int day, double hrs)
	{
		for(int i = 0; i < hours.length; i++)
		{
			if(day == i)//checks for the day
			{
				hours[i] = hrs;//sets the hours to the array
			}
		}
	}
	//*************************************
	//this method simply sets a counter
	//and subtracts one for every zero
	//so that they dont count as a day
	//worked
	//*************************************
	public int numDaysWorked()
	{
		int counter = 0;
		for(int i = 0; i < hours.length; i++)
		{
			counter++;
			if(hours[i] == 0)
			{
				counter--;//subtract if day is '0'
			}
				
		}
		return counter;
	}
	//*************************************
	//simple sum capture method using the
	//array
	//*************************************
	public double totalHours()
	{
		double sum = 0;
		for(int i = 0; i < hours.length; i++)
		{
			sum += hours[i];//captures the sum
		}
		return sum;
	}
	public String toString()//prints the class contents 
	{
		String result = " ";
		result = name + " worked " + numDaysWorked() + " Day(s) for a total of " + totalHours() + " hours.\n";
		return result;
	}

}
