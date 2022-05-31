package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassroomList {

	public static void main(String[] args) {
		
		
			
			WebDriverManager.chromedriver().setup();
			
			ChromeDriver driver=new ChromeDriver();
			
			driver.get("http://www.leafground.com/pages/Link.html");		
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			// Get all the links (using findElements)
			
			List<WebElement> allLinks =driver.findElements(By.tagName("a"));
			
			WebElement firstLink=allLinks.get(0);
			
			firstLink.click();
			
			System.out.println(driver.getTitle());
			
			driver.navigate().back();
			
			List<WebElement> allLinks1=driver.findElements(By.tagName("a"));
			
			System.out.println(allLinks1.size());
			
			String href=allLinks1.get(1).getAttribute("href");
			
		
			
			
		
			
			
			
				

	}
}
