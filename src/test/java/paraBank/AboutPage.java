package paraBank;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AboutPage extends BaseTest{
	
	@Test
	public void verifyAboutPage() {
		driver.findElement(By.linkText("about")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("About Us"));
		
		Assert.assertEquals(driver.getTitle().contains("About Us"), true);
		
		String text = driver.findElement(By.xpath("//h1[text()='ParaSoft Demo Website']//ancestor::div[@id='rightPanel']")).getText();
		Assert.assertEquals(text.contains("ParaSoft Demo Website"), true);
	}
}
