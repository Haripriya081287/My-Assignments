package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		     //1. Launch http://leaftaps.com/opentaps
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
			// 2. Enter username as demoSalesManager (Use : Attribute based)
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");
			 //3. Enter password as crmsfa (Use : Attribute based)
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
			 //4. Click on Login (Use : Attribute based)
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
			 //5. Click on CRM/SFA (Use Partial Text based xpath)
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
			 //6. Click on Leads(Use Text based)
		driver.findElement(By.xpath("//a[text()='Leads']")).click();

	}

}
