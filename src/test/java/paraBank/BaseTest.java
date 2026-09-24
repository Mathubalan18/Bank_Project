package paraBank;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(ScreenshotListener.class)
public class BaseTest {
	public WebDriver driver;
	
	public String name;
	public String pass;
	public String fN;
	public String lN;
	
	@BeforeMethod
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://parabank.parasoft.com/parabank/index.htm?utm_source=chatgpt.com");
	}
	
	public void login() throws IOException{
		FileInputStream stream = new FileInputStream("./src/test/resources/data.properties");
		Properties properties = new Properties();
		properties.load(stream);
		
		name = properties.getProperty("name");
		pass = properties.getProperty("password");
		fN = properties.getProperty("firstName");
		lN = properties.getProperty("lastName");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(name);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@value='Log In']")).click();
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}
}
