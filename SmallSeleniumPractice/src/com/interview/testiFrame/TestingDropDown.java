package com.interview.testiFrame;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestingDropDown {
	
	public static WebDriver driver;
	static String testURL = "http://demo.guru99.com/insurance/v1/register.php";
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(testURL);

		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		System.out.println(testURL+" opened successfully");
		WebElement drpdown = driver.findElement(By.xpath("//select[@id='user_occupation_id']"));
		Select s = new Select(drpdown);
		
		s.selectByVisibleText("Librarian");
		
		Thread.sleep(5000);
		
		List<WebElement> selectOptions = s.getOptions();
		
		for(int i=0;i<selectOptions.size();i++)
		{
			System.out.println(selectOptions.get(i).getText());
			
			if(selectOptions.get(i).getText().equalsIgnoreCase("Doctor"))
			{
				s.selectByVisibleText("Doctor");
			}
		}
		
		
		

	}

}
