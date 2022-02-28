package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumXpathClass {

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
		 
		 //Click on Create Lead 
		 WebElement elementCreateLead = driver.findElement(By.xpath("//a[text()='Create Lead']"));
		 elementCreateLead.click();
		 
		 //Enter Company Name
		 WebElement elementCompanyName = driver.findElement(By.xpath("//input[@id = 'createLeadForm_companyName']"));
		 elementCompanyName.sendKeys("L&T INFOTECH");
		 
		 //Enter First Name
		 WebElement elementFirstName = driver.findElement(By.xpath("//input[@id = 'createLeadForm_firstName']"));
		 elementFirstName.sendKeys("NISHA");
		 
		 //Enter Last Name
		 WebElement elementLastName = driver.findElement(By.xpath("//input[@id = 'createLeadForm_lastName']"));
		 elementLastName.sendKeys("GURU");
		 
		 //Enter Last Name(Local)
		 driver.findElement(By.xpath("//input[@id = 'createLeadForm_lastNameLocal']")).sendKeys("Prakash");
		 
		 //Enter Department Field
		 driver.findElement(By.xpath("//input[@id = 'createLeadForm_departmentName']")).sendKeys("IT");
		 
		 //Enter Description Field
		 driver.findElement(By.xpath("//textarea[@id = 'createLeadForm_description']")).sendKeys("Create Lead Assignment1");
		 
		 //Enter your email in the E-mail address Field
		 driver.findElement(By.xpath("//input[@id = 'createLeadForm_primaryEmail']")).sendKeys("shanthiniguru9@gmail.com");
		 
		 //Select State/Province as NewYork
		 WebElement elementDropDown = driver.findElement(By.xpath("//select[@id = 'createLeadForm_generalStateProvinceGeoId']"));
		 Select dd = new Select(elementDropDown);
		 dd.selectByValue("NY");
		 
		 
		 //Click on Create Lead Button
		 WebElement elementCreateLeadButton = driver.findElement(By.xpath("//input[@class = 'smallSubmit']"));
		 elementCreateLeadButton.click();
		 
		 //Get the Title of Resulting Page
		 System.out.println(driver.getTitle());

	}

}
