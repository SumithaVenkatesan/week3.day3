package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/*
1) Launch chrome and go to http://www.leafground.com/pages/Link.html
2) Get all the links (using findElements)
3) Click on the first link (using get method with index as 0)
4) Print the title
5) Navigate back on the browser (driver.navigate().back())
6) Get all the links again (using findElements)
7) Print the count of the links (size)*/

public class LearnDropdown {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Link.html");		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		List<WebElement> allLinks =driver.findElements(By.tagName("a"));
		System.out.println("allLinks : "+allLinks.size());
		
		
		
		for(WebElement element:allLinks) {
			System.out.println("element: "+element.getText());
		}
		driver.findElements(By.tagName("a")).get(0).click();
		
		System.out.println("Title: "+driver.getTitle());
		
		driver.navigate().back();
		List<WebElement> backallLink =driver.findElements(By.tagName("a"));
		System.out.println("backallLink : "+backallLink.size());
		for(WebElement bckElement:backallLink) {
			System.out.println("bckElement: "+bckElement.getText());
		}
		System.out.println("backallLink : "+backallLink.size());
		
	}

}
