package test_pages;

import java.io.IOException;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.Test_Base;
import pages.BillPay;
import pages.Home_Page;
import pages.Login_Page;
import utility.CustomListner;
import utility.Excel_Read;
@Listeners(CustomListner.class)

public class BillPay_Test extends Test_Base{
	Login_Page loginpage;
	Home_Page homepage;
	BillPay  billPay;
	String sheetName="BillPayData1";
	BillPay_Test() throws IOException{
		
		super();
		
	}
	@BeforeTest
	public void setup() throws IOException, InterruptedException {
		initialization();
		loginpage=new Login_Page();
		homepage=loginpage.login(prop.getProperty("userName"), prop.getProperty("password"));
		billPay=homepage.clickOnBillPay();
	}
	@DataProvider
	public Object[][] getbillPayData() {
		Object data[][]=Excel_Read.getTestData(sheetName);
		return data;
	}
	@Test(priority=1, dataProvider="getbillPayData")
	public void enterPayeeInfo(String payee_Name,String address,String city,String state
			,String zip_Code,String phone,String account,String verify_Account,String amount ) throws InterruptedException {
		billPay.enterPayeeInfo(payee_Name, address, payee_Name, state, zip_Code, phone, account, verify_Account, amount);
		
	}
	@Test(priority=2)
	public void clickselectAccount() {
	
		billPay.selectAccount();
	}
	@Test(priority=3)
	public void clickSendPaymentBtn() {
		billPay.clicksendPayment();
	}
	@AfterTest
	public void teardown() {
		driver.close();
	}
	

}
