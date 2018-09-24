package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	String usenameId = "username";
	String passwordId = "password";
	String loginButtonId = "//*[@id=\"loginfrm\"]/button";
	String checkinNameAfterLogged = "//*[@id=\"body-section\"]/div[1]/div/div/div[1]/h3";
	String checkinLoginFailed = "//*[@id=\"loginfrm\"]/div[1]/div[2]/div";

	public void loginToPhptravels(String username, String password) {

		writeText(By.name(usenameId), username);

		writeText(By.name(passwordId), password);

		click(By.xpath(loginButtonId));
	}

	public void verifyHeaderAfterLogged(String expectedText) {
		Assert.assertEquals(readText(By.xpath(checkinNameAfterLogged)), expectedText);
	}

	public void verifyLoginFailed(String expectedText) {
		Assert.assertEquals(readText(By.xpath(checkinLoginFailed)), expectedText);
	}

}