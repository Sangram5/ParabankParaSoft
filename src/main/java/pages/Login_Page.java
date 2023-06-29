package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Test_Base;

public class Login_Page extends Test_Base {
	//Page factory /Object Repository

		@FindBy(xpath="//input[@name='username']")
		WebElement username;
		@FindBy(xpath="//input[@name='password']")
		WebElement password;
		
		
		@FindBy(xpath="//input[@value='Log In']")
		WebElement loginbtn;
		
		
		//Initlization page object
		public Login_Page() throws IOException {
			PageFactory.initElements(driver, this);
		}
		//Actions:
		public String validatepageTitle() {
			return driver.getTitle();
		}
		public Home_Page login(String un,String pwd) throws IOException, InterruptedException {
			username.sendKeys(un);
			password.sendKeys(pwd);
			Thread.sleep(2000);
			loginbtn.click();
			return new Home_Page();
		}


}
