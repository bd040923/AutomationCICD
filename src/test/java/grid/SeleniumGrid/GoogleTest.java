package grid.SeleniumGrid;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class GoogleTest {
	
	@Test
	public void googleTest() throws MalformedURLException, URISyntaxException
	{
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setBrowserName("chrome");
	//	dc.setCapability(CapabilityType.BROWSER_NAME,"edge");
		WebDriver driver = new RemoteWebDriver(new URI("http://192.168.148.48:4444").toURL(), dc);
		
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.cssSelector("[title='Search']")).sendKeys("Bhushan Datey");
		
		System.out.println(driver.getTitle());

		
		
	}

}
