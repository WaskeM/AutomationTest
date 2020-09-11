package TestSelenium.test;


import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShoot {
	
	//making screenshots
	public static void captureScreenshoot(WebDriver driver,String screenshotName) {
		
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			
			//image location
			FileUtils.copyFile(source, new File("C:\\Users\\vaske\\Desktop\\testScreenshots/" + screenshotName + ".png"));
				
			System.out.println("Screenshot taken");

		}
		catch(Exception e) {
			
			System.out.println("Screenshot failed");
		}
		
	}
	
	// I didn't implement to take a screenshot if the test failed, but this is some idea to do it
	/*
	public void takeScreenShotOnFailure(ITestResult testResult) throws IOException {
        if (testResult.getStatus() == ITestResult.FAILURE) {
            System.out.println(testResult.getStatus());
            
            try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File source = ts.getScreenshotAs(OutputType.FILE);
			
			//image location
			FileUtils.copyFile(source, new File("C:\\Users\\vaske\\Desktop\\testScreenshots/" + screenshotName + ".png"));
				
			System.out.println("Screenshot taken");

		}
		catch(Exception e) {
			
			System.out.println("Screenshot failed");
		}
       }        
    }
    */
	
	
	
}
