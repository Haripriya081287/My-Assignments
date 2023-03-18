package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EditLead {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        option.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(option);
        driver.get("http://leaftaps.com/opentaps/control/login");
        driver.manage().window().maximize();
		
			 
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Hari");
		driver.findElement(By.xpath("//button[@class='x-btn-text']")).click();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		String title = driver.getTitle();
		System.out.println("The title is :" + (title));
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("Company123");
		String text = driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		if(text=="Company123")
		{
			System.out.println("Company123");
		}
		driver.close();
		

	}

}
