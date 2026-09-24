package paraBank;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdminPage extends BaseTest {
	
	@Test
	public void adminPage() {
		driver.findElement(By.linkText("Admin Page")).click();
		
		WebElement form = driver.findElement(By.id("rightPanel"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(form));
		
		driver.findElement(By.id("initialBalance")).sendKeys("520");
		driver.findElement(By.id("minimumBalance")).sendKeys("1200");
		
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		WebElement saved = driver.findElement(By.xpath("//b[text()='Settings saved successfully.']"));
		wait.until(ExpectedConditions.visibilityOf(saved));
		
		Assert.assertEquals(saved.getText().equals("Settings saved successfully."), true);
	}
}
