package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//To launch the application
		ChromeDriver driver = new ChromeDriver();
		//to load the url
		driver.get("https://www.facebook.com/");
		//to maximize
		driver.manage().window().maximize();
		//To close the current window
		driver.close();
		//Thread.sleep(3000);
		
	}

}
