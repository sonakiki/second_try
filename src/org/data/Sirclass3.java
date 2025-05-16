package org.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sirclass3 {
	public static void main(String[] args) {
		 
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		
		WebElement text=driver.findElement(By.xpath("//a[text()='Create a Page']"));
		String t=text.getText();   //to give text message in console 
		System.out.println(t);
		
		
		WebElement para =driver.findElement(By.xpath("//h2[contains(text(),'Facebook')]"));
		String tex=para.getText();//h2 is a div navigate from fb
		System.out.println(tex);
		
		WebElement user=driver.findElement(By.id("email"));
		user.sendKeys("jack@1234");
		
		String attribute=user.getAttribute("value");
		System.out.println(attribute);
		
		String domproperty=user.getDomProperty("value");
		System.out.println(domproperty);
	}

}
//since value is default in getattribute and getdomproperty both are same