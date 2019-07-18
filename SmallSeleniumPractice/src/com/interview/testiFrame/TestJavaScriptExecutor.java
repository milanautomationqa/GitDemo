package com.interview.testiFrame;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestJavaScriptExecutor {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("How to find number of items in a DropBox using Selenium");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//*[@class='FPdoLc VlcLAe']//input[@value='Google Search' and @name='btnK']")));
		System.out.println("Javascript Executor Passed");
		

	}
	
	public static void main(String str)
	{
		
	}

}
