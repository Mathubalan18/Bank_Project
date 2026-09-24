package paraBank;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TransferTest extends BaseTest {
	
	@Test
	public void transfer() throws Throwable{
		login();
		
		driver.findElement(By.linkText("Transfer Funds")).click();
		
		WebElement transFund = driver.findElement(By.xpath("//h1[@class='title']//ancestor::div[@id='showForm']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(transFund));
		
		driver.findElement(By.id("amount")).sendKeys("100");
		WebElement toAcc = driver.findElement(By.id("toAccountId"));
		
		Select select = new Select(toAcc);
		select.selectByIndex(1);
		
		driver.findElement(By.xpath("//input[@value='Transfer']")).click();
		
		WebElement trnsCom = driver.findElement(By.xpath("//h1[@class='title']//ancestor::div[@id='showResult']"));
		wait.until(ExpectedConditions.visibilityOf(trnsCom));
		
		Assert.assertEquals(trnsCom.getText().contains("Transfer Complete"), true);
	}
}
