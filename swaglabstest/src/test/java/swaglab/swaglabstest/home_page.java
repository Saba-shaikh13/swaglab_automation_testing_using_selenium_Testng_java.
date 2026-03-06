package swaglab.swaglabstest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class home_page {
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
	void product_details()
	{
		driver.findElement(By.id("item_4_title_link")).click();
		driver.findElement(By.id("add-to-cart")).click();
		driver.findElement(By.id("remove")).click();
		driver.findElement(By.xpath("//*[@id=\"back-to-products\"]")).click();

	}
	
}
