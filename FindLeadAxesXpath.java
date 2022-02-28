package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindLeadAxesXpath {

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
		 
		 //Click on Leads
		 WebElement elementLeads = driver.findElement(By.xpath("//a[text()='Leads']"));
		 elementLeads.click();
		 
		//Click on Find Leads
		 WebElement elementFindLead = driver.findElement(By.xpath("//a[text()='Find Leads']"));
		 elementFindLead.click();
		 
		 //Enter Text in First Name identified through First Name Label through the text box
		 driver.findElement(By.xpath("(//label [text() = 'First name:']/following::input)[29]")).sendKeys("Test");
		 
		 //Click on Find Leads Button
		 driver.findElement(By.xpath("//button [text() = 'Find Leads']")).click();
		 
		 //Click on the First available Lead in the table
		 driver.findElement(By.xpath("( //div [@class = 'x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		 
		 //Click on Edit Button
		 driver.findElement(By.xpath("(//a [text() ='Qualify Lead']/following-sibling::a)[1]")).click();
		 	
		 //Clear the Company Name
		 driver.findElement(By.xpath("(//span [text() ='Company Name']/following::input)[1]")).clear();
		 		 
		 //Enter the new Company Name
		 String str = "ZOHO";
		 driver.findElement(By.xpath("(//span [text() ='Company Name']/following::input)[1]")).sendKeys(str);
		 
		 //Click on Update Button
		 driver.findElement(By.xpath("(//input [@class = 'smallSubmit'])[1]")).click();
		 
		 //Get text from the Company Name
		 String companyName = driver.findElement(By.xpath("(//span [text() = 'Company Name']/following::span)[1]")).getText();
		 System.out.println(companyName);
		 System.out.println(str);
		 
			
			  if (companyName.contains(str) == true) {
			  System.out.println(" Given Company name matches with the Company Name in the View Lead : " +companyName);
			  
			  }		 
		 
		 
	}

}
