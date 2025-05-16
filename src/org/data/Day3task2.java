package org.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3task2 { //by xpath
	public static void main(String[] args) throws InterruptedException {
		 
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.omrbranch.com/");
		
		WebElement username=driver.findElement(By.xpath("//input[@name ='email']"));
		username.sendKeys("ksonamadesh96@gmail.com");
	
		WebElement password=driver.findElement(By.xpath("//input[@id='pass']"));
		password.sendKeys("1234567890");
		
		WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkbox.click();
		
		WebElement loginButton=driver.findElement(By.xpath("//button[@type='submit']"));
		loginButton.click();
}

}
