package paraBank;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ScreenshotListener implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		
		BaseTest bt = (BaseTest)result.getInstance();
		
		TakesScreenshot ts = (TakesScreenshot) bt.driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("./src/test/resources/screenShots/"+result.getName()+"_"+System.currentTimeMillis()+".png");

		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
