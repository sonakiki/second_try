package org.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3task7 {
public static void main(String[] args) {
			
		
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.cleartrip.com/");
		

		WebElement From = driver.findElement(By.xpath("//div[text()='From']"));
		From.sendKeys("Banglore");//incomplete
}
}