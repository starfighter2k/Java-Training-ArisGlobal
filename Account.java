package training;

public class Account {
	private long number;
	private User owner;
	private double balance;
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public User getOwner() {
		return owner;
	}
	public void setOwner(User owner) {
		this.owner = owner;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void deposit(double amount)
	{
		if(amount < 0)
			System.out.println("Invalid input");
		else
			this.balance += amount;
	}
	public void withdraw(double amount)
	{
		if(amount < 0)
			System.out.println("Invalid Amount");
		else if(amount > this.balance)
			System.out.println("Not enough balance");
		else
			this.balance -= amount;
	}
	public void checkBalance()
	{
		System.out.println("Current balance = "+this.balance);
	}
}
