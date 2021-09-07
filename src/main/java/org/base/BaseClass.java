package org.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	
	static WebDriver driver;

	public static void browserlaunch(String browser) {

		if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\ecclipseworkspace\\Maven\\driver\\chromedriver.exe");
			driver= new ChromeDriver();
		}

		else if(browser.equals("Firefox")){
			System.setProperty("webdriver.gecko.driver", "E:\\ecclipseworkspace\\Maven\\driver\\geckodriver.exe");
			driver= new FirefoxDriver();
		}

		else {
			System.setProperty("webdriver.ie.driver", "E:\\ecclipseworkspace\\Maven\\driver\\IEDriverServer.exe");
			driver= new InternetExplorerDriver();
		}
	}

	public static void launchurl(String Url) {
		driver.get(Url);
		driver.manage().window().maximize();

	}

	public static void filltext(WebElement ele, String text) {
		ele.sendKeys(text);


	}

	public static void click(WebElement ele) {
		ele.click();

	}
	
	
		
		

	}
	

