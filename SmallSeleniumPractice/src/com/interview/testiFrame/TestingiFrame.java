package com.interview.testiFrame;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingiFrame {
	
	public static WebDriver driver;
	public static String testURL = "http://demo.guru99.com/test/guru99home/";

	public static void main(String[] args) {

			
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\downloads\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(testURL);
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			WebElement fr = driver.findElement(By.tagName("iframe"));
			driver.switchTo().frame(fr);
			
			int total = driver.findElements(By.xpath("html/body/a/img")).size();
			
			System.out.println("The total size is: "+total);
			
			driver.switchTo().defaultContent();
			
			driver.quit();
			


		

	}

}
