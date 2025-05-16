package org.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3task14 {
public static void main(String[] args)throws InterruptedException {
		
		
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.google.co.in/");
		
		WebElement Searchbox=driver.findElement(By.xpath("//input[@name='btnK']"));
		Thread.sleep(3000);
		Searchbox.sendKeys("Greenschennaiomrbranch");
		
		
		
		
}
}

