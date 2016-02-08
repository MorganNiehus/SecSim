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
        int hours = totalHours();
		if(hours > 40){

            // we store the pay for 40 hours here to be added
			temp = 40 * payRate;

            // remove the 40 hours already accounted for
            hour -= 40;
			payRate = payRate / 2;
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
