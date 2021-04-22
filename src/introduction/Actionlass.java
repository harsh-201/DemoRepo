package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionlass {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");	
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		Actions a =new Actions(driver);
		a.moveToElement(driver.findElement(By.linkText("ADD-ONS"))).build().perform();
		 

	}

}
