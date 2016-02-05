package prob2;

public class HourlyEmployee extends Employee{
	
	
	public HourlyEmployee(String name)
	{
		super(name);
	}
	
	@Override
	public double wages(double wagePerHour)
	{
		double temp = 0;
		for(int i = 0; i < super.totalHours(); i++)
		{
			if(super.totalHours() <= 40)
			{
				temp = wagePerHour *= super.getHours(i);	
			}
			else
			{
				wagePerHour = wagePerHour / 2;
				temp = wagePerHour *= super.getHours(i);			}
 		}
		return temp;
	}
	
	public String toString()
	{
		String result = super.toString() + " Total wages = ";
		return result;
	}
}
