package swaglab.swaglabstest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class login_page {
	EdgeDriver driver;
	@Test (priority=1)
	void launch()
	{
		System.setProperty("webdriver.edge.driver","C:\\Users\\SK Laptop Town\\sabacorejava\\swaglabstest\\DriverResources\\msedgedriver.exe");
		 driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
//	@Test(priority=2)
//	void login()
//	{
//		driver.findElement(By.id("user-name")).sendKeys("@#$");
//		driver.findElement(By.id("password")).sendKeys("$%#");
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click(); 	
//	}
//	@Test(priority=2)
//	void login_1()
//	{
//		driver.findElement(By.id("user-name")).sendKeys("");
//		driver.findElement(By.id("password")).sendKeys("secret_sauce");
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click(); 
//		 	
//	}
//	@Test(priority=2)
//	void login_2()
//	{
//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		driver.findElement(By.id("password")).sendKeys("");
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click(); 
//		 	
//	}
	@Test(priority=2)
	void loginbutton()
	{
		Actions act=new Actions(driver);
		WebElement login= driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		act.moveToElement(login).build().perform();
		
	}
}
