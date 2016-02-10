//************************
//Name: Morgan Niehus
//Student ID: 870537844
//Class: CS 1302-A
//HW: HomeWork 2
//Due Date: 2/3/16
//************************
package prob2;

public class Employee {

	private double[] hours = new double[7];//day of the week
	private String name;
	private double payRate = 0;

	public Employee(String name)
	{
		this.name = name;
	}
	
	public Employee(String name, double payRate)
	{
		this.name = name;
		this.payRate = payRate;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
	//******************************
	 //this will check and see if the day
	 //matches a day of the week on an array
	 //******************************
	 public double getHours(int day)
	 {
	  if(day < 0 || day > 6)
	  {
	   return 0;
	  }
	  return hours[day];
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
		for(int i = 0; i < 7; i++)
		{

            // this code is obfuscated and should be modified to the following:
            // if(hours[i] != 0) counter++;
			if(hours[i] != 0)
			{
				counter++;//subtract if day is '0'
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

	public double wages(double payRate)
	{
		return payRate * totalHours();
	}

	public String toString()//prints the class contents
	{
		String result = " ";
		result = name + " worked " + numDaysWorked() + " Day(s) for a total of " + totalHours() + " hours.\n" + "Total Wage: " + wages(payRate);
		return result;
	}

}
