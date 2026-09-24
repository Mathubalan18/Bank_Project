package paraBank;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UpdateContact extends BaseTest{
	
	@Test
	public void update() throws IOException {
		login();
		
		driver.findElement(By.linkText("Update Contact Info")).click();
		WebElement updatePro = driver.findElement(By.xpath("//h1[text()='Update Profile']"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(updatePro));
		
		driver.findElement(By.id("customer.address.street")).sendKeys("1432 Main St");
		driver.findElement(By.id("customer.address.city")).sendKeys("Beverly Hills");
		driver.findElement(By.id("customer.address.state")).sendKeys("CA");
		
		driver.findElement(By.xpath("//input[@value='Update Profile']")).click();
		
		WebElement updated = driver.findElement(By.xpath("//h1[text()='Profile Updated']"));
		
		wait.until(ExpectedConditions.visibilityOf(updated));
		
		Assert.assertEquals(updated.getText().equals("Profile Updated"), true);
	}
}
