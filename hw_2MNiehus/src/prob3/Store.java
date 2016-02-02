package prob3;

import java.util.Arrays;

public class Store {
	
	private Employee[] emps = new Employee[20];
	private int numEmps = 0;
	
	public Store()
	{
		
	}
	
	public int getNumEmps()
	{
		return numEmps;
	}
	
	public Employee getEmp(int i)
	{
		for(int j = 0; j < emps.length; j++)
		{
			if(i == j)
				return emps[j];
		}
		return null;
		
	}
	public void addEmp(Employee e)
	{
		emps[numEmps++] = e;
	}
	
	public double totalHours()
	{
		double total = 0;
		for(int i = 0; i < numEmps; i++)
		{
			total += emps[i].totalHours();
		}
		return total;
	}
	
	public String toString()
	{
		String result = " ";
		for(int i = 0; i < numEmps; i++)
		{
			result += emps[i];
		}
		String hoursWorked = "\nTotal hours " + totalHours();
		return "\nnumber of Employees " + getNumEmps() + "\n" + result.trim() + " " + hoursWorked;
	}

}
