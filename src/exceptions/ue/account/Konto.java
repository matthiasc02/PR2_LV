package exceptions.ue.account;

public class Konto {
	private String owner;
	private double balance;
	private double overdraftFrame;
	
	public Konto(String owner, double balance, double overdraftFrame) {
		super();
		this.owner = owner;
		this.balance = balance;
		this.overdraftFrame = overdraftFrame;
	}

	public String getOwner() {
		return owner;
	}

	public double getBalance() {
		return balance;
	}

	public double getOverdraftFrame() {
		return overdraftFrame;
	}
	
	public void credit(double amount){
		balance+=amount;
	}
	
	public void debit(double amount) throws NotEnoughMoneyException{
		if (balance-amount < overdraftFrame){
			throw new NotEnoughMoneyException("Rahmen überschritten");
		}
		else
		{
			balance-=amount;
		}
	}

	@Override
	public String toString() {
		return "Konto [owner=" + owner + ", balance=" + balance + ", overdraftFrame=" + overdraftFrame + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(overdraftFrame);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((owner == null) ? 0 : owner.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Konto other = (Konto) obj;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		if (Double.doubleToLongBits(overdraftFrame) != Double.doubleToLongBits(other.overdraftFrame))
			return false;
		if (owner == null) {
			if (other.owner != null)
				return false;
		} else if (!owner.equals(other.owner))
			return false;
		return true;
	}
	
	

}
