package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookDropDown {

	public static void main(String[] args) {
		 //Open Browser
		 WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("https://en-gb.facebook.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 
		 //Click on Create New Account Button
		 driver.findElement(By.xpath("//a [text() = 'Create New Account']")).click();
		 
		 //Enter the First Name
		 driver.findElement(By.xpath("//div [@class ='_5dbb'][1]/input")).sendKeys("Shanthini");
		 
		 //Enter Last Name
		 driver.findElement(By.xpath("(//div [@class ='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput'])[1]/input")).sendKeys("Guru");
		 
		 //Enter the mobile number
		 driver.findElement(By.xpath("//div [text() ='Mobile number or email address']/following-sibling::input")).sendKeys("9176908082");
		 
		 //Enter the password
		 driver.findElement(By.xpath("//div [text() ='New password']//following-sibling::input")).sendKeys("Password");
		 
		 //Handle all the three drop downs
		 WebElement elementDropdownDay = driver.findElement(By.xpath("//select [@id ='day']"));
		 Select ddDay = new Select(elementDropdownDay);
		 ddDay.selectByValue("26");
		 
		 WebElement elementDropdownMonth = driver.findElement(By.xpath("//select [@id ='month']"));
		 Select ddMonth = new Select(elementDropdownMonth);
		 ddMonth.selectByValue("11"); 

		 WebElement elementDropdownYear = driver.findElement(By.xpath("//select [@id ='year']"));
		 Select ddYear = new Select(elementDropdownYear);
		 ddYear.selectByValue("1986"); 
		 
		 //Select the radio button "Female" 
		 driver.findElement(By.xpath("//label [text() = 'Female']/following-sibling::input")).click();
		 
		 //Completed Statement
		 System.out.println("Facebook Assignment 1 Executed Successfully!");
		 
		 
	}

}
