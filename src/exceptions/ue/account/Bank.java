package exceptions.ue.account;

import java.util.HashMap;

public class Bank {
	private HashMap<String, Konto> accounts = new HashMap<>();
	
	
	public void addAccount(String owner, double
			balance, double overdraftFrame) throws BankException{
		if(accounts.containsKey(owner)){
			throw new BankException("Konto schon vorhanden");
		}
		else {
			accounts.put(owner, new Konto(owner, balance, overdraftFrame));
			System.out.println("Konto f�r "+owner+" angelegt.");
		}
		
	}
	
	public void transfer(String fromOwner, String toOwner, double amount) throws AccountNotFoundException, BankException 
	{
		if (accounts.containsKey(toOwner) && accounts.containsKey(fromOwner))
		{
		 Konto deb = accounts.get(fromOwner);
		 Konto cre = accounts.get(toOwner);
		 
		 try
			{
				deb.debit(amount);
				cre.credit(amount);
			}
		catch (NotEnoughMoneyException exc)
			{
				throw new BankException(exc);
			}
		 
		 System.out.println(amount + " � von "+ fromOwner +  " an "+ toOwner + " �berwiesen");
		}
		else 
			throw new AccountNotFoundException("�berweisung nicht durchgef�hrt." +"\n" + "Ein Konto wurde nicht gefunden. ");
	}

	@Override
	public String toString() {
		return "Bank [accounts=" + accounts + "]";
	}

}
