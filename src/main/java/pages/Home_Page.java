package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Test_Base;

public class Home_Page extends Test_Base {
	
	@FindBy(xpath="//a[contains(text(),'Open New Account')]")
	WebElement OpenNewAccount;
	
	@FindBy(xpath="//a[contains(text(),'Accounts Overview')]")
	WebElement AccountOverView;
	
	@FindBy(xpath="//a[contains(text(),'Transfer Funds')]")
	WebElement TransferFunds;
	
	@FindBy(xpath="//a[contains(text(),'Bill Pay')]")
	WebElement BillPay;
	
	@FindBy(xpath="//a[contains(text(),'Find Transactions')]")
	WebElement FindTransactions;
	
	@FindBy(xpath="//a[contains(text(),'Update Contact Info')]")
	WebElement UpdateContactInfo;
	
	@FindBy(xpath="//a[contains(text(),'Request Loan')]")
	WebElement RequestLoan;
	
	@FindBy(xpath="//a[contains(text(),'Log Out')]")
	WebElement LogOut;
	
	public Home_Page() throws IOException{
		PageFactory.initElements(driver, this);
	}
	
	public OpenNew_Account clickOnOpenNewAccount() throws IOException {
		OpenNewAccount.click();
		return new OpenNew_Account();
	}
	
	public Account_Overview clickOnAccountOverview() {
		AccountOverView.click();
		return new Account_Overview();
	}
	public TransferFunds clickOnTransferFunds() {
		TransferFunds.click();
		return new TransferFunds();
		
	}
	public BillPay clickOnBillPay() throws IOException {
		BillPay.click();
		return new BillPay();
	}
	public FindTransaction clickOnFindTransaction() {
		FindTransactions.click();
		return new FindTransaction();
	}
	public UpdateContactInfo clickOnUpdateContactInfo() {
		UpdateContactInfo.click();
		return new UpdateContactInfo();
	}
	public RequestLoan clickOnRequestLoan() {
		RequestLoan.click();
		return new RequestLoan();
	}
	public void clickOnLogOut() {
		LogOut.click();
	}

}
