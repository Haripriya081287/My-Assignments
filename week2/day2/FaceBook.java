package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");
        option.addArguments("--disable-notifications");
        ChromeDriver driver = new ChromeDriver(option);
        driver.get("https://en-gb.facebook.com/");
        driver.manage().window().maximize();
		
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='inputtext _58mg _5dba _2ph-']")).sendKeys("Haripriya");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("M");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("hari.priya@gmail.com");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("test@123");
		
		WebElement Dateday = driver.findElement(By.id("day"));
		Select day = new Select(Dateday);
		day.selectByIndex(8);
		
		WebElement DateMon = driver.findElement(By.id("month"));
		Select Month = new Select(DateMon);
		Month.selectByValue("Dec");
		
		WebElement Dateyear = driver.findElement(By.id("year"));
		Select year = new Select(Dateyear);
		year.selectByVisibleText("1987");
		
		driver.findElement(By.linkText("Female")).click();		
		

	}

}
