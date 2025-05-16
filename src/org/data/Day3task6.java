package org.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3task6 {
public static void main(String[] args) {
			
		
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");	
				
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		username.sendKeys("greenstechchennaiomr@gmail.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
		password.sendKeys("Greens@123");
		
		WebElement loginButton=driver.findElement(By.xpath("//button[@name='login']"));
		loginButton.click();
}
}