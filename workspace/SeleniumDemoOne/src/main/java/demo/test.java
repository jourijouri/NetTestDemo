package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:/Users/joudi/Desktop/cdi/tools/chromedriver.exe");
		WebDriver driver = new FirefoxDriver();
	//	WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		 boolean q = driver.getPageSource().contains("aaaaaa");
		System.out.print(q);
	//	WebElement searchField = driver.findElement(By.id("input"));
	//	searchField.sendKeys("pluralsight");
		 
		   
		

	}

}
