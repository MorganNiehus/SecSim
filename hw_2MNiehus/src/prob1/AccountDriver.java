//************************
//Name: Morgan Niehus
//Student ID: 870537844
//Class: CS 1302-A
//HW: HomeWork 2
//Due Date: 2/3/16
//************************
package prob1;

import java.text.*;
import java.util.Locale;

public class AccountDriver {
	
	public static void main(String[] args)
	{
		//***********************************
		//very generic driver method for the
		//acccount class
		//***********************************
		Locale locale = new Locale("en", "US");
		NumberFormat fmt = NumberFormat.getCurrencyInstance(locale);//creates a currency format
		
		Account account1 = new Account(1122, 20000);
		
		account1.setAnnualInterestRate(4.5 / 100);
		account1.withdraw(2500);
		account1.deposit(3000);
		
		System.out.println(fmt.format(account1.getBalance()));
		System.out.println(fmt.format(account1.getMonthlyInterest()));
		System.out.println(account1.getDate());
	}

}
