package base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

import io.github.bonigarcia.wdm.WebDriverManager;
import utility.Test_Util;
import utility.WebEventListener;

public class Test_Base {
	public static WebDriver driver;
	public static Properties prop; 
	public static EventFiringWebDriver e_driver;
	public static WebEventListener eventListener;

	public Test_Base() throws IOException {
		prop=new Properties();
		try {
			FileInputStream fi=new FileInputStream("D:\\My Projects\\Parabank\\src\\main\\java\\config_Proprties\\cofig.properties");
			prop.load(fi);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public static void initialization() throws IOException {
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			//chrome
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browserName.equals("FF")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		e_driver=new EventFiringWebDriver(driver);
		eventListener=new WebEventListener();
		e_driver.register(eventListener);
		driver=e_driver;
		
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Test_Util.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Test_Util.IMLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
	}
	public  void failed(String testMethoName) throws InterruptedException, IOException 
	{
		Thread.sleep(2000);
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(file, new File("./Parabank-Fail-TestCases/"+"Failed Test Cases  "+testMethoName+"_"+".png"));
	}
	public void pass(String testMethoName) throws IOException, InterruptedException 
	{
		Thread.sleep(2000);
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(file, new File("./Parabank-Pass-TestCases/"+"Pass Test Cases "+testMethoName+"_"+".png"));
	}

}
