package prob1;
public class AccountTester {
public static void main (String[] args) {
CheckingAccount account = new CheckingAccount(1122, 1000.0, 5000.0);
printCheckingInfo(account);
account.withdraw(2000.0);
printCheckingInfo(account);
account.withdraw(5000.0);
printCheckingInfo(account);
account.setOverdraftLimit(2000.0);
printCheckingInfo(account);
account.withdraw(1001.0);
printCheckingInfo(account);
account.withdraw(999.0);
printCheckingInfo(account);
SavingsAccount sAccount = new SavingsAccount(1122, 1000.0);
//printSavingsInfo(sAccount);
//sAccount.withdraw(1001.0);
//printSavingsInfo(sAccount);
//sAccount.withdraw(999.0);
//printSavingsInfo(sAccount);
}
public static void printCheckingInfo( CheckingAccount acnt) {
System.out.printf("Bal: $%4.2f, overdraft limit: $%4.2f\n", acnt.getBalance(), acnt.getOverdraftLimit());
}
public static void printSavingsInfo( SavingsAccount acnt) {
System.out.printf("Bal: $%4.2f\n", acnt.getBalance());
}
}