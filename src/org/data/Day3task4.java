package org.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3task4 {

		public static void main(String[] args) {
			
		
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.omrbranch.com/apitestingtraininginchennaiomr#/");	
		
		WebElement radio=driver.findElement(By.xpath("//input[@id ='female']"));
		
		radio.click();
		
		WebElement checkbox=driver.findElement(By.xpath("//input[@id ='checkbox-cricket']"));
		WebElement checkbox2=driver.findElement(By.xpath("//input[@id ='checkbox-movie']"));
		
		checkbox.click();
		checkbox2.click();
		
		WebElement RefreshButton=driver.findElement(By.xpath("//button[@id='Button1']"));
		RefreshButton.click();
		
}
}