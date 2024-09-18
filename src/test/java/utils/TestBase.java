package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
		
	public static WebDriver driver;
	
	
	public void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\kulkashu\\eclipse-workspace\\cucumber-java-practice\\chromedriver.exe");
		driver = new ChromeDriver();
		WebDriver driver2 = new ChromeDriver();
		driver2.get("https://www.google.com");
	}
	
}
