package prob2;

public class HourlyEmployee extends Employee{
	
	private double wage = 0;
	
	public HourlyEmployee(String name, double wage)
	{
		super(name, wage);
		this.wage = wage;
	}
	
	public double getWage()
	{
		return wage;
	}
	
	public void setWage(double wage)
	{
		this.wage = wage;
	}
	
	@Override
	public double wages()
	{
		double temp = 0;
		for(int i = 0; i < super.totalHours(); i++)
		{
			if(super.totalHours() >= 40)
			{
				temp = wage *= super.totalHours();
			}
 		}
		return temp;
	}
	
	public String toString()
	{
		String result = super.toString() + " Total wages = " + wages();
		return result;
	}
}
