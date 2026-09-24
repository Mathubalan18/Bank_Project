package paraBank;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactUs extends BaseTest{
	@Test
	public void contactPage() {
		driver.findElement(By.linkText("contact")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("Customer Care"));
		
		driver.findElement(By.id("name")).sendKeys(fN+"");
		driver.findElement(By.id("email")).sendKeys("dummy@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("1234567890");
		driver.findElement(By.id("message")).sendKeys("Hi This is for checking");
		
		driver.findElement(By.xpath("//input[@value='Send to Customer Care']")).click();
		
		WebElement CustCare = driver.findElement(By.xpath("//h1[text()='Customer Care']"));
		wait.until(ExpectedConditions.visibilityOf(CustCare));
		
		String text = driver.findElement(By.xpath("//p[text()='A Customer Care Representative will be contacting you.']")).getText();
		
		Assert.assertEquals(text.equals("A Customer Care Representative will be contacting you."), true);
		
	}
}
