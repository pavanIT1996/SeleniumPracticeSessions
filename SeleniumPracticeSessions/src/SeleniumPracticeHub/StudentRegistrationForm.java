package SeleniumPracticeHub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StudentRegistrationForm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pavan\\git\\SeleniumPracticeSessions\\SeleniumPracticeSessions\\Library Files\\Chrome Driver\\chromedriverV85.exe");
		

		//Set Variables
		String BaseURL = "H:\\SQA-Professional Certificate Course\\Practical\\04-10-2020_Practical\\SQAB16 Practical.html";
		
		//Define Logic and Objects
		WebDriver chromeDriver = new ChromeDriver();
		chromeDriver.manage().window().maximize();
		chromeDriver.get(BaseURL);
		
		WebElement FirstName_Text=chromeDriver.findElement(By.name("First_Name"));
		WebElement LastName_Text=chromeDriver.findElement(By.name("Last_Name"));
		
		Select Day_drop=new Select (chromeDriver.findElement(By.id("Birthday_Day")));
		Select Month_drop=new Select (chromeDriver.findElement(By.id("Birthday_Month")));
		Select Year_drop=new Select (chromeDriver.findElement(By.id("Birthday_Year")));
		
		WebElement Email_Text=chromeDriver.findElement(By.name("Email_Id"));
		WebElement Mobile_Text=chromeDriver.findElement(By.name("Mobile_Number"));
		
		WebElement Male_Radio=chromeDriver.findElement(By.xpath("/html/body/table/tbody/tr[6]/td[2]/input[1]"));
		WebElement Female_Radio=chromeDriver.findElement(By.xpath("/html/body/table/tbody/tr[6]/td[2]/input[2]"));
		
		WebElement Address_Text=chromeDriver.findElement(By.name("Address"));
		WebElement City_Text=chromeDriver.findElement(By.name("City"));
		WebElement Pin_Text=chromeDriver.findElement(By.name("Pin_Code"));
		WebElement State_Text=chromeDriver.findElement(By.name("State"));
		WebElement Country_Text=chromeDriver.findElement(By.name("Country"));
		
		WebElement Drawing_Check=chromeDriver.findElement(By.name("Hobby_Drawing"));
		WebElement Singing_Check=chromeDriver.findElement(By.name("Hobby_Singing"));
		WebElement Dancing_Check=chromeDriver.findElement(By.name("Hobby_Dancing"));
		WebElement Sketching_Check=chromeDriver.findElement(By.name("Hobby_Cooking"));
		WebElement Others_Check=chromeDriver.findElement(By.name("Hobby_Other"));
		WebElement Others_Text=chromeDriver.findElement(By.name("Other_Hobby"));
		
		WebElement ClassX_Board_Text=chromeDriver.findElement(By.name("ClassX_Board"));
		WebElement ClassX_Perc_Text=chromeDriver.findElement(By.name("ClassX_Percentage"));
		WebElement ClassX_Year_Text=chromeDriver.findElement(By.name("ClassX_YrOfPassing"));
		
		WebElement ClassXII_Board_Text=chromeDriver.findElement(By.name("ClassXII_Board"));
		WebElement ClassXII_Perc_Text=chromeDriver.findElement(By.name("ClassXII_Percentage"));
		WebElement ClassXII_Year_Text=chromeDriver.findElement(By.name("ClassXII_YrOfPassing"));
		
		WebElement Graduation_Board_Text=chromeDriver.findElement(By.name("Graduation_Board"));
		WebElement Graduation_Perc_Text=chromeDriver.findElement(By.name("Graduation_Percentage"));
		WebElement Graduation_Year_Text=chromeDriver.findElement(By.name("Graduation_YrOfPassing"));
		
		WebElement Masters_Board_Text=chromeDriver.findElement(By.name("Masters_Board"));
		WebElement Masters_Perc_Text=chromeDriver.findElement(By.name("Masters_Percentage"));
		WebElement Masters_Year_Text=chromeDriver.findElement(By.name("Masters_YrOfPassing"));
		
		WebElement BCA_Radio=chromeDriver.findElement(By.name("Course_BCA"));
		WebElement BCom_Radio=chromeDriver.findElement(By.name("Course_BCom"));
		WebElement BSc_Radio=chromeDriver.findElement(By.name("Course_BSc"));
		WebElement BA_Radio=chromeDriver.findElement(By.name("Course_BA"));
		
		WebElement Submit_Button=chromeDriver.findElement(By.xpath("/html/body/table/tbody/tr[15]/td/input[1]"));
		WebElement Reset_Button=chromeDriver.findElement(By.xpath("/html/body/table/tbody/tr[15]/td/input[2]"));
		
		
		FirstName_Text.sendKeys("Pavan");
		Thread.sleep(5000);
		
		LastName_Text.sendKeys("Chamantha");
		Thread.sleep(5000);
		
		Day_drop.selectByValue("3");
		Thread.sleep(5000);
		
		Month_drop.selectByValue("January");
		Thread.sleep(5000);
		
		Year_drop.selectByValue("1996");
		Thread.sleep(5000);
		
		Email_Text.sendKeys("test@gmail.com");
		Thread.sleep(5000);
		
		Mobile_Text.sendKeys("0123456789");
		Thread.sleep(5000);
		
		Male_Radio.click();
		Thread.sleep(5000);
	
		Female_Radio.click();
		Thread.sleep(5000);

		Address_Text.sendKeys("123,Test route,Test City");
		Thread.sleep(5000);
		
		City_Text.sendKeys("Test City");
		Thread.sleep(5000);
		
		Pin_Text.sendKeys("1234567");
		Thread.sleep(5000);
		
		State_Text.sendKeys("Test_State");
		Thread.sleep(5000);
		
		Country_Text.sendKeys("Test Country");
		Thread.sleep(5000);
		
		Drawing_Check.click();
		Thread.sleep(5000);
		
		Singing_Check.click();
		Thread.sleep(5000);
		
		Dancing_Check.click();
		Thread.sleep(5000);
		
		Sketching_Check.click();
		Thread.sleep(5000);
		
		Others_Check.click();
		Thread.sleep(5000);
		
		Others_Text.sendKeys("Others Hobbies");
		Thread.sleep(5000);
		
		ClassX_Board_Text.sendKeys("Test_ClassXBoard");
		Thread.sleep(5000);
		ClassX_Perc_Text.sendKeys("40");
		Thread.sleep(5000);
		ClassX_Year_Text.sendKeys("2011");
		Thread.sleep(5000);
		
		ClassXII_Board_Text.sendKeys("Test_ClassXIIBoard");
		Thread.sleep(5000);
		ClassXII_Perc_Text.sendKeys("50");
		Thread.sleep(5000);
		ClassXII_Year_Text.sendKeys("2012");
		Thread.sleep(5000);
		
		Graduation_Board_Text.sendKeys("Test_GraduationBoard");
		Thread.sleep(5000);
		Graduation_Perc_Text.sendKeys("60");
		Thread.sleep(5000);
		Graduation_Year_Text.sendKeys("2013");
		Thread.sleep(5000);
		
		Masters_Board_Text.sendKeys("Test_MastersBoard");
		Thread.sleep(5000);
		Masters_Perc_Text.sendKeys("70");
		Thread.sleep(5000);
		Masters_Year_Text.sendKeys("2014");
		Thread.sleep(5000);
		
		BCA_Radio.click();
		Thread.sleep(5000);
		BCom_Radio.click();
		Thread.sleep(5000);
		BSc_Radio.click();
		Thread.sleep(5000);
		BA_Radio.click();
		Thread.sleep(5000);
		
		Submit_Button.click();
		Thread.sleep(5000);
		Reset_Button.click();
		Thread.sleep(5000);
		
	}

}
