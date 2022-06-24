package interfacediscussion;

public class ChromeDriver implements WebDriver{

	
	public void close() {
		
		System.out.println("close the browser method");
	}

	
	public void quit() {
		System.out.println("close all the windows");		
	}

	
	public void refresh() {
		
		System.out.println("Refresh the page");	
	}

	
	public void back() {
		
		System.out.println("click on browser back button");	
	}

	
	
}
