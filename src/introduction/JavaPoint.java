package introduction;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class JavaPoint {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");	
		WebDriver driver =new ChromeDriver();
		   driver.get("https://www.testandquiz.com/selenium/testing.html");
		   
		   //clicking on link texts(hyperlink)
		   driver.findElement(By.linkText("This is a link")).click();
		   driver.navigate().back();
		   
		   //maximising window
		   driver.manage().window().maximize();
		   
		   //sending value in text fields
		   driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("my learning process");
		   
		  //Counting the number of checkboxes 
		   List<WebElement> elements = driver.findElements(By.xpath("//input[@type='checkbox']"));
		   System.out.println(elements.size());
		   //clicking on the checkboxes
		   driver.findElement(By.xpath("//input[@class='Performance']")).click();
		  
		   //Radio buttons counting and clicking
		   driver.findElement(By.xpath("//input[@id='male']")).click();
		   List <WebElement> f=driver.findElements(By.cssSelector("input[type='radio']"));
		   System.out.println(f.size());
		   
		   //handling static dropdown
		   Select s=new Select(driver.findElement(By.id("testingDropdown")));
		   s.selectByVisibleText("Manual Testing");
		   
		   //clicking on alert box
		   driver.findElement(By.xpath("/html/body/div/div[11]/div/p/button")).click();
		   driver.switchTo().alert().accept();
		   
		   //handling double click
		   Actions action=new Actions(driver);
		   action.moveToElement(driver.findElement(By.id("dblClkBtn"))).doubleClick().build().perform();
		   driver.switchTo().alert().accept();
		   
		

	}

}
