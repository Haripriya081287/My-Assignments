package Marathon1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Redbus {

	public static void main(String[] args) {
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        option.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(option);
        driver.get("https://www.redbus.in/");
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));	
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		driver.findElement(By.xpath("//td[@class='wd day']")).click();
		driver.findElement(By.xpath("//button[@id='search_btn']")).click();
		
				
		String text = driver.findElement(By.xpath("//span[@class='w-60 d-block d-found']")).getText();
		System.out.println(text);
		
		WebElement sleeper = driver.findElement(By.xpath("//label[text()='SLEEPER']"));
		driver.executeScript("arguments[0].click();",sleeper);
		 String text2 = driver.findElement(By.xpath("//div[text()='KMRL Kalaimakal']")).getText();
		System.out.println(text2);
		System.out.println("The title of the page is :"  + driver.getTitle());
		
	}

}
