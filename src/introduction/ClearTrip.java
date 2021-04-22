package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ClearTrip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");	
		WebDriver driver =new ChromeDriver();
		driver.get("http://www.cleartrip.com/");

		//clicking on radio button
		driver.findElement(By.id("RoundTrip")).click();
		
		//selecting number of persons from dropdown
		Select adults=new Select(driver.findElement(By.id("Adults")));
		adults.selectByVisibleText("4");
		
		//selecting child from dropdown
		Select child=new Select(driver.findElement(By.id("Childrens")));	
		child.selectByVisibleText("3");
		
		//clicking on link text
		driver.findElement(By.linkText("More options: Class of travel, Airline preference")).click();
		
		//selecting from drop down
		Select class6=new Select(driver.findElement(By.id("Class")));
		class6.selectByVisibleText("Premium Economy");
	    
		//handling allow and block alerts
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		//sending text in textbox
		driver.findElement(By.xpath("//*[@id='AirlineAutocomplete']")).sendKeys("indigo");
		
       //clicking on present date on calender
	   //driver.findElement(By.cssSelector("a[class*='ui-state-default ui-state-highlight']")).click();
		
		//maximising window
		driver.manage().window().maximize();
		
		//scrolling down the page
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)");
		
		
		//Create a instance of ChromeOptions class
		ChromeOptions options7 = new ChromeOptions();

		//Add chrome switch to disable notification - "**--disable-notifications**"
		options7.addArguments("--disable-notifications");
		
		

	}
}

