package paraBank;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePage extends BaseTest {
	
	@Test
	public void verifyHomePage() {
		driver.findElement(By.linkText("home")).click();
		
		Assert.assertEquals(driver.getTitle().contains("Welcome"), true);
	}
}
