package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Test_Base;

public class BillPay extends Test_Base {

	@FindBy(xpath="//input[@name='payee.name']")
	WebElement payeeName;
	
	@FindBy(xpath="//input[@name='payee.address.street']")
	WebElement address;
	
	@FindBy(xpath="//input[@name='payee.address.city']")
	WebElement cityName;
	
	@FindBy(xpath="//input[@name='payee.address.state']")
	WebElement state;
	
	@FindBy(xpath="//input[@name='payee.address.zipCode']")
	WebElement zipCode;
	
	@FindBy(xpath="//input[@name='payee.phoneNumber']")
	WebElement phoneNumber;
	
	@FindBy(xpath="//input[@name='payee.accountNumber']")
	WebElement accountNumber;
	
	@FindBy(xpath="//input[@name='verifyAccount']")
	WebElement verifyAccountNumber;
	
	@FindBy(xpath="//input[@name='amount']")
	WebElement amount;
	
	@FindBy(xpath="//select[@name='fromAccountId']")
	WebElement fromAccount;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement sendPaymentbtn;
	
	
	
	//Initlization all web element
	
	public BillPay() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	//Perform the Actions
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public void enterPayeeInfo(String pName,String addr,String cName,String stateName,String zip_code,String ph_Number,String accnumber,
			String verifyAccNumber,String amt) throws InterruptedException {
		Thread.sleep(2000);
		payeeName.sendKeys(pName);
		Thread.sleep(2000);
		address.sendKeys(addr);
		Thread.sleep(2000);
		cityName.sendKeys(cName);
		Thread.sleep(2000);
		state.sendKeys(stateName);
		Thread.sleep(2000);
		zipCode.sendKeys(zip_code);
		Thread.sleep(2000);
		phoneNumber.sendKeys(ph_Number);
		Thread.sleep(2000);
		accountNumber.sendKeys(accnumber);
		Thread.sleep(2000);
		verifyAccountNumber.sendKeys(verifyAccNumber);
		Thread.sleep(2000);
		amount.sendKeys(amt);
		
	}
	public void selectAccount() {
		
		fromAccount.click();
	}
	
	public void clicksendPayment() {
		sendPaymentbtn.click();
	}
	
	
}
