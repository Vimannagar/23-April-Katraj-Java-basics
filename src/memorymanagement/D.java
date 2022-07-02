package memorymanagement;

public class D extends E {
	
	public void m9()
	{
		a.m1();
		b.m5();
		c.m8();
	}
	
	public void m10()
	{
		a.m3();
		c.m7();
		b.m6();
	}
	
	public static void main(String[] args) {
				
		D d =  new D();
		
		d.m9();
		
		d.m10();
		
		
	}

}
