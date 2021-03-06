package git;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
public class IdentificationFalse {

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
	  public void identificationFalse_ShouldReturnErrorMsg() throws Exception {
	    // Label: Test
	    // ERROR: Caught exception [ERROR: Unsupported command [resizeWindow | 1366,663 | ]]
		//  driver.Manage().Window.Maximize();
		  driver.manage().window().maximize();
		  driver.get(baseUrl);
	    driver.findElement(By.linkText("Sign in")).click();
	    driver.findElement(By.cssSelector("img.nav-signin-item-logo")).click();
	    driver.get("https://www.pluralsight.com/browse");
	    driver.findElement(By.id("Username")).click();
	    driver.findElement(By.id("Username")).clear();
	    driver.findElement(By.id("Username")).sendKeys("user");
	    driver.findElement(By.id("Password")).click();
	    driver.findElement(By.id("Password")).clear();
	    driver.findElement(By.id("Password")).sendKeys("user");
	    driver.findElement(By.id("login")).click();
	    // ERROR: Caught exception [ERROR: Unsupported command [contextMenuAt | id=errorMessage | 498,26]]
	    assertEquals("Invalid user name or password", driver.findElement(By.id("errorMessage")).getText());
	  }
	  

	  @After
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }
}
