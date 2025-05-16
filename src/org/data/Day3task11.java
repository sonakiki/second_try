package org.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3task11 {
public static void main(String[] args)throws InterruptedException {
		
		
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.snapdeal.com/");
		Thread.sleep(2000);
		
		WebElement Searchbox=driver.findElement(By.xpath("//input[@name='keyword']"));
		Searchbox.sendKeys("Books");
		
		WebElement Searchbutton=driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']"));
		Searchbutton.click();
		
		
}
}