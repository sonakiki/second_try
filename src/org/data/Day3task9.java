package org.data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3task9 {
	public static void main(String[] args) {
		
		
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.redbus.in");
		
				// Enter From Location
		WebElement from = driver.findElement(By.xpath("//input[@id='src']"));
		from.sendKeys("Bangalore");

		// Enter To Location
		WebElement to = driver.findElement(By.xpath("//input[@id='dest']"));
		to.sendKeys("Chennai");

		// Select Date
		WebElement date = driver.findElement(By.xpath("//input[@id='onward_cal']"));
		date.click();

		// Pick today's date
		WebElement todayDate = driver.findElement(By.xpath("//td[@class='current day']"));
		todayDate.click();

		// Click Search Buses Button
		WebElement searchButton = driver.findElement(By.xpath("//button[@id='search_btn']"));
		searchButton.click();
}
}