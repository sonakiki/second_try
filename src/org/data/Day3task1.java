package org.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Day3task1   {//by and name
	public static void main(String[] args) throws InterruptedException {
		 
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.omrbranch.com/");
		
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("ksonamadesh96@gmail.com");
	
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("1234567890");
	
		WebElement checkbox=driver.findElement(By.name("remember_me"));
		checkbox.click();
		
		WebElement loginButton=driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();
}
}