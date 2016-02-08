package prob1;

public class Prob4_Tester {

	public static void main(String[] args) {
		CheckingAccount ca = new CheckingAccount(3344, 1000.0, 2000.0);
		ca.setOverdraftLimit(500.0);
		printOverdraftLimit( ca );
		Account a = new SavingsAccount(3344, 1000.0);
		printOverdraftLimit( a );
	}
	
	public static void printOverdraftLimit(Account a)
	{
		if(a instanceof CheckingAccount)
		{
			System.out.println("OverDraft Limit: " + ((CheckingAccount)a).getOverdraftLimit());
		}
		else
			System.out.println("not Applicable");
	}
}
