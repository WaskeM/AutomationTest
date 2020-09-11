package TestSelenium.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

class test2 {

	@Test
	
	public void googleCheeseTest() throws InterruptedException {
				
		//start browser
		WebDriver driver = TypeOfBrowser.chooseBrowser(); 
	    Thread.sleep(2000);
	    
	    //enter word and search
	    GoogleCheese.searchGoogle(driver, "cheese");
	    Thread.sleep(2000);
	    
	    //GoogleCheese.getResult(driver);
	 
	    //checking the results
	     assertEquals("777", GoogleCheese.getResult(driver), "There is to much cheese on the Internet");

	}
}
