package prob2;

public class SalariedEmployee extends Employee {
	
	private double payRate = 0;
	
	public SalariedEmployee(String name, double payRate)
	{
		super(name);
		this.payRate = payRate;
	}
	
	@Override
	public double wages(double payRate)
	{
		double temp = 0;
        double hours = totalHours();
        for(int i = 0; i < 6; i++)
        {
        	if(getHours(i) == 5 || getHours(i) == 6)
        	{
        		payRate = payRate * 1.5;
        	}
        }
		return payRate * hours + temp;
	}
	
	@Override
	public String toString()
	{
		String result = " ";
		result = super.toString() + "\nTotalWages" + wages(payRate);
		return result;
	}

}
