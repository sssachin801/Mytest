package com.abc.demo;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		
		String url="https://magento.com/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		
		WebElement myAcct=driver.findElement(By.xpath("//*[text()='Account']/ancestor::a"));
		myAcct.click();
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("sucheendra.abc@gmail.com");
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("Welcome123");
		WebElement login=driver.findElement(By.id("send2"));
		login.click();
		WebElement logout=driver.findElement(By.linkText("Log Out"));
		logout.click();
	}

}
