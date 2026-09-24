package paraBank;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AccountTest extends BaseTest {
	
	@Test
	public void Account() throws Throwable {
		login();
		
		driver.findElement(By.xpath("//a[text()='Open New Account']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("Open Account"));
		
		WebElement accType = driver.findElement(By.id("type"));
		Select select = new Select(accType);
		select.selectByContainsVisibleText("SAVINGS");
		
		WebElement aNumber = driver.findElement(By.id("fromAccountId"));
		Select select2 = new Select(aNumber);
		select2.selectByIndex(0);
		
		driver.findElement(By.xpath("//input[@value='Open New Account']")).click();
		
		WebElement accOpen = driver.findElement(By.xpath("//h1[text()='Account Opened!']"));
		
		wait.until(ExpectedConditions.visibilityOf(accOpen));
		
		WebElement accNo = driver.findElement(By.id("newAccountId"));
		String accNumber = accNo.getText();
		System.out.println(accNumber.length());
		
		driver.findElement(By.linkText("Accounts Overview")).click();
		
		WebElement element = driver.findElement(By.xpath("//h1[@class='title']//ancestor::div[@id='showOverview']"));
		wait.until(ExpectedConditions.visibilityOf(element));
		
		WebElement tableNumber = driver.findElement(By.xpath("//a[text()='"+accNumber+"']"));
		String tabNum = tableNumber.getText();
		System.out.println(tabNum.length());
		
		SoftAssert assert1 = new SoftAssert();
		assert1.assertEquals(tabNum.equals(accNumber), true);
		
		assert1.assertAll();
	}
}
