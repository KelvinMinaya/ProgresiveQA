package basePackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import pagesPackage.ProductsPage;

public class BaseClass {
	
	public static WebDriver driver;//needs to be static to contain session. driver is the container
	public ProductsPage productsPage;
	
	
	@BeforeMethod

	public void setUp () {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Beloved\\eclipse-workspace\\JavaSeleniumPractice\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.progressive.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	}
	
	@AfterMethod
	public void quittingBrowser() {
		driver.quit();
	}

}
