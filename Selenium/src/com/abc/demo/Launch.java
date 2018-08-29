package com.abc.demo;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch {
	public static void main(String[] args)throws Exception{
		
		String url="https://datatables.net/extensions/select/examples/initialisation/checkbox.html";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		//xpath to count the num of rows
		List<WebElement>rows=driver.findElements(By.xpath("//table[@id='example']/tbody/tr"));
		//displaying the count of rows
		int rowSize=rows.size();
		System.out.println("The total num of rows "+rowSize);
		//xpath to count the num of cols
		List<WebElement>cols=driver.findElements(By.xpath("//table[@id='example']/tbody/tr[1]/td"));
		//displaying the count of cols
		int colSize=cols.size();
		System.out.println("The total num of cols "+colSize);
		
		int total=0;
		for (int i = 1; i <=rowSize; i++) 
		{
			WebElement ele=driver.findElement(By.xpath("//table[@id='example']/tbody/tr["+i+"]/td[6]"));
			String text=ele.getText();
			text=text.replace("$","");
			text=text.replace(",","");
			total=Integer.parseInt(text)+total;
		}
		
		System.out.println("Total salary is "+total);
	}

}