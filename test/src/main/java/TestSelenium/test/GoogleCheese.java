package TestSelenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleCheese {
	
	//mark google input and type a word
	public static void searchGoogle(WebDriver driver, String word){
		
		driver.findElement(By.name("q")).sendKeys(word, Keys.ENTER);
	}

	//search result of the entered word
	public static String getResult(WebDriver driver) {
		
		// result: "Око 678.000.000 резултата"
		String searchResult = driver.findElement(By.id("result-stats")).getText();
	    // we need to divide String into parts
	    String segments[] = searchResult.split(" ");
	    // we need 2nd part of segment
	    String numberOfSearch = segments[1];
	    //int numOfSearch=Integer.parseInt(numberOfSearch);  

	    System.out.println(numberOfSearch);
	    
	    return numberOfSearch;
	}
}
