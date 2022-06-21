package encapsulation;

public class ATMMachine {
	
	
//	public void balanceEnq()
//	{
//		Server s = new Server();
//		
//		s.getBalance(1234);
//	}

//	public void withDrawl()
//	{
//		Server s = new Server();
//		s.setBalance(5000, 1234);
//	}
	
	public static void main(String[] args) {
		ATMMachine am = new ATMMachine();
		
		Server s = new Server();
//		
		s.getBalance(1234);// Abstraction
		
		s.setBalance(5000, 1234);
		
		s.getBalance(1234);
		
	}
}


//Abstraction +Data hiding = Encapsulation