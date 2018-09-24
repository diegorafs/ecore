package testCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	public WebDriver driver;
	public WebDriverWait wait;

	@BeforeClass
	public void setup() {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\drabelo\\eclipse-workspace\\maven\\chromedriver.exe");
		driver = new ChromeDriver();

		wait = new WebDriverWait(driver, 0);

		driver.manage().window().maximize();
	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}
}