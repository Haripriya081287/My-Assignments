package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

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
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		
		driver.findElement(By.id("firstNameField")).sendKeys("Disha");
		driver.findElement(By.id("lastNameField")).sendKeys("D.S");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Firstnamelocal");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Lastnamelocal");
		
		driver.findElement(By.name("departmentName")).sendKeys("IT");
		driver.findElement(By.id("createContactForm_description")).sendKeys("This is my contact");
		driver.findElement(By.className("inputBox")).sendKeys("Disha@gmail.com");
		
		WebElement sourceDD = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select sec = new Select(sourceDD);
		sec.selectByVisibleText("New York");
		
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Enter the contact details");
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		System.out.println("The title is:" + driver.getTitle());
				
		
		
		
	}

}
