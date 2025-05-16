package org.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sirclass4 {
	public static void main(String[] args)throws InterruptedException {
		 
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		
		WebElement user=driver.findElement(By.id("email"));
		boolean displayed=user.isDisplayed();
		System.out.println();
		
		
		if (displayed) {
			user.sendKeys("ksonamadesh96@gmail.com");
		}else {
			System.out.println("Element is not displayed");
		}
		
		driver.get("https://omrbranch.com/");
		WebElement checkbox=driver.findElement(By.name("remember_me"));
		boolean selected=checkbox.isSelected();
		System.out.println(selected);
		
		
		if (selected) {
			System.out.println("its already selected");
		} else {
		     checkbox.click();				
		}
		
		driver.get("https://www.facebook.com/");
		WebElement button=driver.findElement(By.name("login"));
		boolean enabled=button.isEnabled();
		System.out.println(enabled);
		
		if (enabled) {
			 button.click();
		} else {
			System.out.println("Element is not enabled");
		}
		
}
	
}