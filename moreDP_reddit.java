package DataProvider;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class moreDP_reddit {
 public WebDriver driver;
	
	@Test(dataProvider = "incels")
  public void f(String first, String second) throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//*[@id=\'loginUsername\']")).sendKeys(first);
			driver.findElement(By.xpath("//*[@id=\'loginPassword\']")).sendKeys(second);
		Thread.sleep(3000);
			driver.findElement(By.xpath("//button[@class='AnimatedForm__submitButton']")).click();
		  Thread.sleep(3000);
		  	driver.findElement(By.xpath("//*[@id=\'loginUsername\']")).clear();
		  	driver.findElement(By.xpath("//*[@id=\'loginPassword\']")).clear();
		  Thread.sleep(2000);
	  
  }

  @DataProvider
  public Object[][] incels() {
    return new Object[][] {
    	new Object[] {"noobmaster69" , "aaaaaaa" },
        new Object[] { "whatislove", "vvbvbvbvbv" },
        new Object[] { "babydont@hurtme", "adadadhd" },
        new Object[] { "dont@hurtme", "qwertyimsoquirky" },
        new Object[] {"no@more", "iamsopumped"},
        new Object[] {"look@this", "iamnotdone"},
        new Object[] {"beat@you", "iamfinished"},
    	
    	
    };
  }
  @BeforeClass
  @Parameters("browser")
  public void beforeClass(String browsers) {
	 
	  if(browsers.equalsIgnoreCase("chrome")) {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\VAlex\\eclipse-workspace\\Automation_aps_code\\Drivers\\chromedriver.exe");  // 2inputs    //NEVER CHANGE!!!!!!
	  driver = new ChromeDriver();
	  
		driver.manage().timeouts().implicitlyWait(6,TimeUnit.SECONDS);
		driver.navigate().to("https://www.reddit.com");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		driver.navigate().to("https://www.reddit.com/login/?dest=https%3A%2F%2Fwww.reddit.com%2F");
	  }else if(browsers.equalsIgnoreCase("firefox")) {
		  System.setProperty("webdriver.gecko.driver", "C:\\Users\\VAlex\\eclipse-workspace\\Automation_aps_code\\geckodriver\\geckodriver.exe");  // 2inputs    //NEVER CHANGE!!!!!!
		  driver=new FirefoxDriver();
		  
		  driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		  driver.navigate().to("https://www.reddit.com");
		  driver.manage().window().maximize();
			driver.navigate().refresh();
			driver.navigate().to("https://www.reddit.com/login/?dest=https%3A%2F%2Fwww.reddit.com%2F");
	  }
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
