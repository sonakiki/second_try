package org.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3task5 {
public static void main(String[] args) {
			
		
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");	
		
		WebElement search=driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys("Iphone 16 pro max");	
			
		WebElement SearchButton =driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		SearchButton.click();
		
}
}