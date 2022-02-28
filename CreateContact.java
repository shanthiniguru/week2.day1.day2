package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		//Open Browser
		 WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://leaftaps.com/opentaps/control/main");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		 //Enter User name
		 WebElement elementUsername = driver.findElement(By.xpath("//input[@class = 'inputLogin']"));
		 elementUsername.sendKeys("Demosalesmanager");
		 
		 //Enter Password
		 WebElement elementPassword = driver.findElement(By.xpath("//input[@name = 'PASSWORD']"));
		 elementPassword.sendKeys("crmsfa");
		 
		 //Click on Login Button
		 WebElement elementLoginButton = driver.findElement(By.xpath("//input[@class = 'decorativeSubmit']"));
		 elementLoginButton.click();
		 
		 //Click on CRMSFA
		 WebElement elementCRMSFA = driver.findElement(By.xpath("(//a[contains(@href , 'crmsfa')])[2]"));
		// WebElement elementCRMSFA = driver.findElement(By.xpath("(//a[contains(text(),'CRM/SFA')]"));
		 elementCRMSFA.click();
		 
		 //Click on Contacts button
		 driver.findElement(By.xpath("//a [text() = 'Contacts']")).click();
		 
		 //Click on Create Contact
		 driver.findElement(By.xpath("//a [text() = 'Create Contact']")).click();
		 
		 //Enter FirstName Field Using id Locator
		 driver.findElement(By.id("firstNameField")).sendKeys("Shanthini");
		 
		 //Enter LastName Field Using id Locator
		 driver.findElement(By.id("lastNameField")).sendKeys("Prakash");
		 
		 //Enter FirstName(Local) Field Using id Locator
		 driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Shanthu");
		 
		 //Enter LastName(Local) Field Using id Locator
		 driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Praky");
		 
		 //Enter Department Field Using any Locator of Your Choice
		 driver.findElement(By.xpath("//input [@id = 'createContactForm_departmentName']")).sendKeys("IT");
		 
		 //Enter Description Field Using any Locator of your choice 
		 driver.findElement(By.xpath("//textarea [@id = 'createContactForm_description']")).sendKeys("TEST");
		 
		 //Enter your email in the E-mail address Field using the locator of your choice
		 driver.findElement(By.xpath("//input [@id = 'createContactForm_primaryEmail']")).sendKeys("shanthiniguru9@gmail.com");
		 
		 //Select State/Province as NewYork
		 WebElement elementDropDown = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		 Select dd = new Select(elementDropDown);
		 dd.selectByVisibleText("New York");
		 
		 //Click on Create Contact
		 driver.findElement(By.xpath("//input [@class = 'smallSubmit']")).click();
		 
		 //Click on edit button 
		 driver.findElement(By.xpath("//a [text() = 'Edit']")).click();
		 
		 //Clear the Description Field using .clear
		 driver.findElement(By.xpath("//textarea [@id = 'updateContactForm_description']")).clear();
		 
		 //Fill ImportantNote Field with Any text
		 driver.findElement(By.xpath("//textarea [@id = 'updateContactForm_importantNote']")).sendKeys("Important Text");
		 
		 //Click on update button using Xpath locator
		 driver.findElement(By.xpath("(//input [@class = 'smallSubmit'])[1]")).click();
		 
		 //Get the Title of Resulting Page.
		 System.out.println(driver.getTitle());
		 

	}

}
