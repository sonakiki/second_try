package org.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3task15 {
public static void main(String[] args)throws InterruptedException {
		
		
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.youtube.com/");
		
       driver.findElement(By.xpath("//div[@class='yt-spec-touch-feedback-shape__fill']")).click();		
}
		
}
