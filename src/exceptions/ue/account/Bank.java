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
			System.out.println("Konto für "+owner+" angelegt.");
		}
		
	}
	
	public void transfer(String fromOwner, String toOwner, double amount) throws AccountNotFoundException, BankException{
		
	}

}
