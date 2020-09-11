package TestSelenium.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRM {
	
	//filling in the field first name
	public static void setFirstName(WebDriver driver, String name) {
		driver.findElement(By.id("addCandidate_firstName")).sendKeys(name);
	}
	
	//filling in the field last name with currentDate
	public static void setLastName(WebDriver driver, String name) {
		
		driver.findElement(By.id("addCandidate_lastName")).sendKeys(name);
	}
	
	//filling in the field email
	public static void setEmail(WebDriver driver, String email) {
		
		driver.findElement(By.id("addCandidate_email")).sendKeys(email);	
	}
	
	// we could also implement functions to take each element or click on anybuton
	/*
	 
	 */
}
