package com.qa.testbase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TestBase {

	public static Properties properties;
	public static FileInputStream file;
	protected static WebDriver driver;

	public static Properties loadProperties(String filePath) {
		try {
			file = new FileInputStream(new File(filePath));
			properties = new Properties();
			properties.load(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return properties;
	}
	
	public static WebDriver launchBrowser() {
		Properties properties=loadProperties(System.getProperty("user.dir") + "\\src\\main\\java\\com\\qa\\config\\config.properties");
		String browser=properties.getProperty("browser");
		
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", properties.getProperty("chrome_path"));
			driver= new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("gecko")) {
			System.setProperty("webdriver.gecko.driver", properties.getProperty("gecko_path"));
			driver= new FirefoxDriver();					
		}
		else if(browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", properties.getProperty("ie_path"));
			driver= new InternetExplorerDriver();					
		}
		else {
			System.out.println("Invalid browser specified in properties file !!!");
		}
		driver.get(properties.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Long.parseLong((String) properties.get("implicit_wait")), TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(Long.parseLong((String) properties.get("page_load_timeout")), TimeUnit.SECONDS);
		return driver;
		
	}

	public static void main(String[] args) {
		/*System.out.println(System.getProperty("user.dir"));
		Properties properties=loadProperties(System.getProperty("user.dir") + "\\src\\main\\java\\com\\qa\\config\\config.properties");
		System.out.println(properties.getProperty("URL"));
//		returns null list in case if the given property is not present
		System.out.println(properties.getProperty("UR"));
		System.out.println(properties.getProperty("browser"));*/
		launchBrowser();
	
	}
}
