package testCases;

import javax.swing.text.Element;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.InvoicePage;
import pages.LoginPage;

public class testCases extends BaseTest {

	@Test // TC001 - Login (Positivo)

	public void positiveLogin() throws InterruptedException {

		HomePage hp = new HomePage(driver, wait);
		LoginPage lp = new LoginPage(driver, wait);

		hp.goToPhptravels();

		lp.loginToPhptravels("user@phptravels.com", "demouser");
		Thread.sleep(500);
		lp.verifyHeaderAfterLogged("Hi, Johny Smith");
	}

	@Test // TC002 - Login (Negativo)

	public void negativeLogin() throws InterruptedException {

		HomePage hp = new HomePage(driver, wait);
		LoginPage lp = new LoginPage(driver, wait);

		hp.goToPhptravels();

		lp.loginToPhptravels("user@phptravels.com", "Demouser");
		Thread.sleep(500);
		lp.verifyLoginFailed("Invalid Email or Password");
		lp.refreshingPage();
		Thread.sleep(500);

		lp.loginToPhptravels("user@phptravels.com", "demouser_");
		Thread.sleep(500);
		lp.verifyLoginFailed("Invalid Email or Password");
		lp.refreshingPage();
		Thread.sleep(500);

		lp.loginToPhptravels("another_user@phptravels.com", "demouser");
		Thread.sleep(500);
		lp.verifyLoginFailed("Invalid Email or Password");
		lp.refreshingPage();
		Thread.sleep(500);

		lp.loginToPhptravels("user@phptravels.com.br", "Demouser");
		Thread.sleep(500);
		lp.verifyLoginFailed("Invalid Email or Password");
		lp.refreshingPage();
		Thread.sleep(500);
	}

	@Test // TC003 - Validar informação de Invoice

	public void validatingInvoicePage() throws InterruptedException {

		HomePage hp = new HomePage(driver, wait);
		LoginPage lp = new LoginPage(driver, wait);
		InvoicePage ip = new InvoicePage(driver, wait);

		hp.goToPhptravels();
		lp.loginToPhptravels("user@phptravels.com", "demouser");
		Thread.sleep(500);

		ip.goToInvoicePage();

		ip.verifyNameI("JOHNY SMITH");
		ip.verifyAdressI("R2, AVENUE DU MAROC");
		ip.verifyAdressNumberI("123456");
		ip.verifyInvoiceDate("Invoice Date : 09/08/2018");
		ip.verifyDueDate("Due Date : 10/08/2018");
		ip.verifyInvoiceNumber("Invoice Number : 116");
		ip.verifyInvoiceBookingCOde("Booking Code 9360");
		ip.verifyCheckIn("09/08/2018");
		ip.verifyTotalStay("USD $150");
		ip.verifyDepositNow("USD $16.50");
		ip.verifyTaxAndVat("USD $15");
		ip.verifyTotalAmount("USD $165");

	}

}
