package TestSelenium.test;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TypeOfBrowser {
	
	protected static WebDriver driver = null;

	//select the browser in which you want to test
	//i haven't tested for internet explorer
	public static WebDriver chooseBrowser() {
		
		int numBrowser = 0;
		
		Scanner typeOfBrowser = new Scanner(System.in);
		System.out.println("Which browser you want to use ?");
		System.out.println("Chrome = 1");
		System.out.println("Mozilla Firefox = 2");
		System.out.println("Internet Explorer = 3");

		numBrowser = typeOfBrowser.nextInt();
		
		// Google Chrome Browser
		if (numBrowser == 1) {
			
			System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
		//Firefox Browser	
		} else if (numBrowser == 2) {
			
			System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		
		// Internet Explorer Browser
		} else if (numBrowser == 3) {
			
				System.setProperty("webdriver.ie.driver", ".\\drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
		
		}
		//the home screen setting in the selected browser
		driver.manage().window().maximize();
	    driver.get("http://www.google.com");
		
		return driver;
	}
}
