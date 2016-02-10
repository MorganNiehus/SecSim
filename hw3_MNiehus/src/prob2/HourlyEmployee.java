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
        double hours = totalHours();
		if(hours > 40){

            // we store the pay for 40 hours here to be added
			temp = 40 * payRate;

            // remove the 40 hours already accounted for
            hours -= 40;
			payRate = payRate * 1.5;
		}
		return payRate * hours + temp;
	}

	public String toString()
	{
		String result = " ";
		result = super.getName() + " worked " + numDaysWorked() + " Day(s) for a total of " + totalHours() + " hours.\n" + "Total Wage: " + wages(payRate);
		return result;
	}

}
