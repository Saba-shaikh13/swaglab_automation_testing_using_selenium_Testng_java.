package swaglab.swaglabstest;

import java.time.Duration;

import org.openqa.selenium.edge.EdgeDriver;

public class demo {
	
	void launch()
	{
		System.setProperty("webdriver.edge.driver","C:\\Users\\SK Laptop Town\\sabacorejava\\swaglabstest\\DriverResources\\msedgedriver.exe");
		EdgeDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
	}
	public static void main(String[] args) {
		demo obj=new demo();
		obj.launch();
	}
}
