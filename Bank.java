package training;
import java.util.*;
public class Bank {
	private ArrayList<Account> accounts = new ArrayList<Account>();
	public void addAccount(long number,User user)
	{
		Account account = new Account();
		account.setBalance(0);
		account.setNumber(number);
		account.setOwner(user);
		accounts.add(account);
	}
	public void removeAccount(Account account)
	{
		int f=0,index=-1;
		Iterator iter = accounts.iterator();
		Account temp;
		ArrayList<Account> accountNew = new ArrayList<Account>();
		while(iter.hasNext())
		{
			temp = (Account) iter.next();
			if(temp.getNumber() == account.getNumber())
			{
				f=1;
				continue;
			}
			else
				accountNew.add(temp);
		}
		if(f==0)
			System.out.println("Account not present in list");
		accounts = accountNew;
	}
	public double getBalance(Account account)
	{
		return account.getBalance();
	}
	public void printBalance(Account account)
	{
		account.checkBalance();
	}
}
