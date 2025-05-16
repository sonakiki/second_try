package org.data;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sirclass5 {
public static void main(String[] args) {
		
		
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://greenstech.in/selenium-placement-training-in-chennai-html");

		Actions a=new Actions(driver);
		
		WebElement course=driver.findElement(By.xpath("//div[@title='Courses']"));
		a.moveToElement(course).perform();
		
		WebElement contactUs=driver.findElement(By.linkText("Contact Us"));
		a.contextClick(contactUs).perform();
		
		
		driver.get("https://www.facebook.com/");
		WebElement user=driver.findElement(By.id("emeail"));
		user.sendKeys("jack1234");
		a.doubleClick(user).perform();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement source=driver.findElement(By.linkText("5000"));
		WebElement target=driver.findElement(By.id("amt7"));
		a.dragAndDrop(source, target).perform();
		
		

}
}