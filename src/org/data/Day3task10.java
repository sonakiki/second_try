package org.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3task10 {
public static void main(String[] args)throws InterruptedException {
		
		
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(2000);

		WebElement loginButton=driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
		loginButton.click();
		Thread.sleep(1000);

		WebElement mobilenumber=driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']"));
		mobilenumber.sendKeys("9787654321");

		WebElement sendotpButton=driver.findElement(By.xpath("//button[text()='Request OTP']"));
		sendotpButton.click();
}
}