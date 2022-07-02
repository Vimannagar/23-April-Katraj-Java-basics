package interfacediscussion;

public interface Interface1 {
		int i = 50;
	
	
	public void m1();
	
	public abstract void m2();

	void m3();
	public void commonMethod();
	
	
	public static void main(String[] args) {
		
		System.out.println(i);//50
		
		System.out.println(Interface1.i);//50
		
//		i = 80; variable inside an interface are by default public static and final hence we cannot initialize it at here
		
		
		
		
		
	}
	
	
	

}
