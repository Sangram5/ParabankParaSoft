package utility;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

import base.Test_Base;

public class WebEventListener extends Test_Base implements WebDriverEventListener{

	
	public WebEventListener() throws IOException {
		//super();
		// TODO Auto-generated constructor stub
	}


	public void beforeAlertAccept(String url ,WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Before Accept Alert to :"+ " "+url+" ");
		
	}

	
	public void afterAlertAccept(String url ,WebDriver driver) {
		System.out.println(" Accept Alert to :"+ " "+url+" ");
		
	}


	public void afterAlertDismiss(String url ,WebDriver driver) {
		// TODO Auto-generated method stub
		
	}


	public void beforeAlertDismiss(String url ,WebDriver driver) {
		// TODO Auto-generated method stub
		
	}


	public void beforeNavigateTo(String url, WebDriver driver) {
		System.out.println("Triying to navigate  to :"+ " "+url+" ");
		
	}

	
	public void afterNavigateTo(String url, WebDriver driver) {
		System.out.println("Navigate  to :"+ " "+url+" ");
		
	}

	
	public void beforeNavigateBack(String url ,WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	
	public void afterNavigateBack(String url ,WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	
	public void beforeNavigateForward(String url ,WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	
	public void afterNavigateForward(String url ,WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	
	public void beforeNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	
	public void afterNavigateRefresh(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}


	public void beforeFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("Triying to find Element By :"  + by.toString());
		
	}

	
	public void afterFindBy(By by, WebElement element, WebDriver driver) {
		System.out.println("Found Element By :"  + by.toString());
		
	}

	
	public void beforeClickOn(WebElement element, WebDriver driver) {
		System.out.println("Triying to click on  Element By :"  + element.toString());
		
	}

	
	public void afterClickOn(WebElement element, WebDriver driver) {
		System.out.println(" click on  Element By :"  + element.toString());
		
	}

	
	

	
	public void beforeSwitchToWindow(String windowName, WebDriver driver) {
		System.out.println("Triying to switch window By :"  + windowName.toString());
		
	}

	public void afterSwitchToWindow(String windowName, WebDriver driver) {
		System.out.println("Switch to window By :"  + windowName.toString());
		
	}

	
	public void onException(Throwable throwable, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	
	public <X> void beforeGetScreenshotAs(OutputType<X> target) {
		// TODO Auto-generated method stub
		
	}

	
	public <X> void afterGetScreenshotAs(OutputType<X> target, X screenshot) {
		// TODO Auto-generated method stub
		
	}

	
	public void beforeGetText(WebElement element, WebDriver driver) {
		System.out.println("Triying to GetText to: "+ element.toString());
		
	}

	
	public void afterGetText(WebElement element, WebDriver driver, String text) {
		System.out.println("Got the  GetText to: "+ element.toString());
		
	}


	
	public void beforeAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}


	
	public void afterAlertAccept(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}


	
	public void afterAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}


	
	public void beforeAlertDismiss(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}


	
	public void beforeNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}


	
	public void afterNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}


	
	public void beforeNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}


	
	public void afterNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		
	}


	
	public void beforeChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		
	}


	public void afterChangeValueOf(WebElement element, WebDriver driver, CharSequence[] keysToSend) {
		// TODO Auto-generated method stub
		
	}



	public void beforeScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}



	public void afterScript(String script, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
	

}
