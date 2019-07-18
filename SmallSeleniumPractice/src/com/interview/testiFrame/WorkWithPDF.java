package com.interview.testiFrame;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.net.URL;

import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkWithPDF {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.princexml.com/samples/");
		
		driver.findElement(By.xpath("//*[@id='dictionary']//a[text()='PDF']")).click();
		
		if(driver.getCurrentUrl().contains("pdf"))
		{
			System.out.println("The url is a pdf");
		}
		
		URL url = new URL(driver.getCurrentUrl());
		BufferedInputStream bis = new BufferedInputStream(url.openStream());
//		PDFParser parser = new PDFParser(bis);
		
		PDFTextStripper pdfStripper = new PDFTextStripper();
		
//		

	}

}
