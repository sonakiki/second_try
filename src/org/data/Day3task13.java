package org.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3task13 {
public static void main(String[] args)throws InterruptedException {
		
        
	      	 WebDriver driver = new ChromeDriver();
	        	     
	        driver.navigate().to("https://www.swiggy.com/");
	        Thread.sleep(2000);
	        
	        WebElement locationInput = driver.findElement(By.xpath("//input[@class='_5ZhdF _3GoNS _1LZf8']"));
	        locationInput.sendKeys("Chennai");
	        Thread.sleep(1000);//checked
	        
	        WebElement clickLocation = driver.findElement(By.xpath("//span[contains(text(),'Chennai, Tamil Nadu, India')]"));
	        clickLocation.click();
	        Thread.sleep(3000);//checked
	        
	        WebElement searchrestaurant = driver.findElement(By.xpath("//input[@placeholder='Search for restaurants and food']"));
	        searchrestaurant.click();
	        searchrestaurant.sendKeys("Domino's Pizza");
	        Thread.sleep(2000);
	        
		
}   
}