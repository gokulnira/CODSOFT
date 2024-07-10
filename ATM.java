import java.util.Scanner;
class BankAccount {
 private int balance;
public BankAccount(int initialBalance) 
{
 this.balance = initialBalance;
}
public int getBalance()
{
 return balance;
}
public void deposit(int amount)
{
  if (amount > 0)
{
balance += amount;
} 
else
{
 System.out.println("Deposit amount");
}
}
 public boolean withdraw(int amount) 
{
 if (amount > 0 && amount <= balance)
 {
balance -= amount;
return true;
 } else 
{
System.out.println("Invalid amount or insufficient balance.");
 return false;
}
}
}
class ATM
{
 private BankAccount account;
 public ATM(BankAccount account) 
{
 this.account = account;
 }
 public void showMenu() 
{
 System.out.println("ATM Menu option:");
 System.out.println("1. Check Balance amount ");
 System.out.println("2. Deposit amount ");
 System.out.println("3. Withdraw amount");
 System.out.println("4. Exit");
 }
public void handleUserInput(int choice, Scanner scanner)
 {
 switch (choice)
 {
 case 1:
 System.out.println("balance is" + account.getBalance());
 break;
 case 2:
 System.out.print("Enter deposit amount: ");
 int depositAmount = scanner.nextInt();
 account.deposit(depositAmount);
 System.out.println("Deposited" + depositAmount);
 break;
 case 3:
  System.out.print("Enter withdraw amount:");
 int withdrawAmount = scanner.nextInt();
 if (account.withdraw(withdrawAmount))
 {
 System.out.println("Withdraw" + withdrawAmount);
 }
  break;
 default:
 System.out.println("Invalid Account.");
}
}
}
