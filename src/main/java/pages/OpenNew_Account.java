package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import base.Test_Base;

public class OpenNew_Account extends Test_Base {
	
	
	
	@FindBy(xpath="//select[@id='type']")
	WebElement SelectAccountType;
	
	@FindBy(xpath="//select[@id='fromAccountId']")
	WebElement SelectExistingAccount;
	
	@FindBy(xpath="//input[@value='Open New Account']")
	WebElement OpenNewAccount;
	
	@FindBy(xpath="//a[@id='newAccountId']")
	WebElement NewAccountId;
	
	//Initlization page object
	public OpenNew_Account() throws IOException{
		PageFactory.initElements(driver, this);
	}
	
	public String GetTitleOpenNewAccountPage() throws InterruptedException {
		Thread.sleep(2000);
		return driver.getTitle();
		
		
	}
	

	public void clickOnSelectAccountType() throws InterruptedException {
		
		SelectAccountType.click();
		Select sel=new Select(SelectAccountType);
		Thread.sleep(1000);
		sel.selectByValue("1");
		
		
	}
	public void clickOnSelectExistingAccount() {
		SelectExistingAccount.click();
		//Select sel=new Select((WebElement) driver);
		//sel.deselectByValue("13677");
	}
	public void clickOnOpenNewAccount() throws InterruptedException {
		Thread.sleep(1000);
		OpenNewAccount.click();
	}
	
	public String GetNewAccountId() {
		return NewAccountId.getText();
	}
	
}
