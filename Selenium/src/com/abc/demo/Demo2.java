package com.abc.demo;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo2 {

	public static void main(String[] args) {
		String url="https://www.google.com";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		WebElement search=driver.findElement(By.xpath("//input[@id='lst-ib']"));
		Actions a=new Actions(driver);
		a.moveToElement(search).click().build().perform();
		a.keyDown(Keys.SHIFT).sendKeys("abc for technology training").build().perform();
		a.sendKeys(Keys.ENTER).build().perform();;
		
		
		
	}
}
