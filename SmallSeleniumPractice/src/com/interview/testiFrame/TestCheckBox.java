package com.interview.testiFrame;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCheckBox {
	
	static WebDriver driver;
	static String testURL="http://demo.guru99.com/test/radio.html";

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(testURL);
		
		List<WebElement> chkBx=(List<WebElement>)driver.findElements(By.xpath("//input[@type='checkbox']"));;
		System.out.println("The number of checkbox elements in the page is: " +chkBx.size());
		
		for(int i=0;i<chkBx.size();i++)
		{
			chkBx.get(i).click();
			Thread.sleep(3000);
		}
		

	}

}
