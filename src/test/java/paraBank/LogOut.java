package paraBank;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogOut extends BaseTest{
	
	@Test
	public void logOutLink() throws Throwable {
		login();
		
		driver.findElement(By.linkText("Log Out")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("Welcome"));
		
		String text = driver.findElement(By.xpath("//h2[text()='Customer Login']")).getText();
		
		Assert.assertEquals(text.equals("Customer Login"), true);
	}
}
