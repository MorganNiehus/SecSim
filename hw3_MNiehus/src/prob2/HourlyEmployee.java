package prob2;

public class HourlyEmployee extends Employee{
	
	private double payRate = 0;
	
	public HourlyEmployee(String name, double payRate)
	{
		super(name);
		this.payRate = payRate;
	}
	
	@Override
	public double wages(double payRate)
	{
		double temp = 0;
		if(totalHours() > 40){
			temp = 400;
			payRate = payRate / 2;
		}
		return payRate * totalHours() + temp;
	}
	
	@Override
	public String toString()
	{
		String result = " ";
		result = super.toString() + "\nTotalWages" + wages(payRate);
		return result;
	}

}
