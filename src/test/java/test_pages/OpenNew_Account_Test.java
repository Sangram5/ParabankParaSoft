package test_pages;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Test_Base;
import pages.Home_Page;
import pages.Login_Page;
import pages.OpenNew_Account;

public class OpenNew_Account_Test extends Test_Base{
	Login_Page loginpage;
	Home_Page homepage;
	OpenNew_Account opennewAccount;
	
	
	OpenNew_Account_Test() throws IOException{
		super();
		
	}
	@BeforeTest
	public void setup() throws IOException, InterruptedException {
		initialization();
		loginpage=new Login_Page();
		homepage=loginpage.login(prop.getProperty("userName"), prop.getProperty("password"));
		opennewAccount=homepage.clickOnOpenNewAccount();
	
	}
	
	@Test(priority=1)
	public void verifyPageTitle() throws InterruptedException {
		String str=opennewAccount.GetTitleOpenNewAccountPage();
		System.out.println("Open New Account Page Title is : "+ str);
	}
	@Test(priority=2)
	public void SelectAccountType() throws InterruptedException {
		Thread.sleep(2000);
		opennewAccount.clickOnSelectAccountType();
	}
	
	@Test(priority=3)
	public void createnewAccount() throws InterruptedException {
		Thread.sleep(2000);
		opennewAccount.clickOnOpenNewAccount();
	}
	@Test(priority=4)
	public void verifyCreatedAccountNumber() throws InterruptedException {
		Thread.sleep(2000);
		String str=opennewAccount.GetNewAccountId();
		System.out.println("New Account created ID is :" + str );
	}
	
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
	
	
}
