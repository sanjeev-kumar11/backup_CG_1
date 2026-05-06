package com.opencart.page;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.opencart.customexception.BrowserNotSupportedException;

public class BasePage {
	
	public static WebDriver driver;
	Properties prop;
	String browsername;

	public BasePage() {
		// to initialize the driver: as per config property
		try {
		prop=new Properties();
			prop.load(new FileInputStream("config/config.properties"));
			
		 browsername= prop.getProperty("browser");
		 if (browsername.equalsIgnoreCase("chrome"))
		 {
		 ChromeOptions o =  new ChromeOptions();
			o.addArguments("--disable-notifications");
			 System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
			  driver=new ChromeDriver(o);
		 }
		 else if(browsername.equalsIgnoreCase("firefox"))
		 {
			 System.setProperty("webdriver.geckodriver.driver", "driver/geckodriver.exe");
			  driver=new FirefoxDriver();
		 }
		 else 
		 {
			 throw new BrowserNotSupportedException("Browser is not supported for esting this page");
		 }	
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BrowserNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}	
	
	public void init()
	{
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//button[@title=\"Accept All\"]")).click();
	}
	public void close()
	{
		driver.close();
	}
	
	

}
