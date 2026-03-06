package swaglab.swaglabstest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class product_filter {
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
void Name_A_to_Z()
{
	Select sel=new Select(driver.findElement(By.className("product_sort_container")));
	sel.selectByValue("az");
}
@Test(priority=4)
void Name_Z_to_A()
{
	Select sel=new Select(driver.findElement(By.className("product_sort_container")));
	sel.selectByValue("za");
}
@Test(priority=5)
void Price_low_high()
{
	Select sel=new Select(driver.findElement(By.className("product_sort_container")));
	sel.selectByValue("lohi");
}
@Test(priority=6)
void Price_high_low()
{
	Select sel=new Select(driver.findElement(By.className("product_sort_container")));
	sel.selectByValue("hilo");
}

}
