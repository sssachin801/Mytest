package com.abc.demo;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo1 {

	public static void main(String[] args)throws Exception 
	{
		String url="https://account.magento.com/customer/account/create/";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		
		System.out.println(driver.getWindowHandle());
		WebElement terms=driver.findElement(By.linkText("Terms and Conditions"));
		terms.click();
		Set<String> allIds=driver.getWindowHandles();
		System.out.println(allIds);
		
		ArrayList<String> list=new ArrayList<String>();
		list.addAll(allIds);
		
		driver.switchTo().window(list.get(1));
		WebElement privacy=driver.findElement(By.linkText("Magento Privacy Shield Privacy Policy"));
		privacy.click();
				
	}

}
