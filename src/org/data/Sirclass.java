package org.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sirclass {
public static void main(String[] args) throws InterruptedException {
	  
	
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.facebook.com/r.php?entry_point=login");//select
	
	WebElement radio=driver.findElement(By.xpath("(//input[@type='radio'])[1]"));//2male //1female 
	
	radio.click();   
	
	
	driver.get("https://www.omrbranch.com/");
	WebElement checkbox=driver.findElement(By.name("remember_me")); //tick
	
	checkbox.click();
	}
}
