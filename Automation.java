package week3.day2;

public class Automation extends MultipleLanguage implements Language, TestTool {

	public static void main(String[] args) {
		Automation automation = new Automation();
		automation.Selenium();
		automation.java();
		automation.ruby();
		automation.python();
	}

	
	  public void Selenium() {
		  System.out.println("Selenium....");
	  
	  }
	 
	public void java() {
		System.out.println("Java....");
		
	}

	@Override
	public void ruby() {
		System.out.println("Ruby....");
		
	}
	
}
