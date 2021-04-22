package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExclusiveXpaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");	
		WebDriver driver =new ChromeDriver();
		driver.get("https://facebook.com");
		driver.findElement(By.cssSelector("//input[name='email'])")).sendKeys("kumar.hatah");
		driver.findElement(By.cssSelector("//input[type='password']")).sendKeys("abvfhh");
		driver.findElement(By.cssSelector("//button[type='submit']")).click();

	}

}
