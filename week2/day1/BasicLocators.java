package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicLocators {

	public static void main(String[] args) {
		// To launch the application
		ChromeDriver driver = new ChromeDriver();
		//launch the url
		driver.get("http://leaftaps.com/opentaps");
		//Maximize the browser
		driver.manage().window().maximize();
		//Enter username as DemoCSR
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		// Enter password as crmsfa
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click on Login
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click on CRM/SFA
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Click on Leads
		driver.findElement(By.linkText("Leads")).click();
		//Click on CreateLead  Link
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter the CompanyName
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		//Enter the FirstName
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Haripriya");
		//Enter the Lastname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sathish Kumar");
		//Click on CreateLead button
		driver.findElement(By.name("submitButton")).click();		
		
	}

}
