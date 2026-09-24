package paraBank;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RequestLoan extends BaseTest{
	
	@Test
	public void requestLoanTest() throws Throwable {
		login();
		
		driver.findElement(By.linkText("Request Loan")).click();
		WebElement loanForm = driver.findElement(By.id("requestLoanForm"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(loanForm));
		
		driver.findElement(By.id("amount")).sendKeys("1000");
		driver.findElement(By.id("downPayment")).sendKeys("100");
		
		driver.findElement(By.xpath("//input[@value='Apply Now']")).click();
		
		WebElement loanPro = driver.findElement(By.id("requestLoanResult"));
		wait.until(ExpectedConditions.visibilityOf(loanPro));
		
		String status = driver.findElement(By.id("loanStatus")).getText();
		
		SoftAssert assert1 = new SoftAssert();
		assert1.assertEquals(status.equals("Approved"), true);
	}
}
