package test_pages;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.Test_Base;
import pages.Home_Page;
import pages.Login_Page;
import utility.CustomListner;


@Listeners(CustomListner.class)
public class Login_Page_Test extends Test_Base{
	Login_Page loginpage;
	Home_Page homepage;

	public Login_Page_Test() throws IOException {
		super();
		
	}
	@BeforeTest
	public void setup() throws IOException {
		initialization();
		loginpage=new Login_Page();
	
	}
	@Test(priority=1)
	public void loginpageTitle() {
		String title=loginpage.validatepageTitle();
		System.out.println("Page title is:" + title );
		Assert.assertEquals(title, "ParaBank | Welcome | Online Banking");
	}
	@Test(priority=2)
	public void loginpageTest() throws IOException, InterruptedException {
		homepage=loginpage.login(prop.getProperty("userName"), prop.getProperty("password"));
	} 
	
	@AfterTest
	public void teardown() {
		driver.close();
	}

}
