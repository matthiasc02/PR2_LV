package exceptions.ue.account;

public class BankDemo {

	public static void main(String[] args)
		{
			Bank Raika = new Bank(); 
			
			try {
				Raika.addAccount("A1", 1000, 5000);
				Raika.addAccount("A2", 0, 0);
				Raika.addAccount("A3", 100, 1000);
				Raika.addAccount("A4", 200, 0);
				Raika.addAccount("A5", 1000, 5000);
				Raika.addAccount("A6", 1000, 5000);
				
			} catch (BankException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//fragen ob man hier 2 try macht oder eher nicht
			try {
				Raika.transfer("A3", "A1", 100);
				
			} catch (AccountNotFoundException | BankException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	

}
