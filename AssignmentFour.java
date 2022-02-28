package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssignmentFour {

	public static void main(String[] args) throws InterruptedException {
		//Open Browser
		 WebDriverManager.chromedriver().setup(); 
		 ChromeDriver driver=new ChromeDriver(); 
		 driver.get("http://testleaf.herokuapp.com/");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 //Get the Title
		 System.out.println("The title is : " +driver.getTitle());
		 
		 //Get the URL
		 System.out.println("The URL is : " +driver.getCurrentUrl());
		 
		 //Get the Source Code
		 System.out.println("The Source code is : " +driver.getPageSource());
		 
		 //Get the Attribute value of "Get default text entered
		 driver.findElement(By.xpath("//h5 [text() = 'Edit']")).click();
		 System.out.println(driver.findElement(By.xpath("(//input [@name = 'username'])[1]")).getAttribute("value"));
		 
		//Get URL
		 driver.get("http://testleaf.herokuapp.com/");
		 
		//Get Link name
		 driver.findElement(By.xpath("//h5 [text() = 'HyperLink']")).click();
		 System.out.println(driver.findElement(By.xpath("//a [text() = 'Find where am supposed to go without clicking me?']")).getAttribute("href"));
	
		//Get URL
		 driver.get("http://testleaf.herokuapp.com/pages/Button.html");
		 
		//Get Text of the Button
		WebElement buttonColor = driver.findElement(By.xpath("//button [@id = 'color']"));
		String text = buttonColor.getText();
		System.out.println("The Text inside the Button is : " +text);
		
		//Get Color of the Button
		String text1 = buttonColor.getCssValue("background-color");
		System.out.println("The button color is : " +text1);
		
		//Get Location of the Button
		int location = buttonColor.getLocation().getX();
		System.out.println("The button location is : " +location);
		
		//Get Dimension of the Button
		Dimension size = buttonColor.getSize();
		System.out.println("The button location is : " +size);
		
		//Get Tag Name of the Button
		WebElement button = driver.findElement(By.id("color"));
		String tagName = button.getTagName();
		System.out.println("The button tagName is : " +tagName);
		
		//Is Displayed
		boolean displayed = button.isDisplayed();
		if (displayed == true) {
		System.out.println("The button is Displayed");
		}else
			System.out.println("The button is not Displayed");
		
		//Get URL
		 driver.get("http://testleaf.herokuapp.com/pages/Edit.html");
		 
		//Is Enabled
		WebElement textInput = driver.findElement(By.xpath("(//input [@name = 'username'])[2]"));
		boolean textbox = textInput.isEnabled();
		if (textbox == true) {
			System.out.println("The button is Enabled");
			}else
				System.out.println("The button is not Enabled");
		
		//IS Enable - not Enabled TExt Box Eg
		WebElement textInput1 = driver.findElement(By.xpath("//label [text() = 'Confirm that edit field is disabled']/following-sibling::input"));
		boolean textbox1 = textInput1.isEnabled();
		if (textbox1 == true) {
			System.out.println("The button is Enabled");
			}else
				System.out.println("The button is not Enabled");
		
		//Get URL
		 driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
		 
		 //Is Selected / Checked or not - Not Selected Example
		 WebElement checkBox = driver.findElement(By.xpath("(//label [text() = 'Select the languages that you know?']/following-sibling::input)[1]"));
			boolean checkBoxSelected = checkBox.isSelected();
			if (checkBoxSelected == true) {
				System.out.println("The Check Box is Selected");
				}else
					System.out.println("The Check Box is Not Selected");
			
			//Is Selected / Checked or not - Selected Example
			 WebElement checkBox1 = driver.findElement(By.xpath("(//label [text() = 'Confirm Selenium is checked']/following-sibling::input)[1]"));
				boolean checkBoxSelected1 = checkBox1.isSelected();
				if (checkBoxSelected1 == true) {
					System.out.println("The Check Box is Selected");
					}else
						System.out.println("The Check Box is Not Selected");
	
				 Thread.sleep(2000);
				 //Close the Browser
				 driver.close();

	}

}
