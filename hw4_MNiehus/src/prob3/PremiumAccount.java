//************************
//Name: Morgan Niehus
//Student ID: 870537844
//Class: CS 1302-A
//HW: HomeWork 4
//Due Date: 2/24/16
//************************
package prob3;

public class PremiumAccount extends Account{

	public PremiumAccount(){
		
	}
	
	public PremiumAccount(double balance){
		super(balance);
	}
	

	@Override
	public double applyInterest() {
		return setBalance((super.getBalance() * 0.015) + super.getBalance());//override the apply interest method
	}
	
	@Override
	public String toString()
	{
		String result = "";
		result = "PremiumAccount: " + super.toString();
		return result;
	}
	
}
