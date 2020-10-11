package SeleniumPracticeHub;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CallingBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pavan\\SeleniumPractice\\SeleniumPracticeSessions\\Library Files\\Chrome Driver\\chromedriverV85.exe");
		
		//Object writing
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Initialize variables and default values
		String baseurl="https://www.cse.lk/";
		String expectedTitle="CSE - Colombo Stock Exchange";
		String actualTitle="";
		
		//Called the url from driver
		driver.get(baseurl);
		
		//store the actual title of the web page
		actualTitle=driver.getTitle();
		
		
		//Check whether actual and expected titles are equal
		if (actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Test Passed");
		}
		
		else {
			System.out.println("Test failed");
		}
		
		//driver.close();

	}

}
