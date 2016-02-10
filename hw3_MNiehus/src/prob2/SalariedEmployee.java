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
	  double totalWages = 0;
	        double hours = totalHours();
	        for(int i = 0; i < 7; i++)
	        {
	         if(i == 5 || i == 6)
	         {
	          totalWages += payRate * 1.5 * getHours(i);
	         }
	         else
	         {
	          totalWages += payRate * getHours(i);
	         }
	        }
	  return totalWages;
	 }
	
	public String toString()
	{
		String result = " ";
		result = super.getName() + " worked " + numDaysWorked() + " Day(s) for a total of " + totalHours() + " hours.\n" + "Total Wage: " + wages(payRate);
		return result;
	}

}
