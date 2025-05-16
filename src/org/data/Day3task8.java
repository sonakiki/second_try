package org.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3task8 {
	public static void main(String[] args)throws InterruptedException {
		
	
	WebDriver driver =new ChromeDriver();
	driver.navigate().to("https://greenstech.in/selenium-course-content.html");	
			
	WebElement interviewQuestion = driver.findElement(By.xpath("//h2[contains(text(),'Interview Questions')]"));
	interviewQuestion.click();
	
	WebElement TCSinterviewQuestion = driver.findElement(By.xpath("//a[contains(text(),'TCS Interview Questions')]"));
	TCSinterviewQuestion.click();
	}
	
}