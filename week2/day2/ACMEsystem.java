package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ACMEsystem {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        option.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(option);
        driver.get("https://acme-test.uipath.com/login");
        driver.manage().window().maximize();
		
				
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("priya@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("pass1234");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		System.out.println("The title of the page is :"  + driver.getTitle());
		driver.findElement(By.partialLinkText("Log Out")).click();	
		driver.close();

	}

}
