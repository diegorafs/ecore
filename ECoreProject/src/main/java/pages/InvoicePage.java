package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class InvoicePage extends BasePage {

	public InvoicePage(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	String baseURL = "https://www.phptravels.net/invoice?id=116&sessid=9360";

	String customerNameId = "//*[@id=\"invoiceTable\"]/tbody/tr[2]/td/div[2]/table/tbody/tr/td/div[2]";
	String customerAddressId = "//*[@id=\"invoiceTable\"]/tbody/tr[2]/td/div[2]/table/tbody/tr/td/div[3]";
	String customerAddressNumberId = "//*[@id=\"invoiceTable\"]/tbody/tr[2]/td/div[2]/table/tbody/tr/td/div[4]";
	String customerInvoiceDate = "//*[@id=\"invoiceTable\"]/tbody/tr[2]/td/div[1]/table/tbody/tr/td/div[1]";
	String customerDueDate = "//*[@id=\"invoiceTable\"]/tbody/tr[2]/td/div[1]/table/tbody/tr/td/div[2]";
	String customerInvoiceNumber = "//*[@id=\"invoiceTable\"]/tbody/tr[2]/td/div[1]/table/tbody/tr/td/div[4]";
	String customerCheckIn = "//*[@id=\"invoiceTable\"]/tbody/tr[4]/td/table/tbody/tr[2]/td/table[1]/tbody/tr[3]/td[2]";
	String customerTotalStay = "//*[@id=\"invoiceTable\"]/tbody/tr[4]/td/table/tbody/tr[2]/td/table[1]/tbody/tr[4]/td[2]";
	String customerDepositNow = "//*[@id=\"invoiceTable\"]/tbody/tr[4]/td/table/tbody/tr[2]/td/table[2]/tbody/tr/td[1]";
	String customerTaxVat = "//*[@id=\"invoiceTable\"]/tbody/tr[4]/td/table/tbody/tr[2]/td/table[2]/tbody/tr/td[2]";
	String customerTotalAmount = "//*[@id=\"invoiceTable\"]/tbody/tr[4]/td/table/tbody/tr[2]/td/table[2]/tbody/tr/td[3]";
	String customerBookingCode = "//*[@id=\"invoiceTable\"]/tbody/tr[2]/td/div[1]/table/tbody/tr/td/div[5]";

	// String customerAddressNumberId = customerAddressNumber;

	// *********Page Methods*********

	// Verify Username Condition
	public void verifyNameI(String expectedText) {

		Assert.assertEquals(readText(By.xpath(customerNameId)), expectedText);

	}

	public void verifyAdressI(String expectedText) {

		Assert.assertEquals(readText(By.xpath(customerAddressId)), expectedText);

	}

	public void verifyAdressNumberI(String expectedText) {

		Assert.assertEquals(readText(By.xpath(customerAddressNumberId)), expectedText);

	}

	public void verifyInvoiceDate(String expectedText) {

		Assert.assertEquals(readText(By.xpath(customerInvoiceDate)), expectedText);

	}

	public void verifyDueDate(String expectedText) {

		Assert.assertEquals(readText(By.xpath(customerDueDate)), expectedText);

	}

	public void verifyInvoiceNumber(String expectedText) {

		Assert.assertEquals(readText(By.xpath(customerInvoiceNumber)), expectedText);

	}

	public void verifyInvoicverifyInvoiceBookingCOdeeBookingCOde(String expectedText) {

		Assert.assertEquals(readText(By.xpath(customerInvoiceNumber)), expectedText);

	}

	public void verifyCheckIn(String expectedText) {

		Assert.assertEquals(readText(By.xpath(customerCheckIn)), expectedText);

	}

	public void verifyTotalStay(String expectedText) {

		Assert.assertEquals(readText(By.xpath(customerTotalStay)), expectedText);

	}

	public void verifyDepositNow(String expectedText) {

		Assert.assertEquals(readText(By.xpath(customerDepositNow)), expectedText);

	}

	public void verifyTaxAndVat(String expectedText) {

		Assert.assertEquals(readText(By.xpath(customerTaxVat)), expectedText);

	}

	public void verifyTotalAmount(String expectedText) {

		Assert.assertEquals(readText(By.xpath(customerTotalAmount)), expectedText);

	}

	public void verifyInvoiceBookingCOde(String expectedText) {

		Assert.assertEquals(readText(By.xpath(customerBookingCode)), expectedText);

	}

	// Go to Homepage
	public void goToInvoicePage() {
		driver.get(baseURL);

	}
}