package grid.SeleniumGrid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DummyTest {
	
	

	@Test
	public void googleTest() 
	{
		System.setProperty("webdriver.edge.driver","C:\\Users\\datey\\Desktop\\Grid\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();


		driver.get("https://rahulshettyacademy.com/");
		driver.manage().window().maximize();

		System.out.println(driver.getTitle());

		driver.close();


}}
