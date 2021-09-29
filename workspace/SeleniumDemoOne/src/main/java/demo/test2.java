package demo;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test2 {
	private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @Before
	  public void setUp() throws Exception {
	    driver = new ChromeDriver();
	    baseUrl = "https://www.pluralsight.com/";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void test() throws Exception {
	    // open | / | 
	    driver.get(baseUrl + "/");
	    // click | link=Sign in | 
	    driver.findElement(By.linkText("Sign in")).click();
	    // click | css=img.nav-signin-item-logo | 
	    driver.findElement(By.cssSelector("img.nav-signin-item-logo")).click();
	    // type | id=Username | invalid
	    driver.findElement(By.id("Username")).clear();
	    driver.findElement(By.id("Username")).sendKeys("invalid");
	    // type | id=Password | pass
	    driver.findElement(By.id("Password")).clear();
	    driver.findElement(By.id("Password")).sendKeys("pass");
	    // click | id=login | 
	    driver.findElement(By.id("login")).click();
	    //assert error is thrown
	    assertEquals("Invalid user name or password", driver.findElement(By.id("errorMessage")).getText());
	  
	  }

}
