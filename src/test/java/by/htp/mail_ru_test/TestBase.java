package by.htp.mail_ru_test;

import java.sql.Timestamp;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {
	protected static WebDriver driver;
	String driverPath = "c://driver//geckodriver.exe";
	Timestamp timestamp = new Timestamp(System.currentTimeMillis());
	private String justLetterTheme = "HTP_JAVA_TAT3 Golosoff test letter " + timestamp;
	
	@BeforeClass
	public void setup(){
		System.setProperty("webdriver.gecko.driver", driverPath);
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterClass
	public void quit(){
		driver.quit();
	}
	
}
