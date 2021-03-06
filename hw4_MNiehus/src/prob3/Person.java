//************************
//Name: Morgan Niehus
//Student ID: 870537844
//Class: CS 1302-A
//HW: HomeWork 4
//Due Date: 2/24/16
//************************
package prob3;

import java.util.ArrayList;

public class Person{

	ArrayList<Account> accounts = new ArrayList<>();
	
	public Person(){
		
	}
	
	public void addAccount(Account a){
		accounts.add(a);
	}
	
	public Account getAccount(int i){
		return accounts.get(i);
	}
	
	public int getNumAccounts(){
		return accounts.size();
	}
	
	public double getTotalBalance(){
		double sum = 0;
		for(int i = 0; i < accounts.size(); i++){
			sum += accounts.get(i).getBalance();
		}
		return sum;
	}
	
	public void applyInterest(){
		for(int i = 0; i < accounts.size(); i++){
			accounts.get(i).applyInterest();
		}
	}
	
	public ArrayList<PremiumAccount> getPremiumAccounts(){
		ArrayList<PremiumAccount> premiumAccounts = new ArrayList<>();
		
		for(int i = 0; i < accounts.size(); i++){
			if(accounts.get(i) instanceof PremiumAccount){
				premiumAccounts.add((PremiumAccount)accounts.get(i));
			}
		}
		return premiumAccounts;
	}
	
	public String toString(){
		String upperResult = "";
		String lowerResult = "";
		String totalResult = "";
		
		System.out.println("Num Accounts: " + getNumAccounts());
		
		for(int i = 0; i < accounts.size(); i++){
			System.out.println("bal: " + accounts.get(i).getBalance());
		}
		
		return totalResult = "Total Balance = " + getTotalBalance();
		
	
	}
	
	
	
}
