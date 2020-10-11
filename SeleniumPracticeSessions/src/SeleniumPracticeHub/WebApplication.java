package SeleniumPracticeHub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class WebApplication {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pavan\\git\\SeleniumPracticeSessions\\SeleniumPracticeSessions\\Library Files\\Chrome Driver\\chromedriverV85.exe");
		
		
		//Set Variables
		String BaseURL = "H:\\SQA-Professional Certificate Course\\Practical\\20-09-2020_Practical\\Selenium Web Controllers.html";
		
		//Define Logic and Objects
		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.manage().window().maximize();
		chromeDriver.get(BaseURL);
		
		//Radio Button
		WebElement radioButtonOption1 = chromeDriver.findElement(By.id("vfb-7-1"));
		WebElement radioButtonOption2 = chromeDriver.findElement(By.id("vfb-7-2"));
		WebElement radioButtonOption3 = chromeDriver.findElement(By.id("vfb-7-3"));
		
		radioButtonOption1.click();
		
		if(radioButtonOption1.isSelected())
		{
			System.out.println("Radio Button Option 1 is selected");
			System.out.println("Radio Button Option 1 Status is -  "+radioButtonOption1.isSelected());
		}
		else
		{
			System.out.println("Another Option is selected");
		}
		
		
		Thread.sleep(5000);
		//Lock.class.wait();
		
		//Check Box
		WebElement checkBox1 = chromeDriver.findElement(By.id("vfb-6-0"));
		WebElement checkBox2 = chromeDriver.findElement(By.id("vfb-6-1"));
		WebElement checkBox3 = chromeDriver.findElement(By.id("vfb-6-2"));
				
		checkBox2.click();

		if(checkBox2.isSelected())
		{
			System.out.println("Check Box 2 is selected");
			System.out.println("Check Box 2 Status is -  "+checkBox2.isSelected());
		}
		else
		{
			System.out.println("Another Option is selected");
		}
		
		
		Thread.sleep(5000);
		
		
		//Combo Box
		Select fruits = new Select(chromeDriver.findElement(By.id("fruits")));
		fruits.selectByVisibleText("Banana");
		System.out.println("By Visible Text - Banana");
		
		fruits.selectByIndex(2);
		System.out.println("By Index - Orange");
		
		
		Thread.sleep(5000);
		
		
		//Dropdown List
		Select country = new Select(chromeDriver.findElement(By.name("country")));
		country.selectByVisibleText("ALBANIA");
		
		System.out.println("Country ALBANIA has been selected");
		
		
		Thread.sleep(5000);
		
		
		//Button
		WebElement Button = chromeDriver.findElement(By.name("submit"));
		Button.click();
		System.out.println("Submit button has been selected");
		
		
		Thread.sleep(5000);
		
		
		//Text Box
		WebElement TextBox = chromeDriver.findElement(By.name("userName"));
		TextBox.sendKeys("Sample Text Added");
		
		
		Thread.sleep(5000);
		
		
		//Link URL and Hyper Link
		chromeDriver.findElement(By.linkText("your destination")).click();
		
		Thread.sleep(5000);
		
		//Browser back command
		chromeDriver.navigate().back();

	}

}
