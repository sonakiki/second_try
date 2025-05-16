package org.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sirclass2 {
	public static void main(String[] args) throws InterruptedException {
		  
		
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/r.php?entry_point=login");
		
		WebElement radio=driver.findElement(By.xpath("(//input[@type='radio'])[1]"));//2male //1female 
		
		radio.click(); 
		
		driver.navigate().to("https://www.omrbranch.com/");
		WebElement checkbox=driver.findElement(By.name("remember_me")); 
		checkbox.click();
		
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("ksonamadesh96@gmail.com");
		
		driver.get("https://www.greenstechnologys.com/selenium-placement-training-in-chennai.html");
		driver.navigate().back();
		driver.navigate().refresh();
		driver.navigate().forward();
		
		
}
}