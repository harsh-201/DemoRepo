package introduction;

import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Class name=ChromeDriver,
		System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");	
		WebDriver driver =new ChromeDriver();
		/*driver.get("https://google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		//System.out.println(driver.getPageSource());
		
		//driver.get("https://yahoo.com");
		driver.navigate().back();
		driver.close();//closes the current browser
		driver.quit();//closes all browsers opened by selenium*/
		
		driver.get("https://www.spicejet.com/");
		//driver.findElement(By.id("email")).sendKeys("kumar.harshjeet18@gmail.com");
		//driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("kumar.harshjeet18@gmail.com");
		//driver.findElement(By.id("pass")).sendKeys("Winter@10");
		//driver.findElement(By.linkText("Forgotten password?")).click();
		//driver.findElement(By.name("login")).click();
		
		//driver.close();
		//driver.findElement(By.xpath("//*[@id='u_0_b']")).click();;
		//driver.findElement(By.xpath("//button[@name='login']")).click();
	//	driver.findElement(By.id("divpaxinfo")).click();
		//driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
		//driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		//driver.findElement(By.xpath("//*[@id='dropdownGroup1']/div/ul[1]/li[8]/a")).click();
		//driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_SeniorCitizenDiscount'")).click();
		//Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='ctl00_mainContent_chk_SeniorCitizenDiscount'")).isSelected() ;

		//driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		//driver.findElement(By.cssSelector(".ui-state-DEFAULT.ui-state-highlight.ui-state-active")).click();

	}

}
