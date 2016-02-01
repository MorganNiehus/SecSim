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
		final int N = emps.length;
		emps = Arrays.copyOf(emps, N + 1);
		emps[N] = e;
	}
	
	public double totalHours()
	{
		double total = 0;
		for(int i = 0; i < emps.length; i++)
		{
			total += totalHours();
		}
		return total;
	}
	
	public String toString()
	{
		String result = " ";
		for(int i = 0; i < emps.length; i++)
			System.out.print(emps[i]);
		result = "\nnumber of employees" + getNumEmps() + "\n" + "Total hours ";
		return result;
	}

}
