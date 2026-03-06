package swaglab.swaglabstest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class cart_continuee_shopping {
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
	@Test(priority=2)
	void login()
	{
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click(); 
	}
	@Test(priority=3)
	void cart() {
		driver.findElement(By.className("shopping_cart_link")).click();

	}
	@Test(priority=4)
	void continue_shoping()
	{
		driver.findElement(By.id("continue-shopping")).click();
	
	}
}
