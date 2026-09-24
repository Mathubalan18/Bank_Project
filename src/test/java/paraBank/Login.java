package paraBank;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Login extends BaseTest {
	
	@Test
	public void LoginPage() throws Throwable{
		login();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains("Accounts Overview"));
		
		SoftAssert softAssert = new SoftAssert();
		softAssert.assertEquals(driver.getTitle().contains("Accounts Overview"), true);
		
		WebElement txt = driver.findElement(By.xpath("//p[@class='smallText']"));
		String text = txt.getText();
		System.out.println(text);
		
		softAssert.assertEquals(text.contains(fN+" "+lN), true);
		
		softAssert.assertAll();
	}
}