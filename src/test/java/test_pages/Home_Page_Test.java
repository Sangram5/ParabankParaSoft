package test_pages;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.Test_Base;
import pages.Home_Page;
import pages.Login_Page;
import pages.OpenNew_Account;
import utility.CustomListner;
@Listeners(CustomListner.class)

public class Home_Page_Test extends Test_Base {
	Login_Page loginpage;
	Home_Page homepage;
	OpenNew_Account opennewAccount;

	public Home_Page_Test() throws IOException {
		super();
		
	}
	@BeforeTest
	public void setup() throws IOException {
		initialization();
		loginpage=new Login_Page();
	
	}
	@Test(priority=1)
	public void loginpageTest() throws IOException, InterruptedException {
		homepage=loginpage.login(prop.getProperty("userName"), prop.getProperty("password"));
	} 
	@Test(priority=2)
	public void clickOnOpenNewAccountTest() throws IOException {
		opennewAccount=homepage.clickOnOpenNewAccount();
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}

}
