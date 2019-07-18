package com.interview.testiFrame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRadioButton {
	
	static WebDriver driver;
	static String testURL="http://demo.guru99.com/test/radio.html";

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(testURL);
		
		List<WebElement> rdBtn=(List<WebElement>)driver.findElements(By.xpath("//input[@type='radio']"));;
		System.out.println("The number of Radio Buttons in the page is: " +rdBtn.size());
		
		for(int i=0;i<rdBtn.size();i++)
		{
			rdBtn.get(i).click();
			Thread.sleep(3000);
		}
		

	}

}