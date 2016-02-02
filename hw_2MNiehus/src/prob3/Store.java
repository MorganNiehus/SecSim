//************************
//Name: Morgan Niehus
//Student ID: 870537844
//Class: CS 1302-A
//HW: HomeWork 2
//Due Date: 2/3/16
//************************
package prob3;


public class Store {
	
	private Employee[] emps = new Employee[20];//default store cap
	private int numEmps = 0;//default number of employees
	
	public Store()
	{
		
	}
	
	public int getNumEmps()//get the current number of employees
	{
		return numEmps;
	}
	//******************************************
	//method checks the input and matches it
	//to an object in the array
	//******************************************
	public Employee getEmp(int i)
	{
		for(int j = 0; j < emps.length; j++)
		{
			if(i == j)
				return emps[j];
		}
		return null;
		
	}
	//******************************************
	//adds employee to the latest position
	//in the array
	//******************************************
	public void addEmp(Employee e)
	{
		emps[numEmps++] = e;
	}
	//******************************************
	//this method calculates the total
	//number of hours in the store
	//******************************************
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
		return "\nnumber of Employees " + getNumEmps() + "\n" 
				+ result.trim() + " " + "\nTotal hours " + totalHours();
	}

}
