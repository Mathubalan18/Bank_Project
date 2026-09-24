package paraBank;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Registration extends BaseTest {
	
	public String userName = "aaxaar123";
	public String password = "axarpatel123";
	public String firstName = "Axar";
	public String lastName = "Patel";
	
	@Test
	public void registration() {
		
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.id("customer.firstName")).sendKeys(firstName);
		driver.findElement(By.id("customer.lastName")).sendKeys(lastName);
		driver.findElement(By.id("customer.address.street")).sendKeys("123 ABC nagar");
		driver.findElement(By.id("customer.address.city")).sendKeys("Chennai");
		driver.findElement(By.id("customer.address.state")).sendKeys("Tamil nadu");
		driver.findElement(By.id("customer.address.zipCode")).sendKeys("123456");
		driver.findElement(By.id("customer.phoneNumber")).sendKeys("1234567893");
		driver.findElement(By.id("customer.ssn")).sendKeys("123");
		driver.findElement(By.id("customer.username")).sendKeys(userName);
		driver.findElement(By.id("customer.password")).sendKeys(password);
		driver.findElement(By.id("repeatedPassword")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("Customer Created"));
		
		String title = driver.getTitle();
		Assert.assertEquals(title.contains("Customer Created"), true);
	}
}
