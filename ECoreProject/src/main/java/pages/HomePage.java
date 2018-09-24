package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	String baseURL = "https://www.phptravels.net/login";

	String myAccountButton = "//*[@id=\"li_myaccount\"]/a";
	String loginButton = "//*[@id=\"li_myaccount\"]/ul/li[1]/a";

	String accountButton1 = "//*[@id=\"collapse\"]/ul[2]/ul/li[1]";
	String accountButton2 = "//*[@id=\"collapse\"]/ul[2]/ul/li[1]/ul/li[1]/a";

	String mainInvoiceButton = "//*[@id=\"bookings\"]/div[2]/div[4]/a";

	public void goToPhptravels() {
		driver.get(baseURL);

	}

	public void goToLoginPage() {
		click(By.name(myAccountButton));
		click(By.name(loginButton));
	}

	public void goToAccountPage() {
		click(By.xpath(accountButton1));
		click(By.xpath(accountButton2));
	}

	public void goToInvoicePage() {
		click(By.xpath(mainInvoiceButton));
	}
}
