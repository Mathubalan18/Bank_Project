package paraBank;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Products extends BaseTest{
	@Test
	public void productTest() {
		driver.findElement(By.linkText("Products")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.urlContains("products"));
		
		Assert.assertEquals(driver.getTitle().contains("Parasoft"), true);
	}
}
