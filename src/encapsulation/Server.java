package encapsulation;

public class Server {
	
	
private	int customerbal=50000;
	
	
	public void getBalance(int pin)
	{
		if(pin == 1234)
		{
			System.out.println("Your balance is :Rs."+customerbal);
		}
		else
		{
			System.out.println("Incorrect pin please check and retry");
		}
	}
	
	public void setBalance(int amount, int pin)
	{
		if(pin==1234)
		{
		if(amount <= customerbal)
		{
			customerbal = customerbal -amount;
			
			System.out.println("Please collect the cash, Transaction successfull");
			
		}
		}
		else
		{
			System.out.println("Incorrect pin please check and retry");	
			
		}
	}

}
