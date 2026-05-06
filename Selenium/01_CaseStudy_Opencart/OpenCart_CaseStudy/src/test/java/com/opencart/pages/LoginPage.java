package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.opencart.page.BasePage;

public class LoginPage extends BasePage{
	
	// Data members: all ui web ele on the login page
	
	
	@FindBy(xpath = "//span[contains(text(),'My Account')]")
	WebElement Myaccont;
	@FindBy(xpath = "//body/nav[@id='top']/div[1]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]")
	WebElement LoginBtn;
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement username;
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement password;
	@FindBy(xpath = "//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]")
	WebElement submitbtn;
	@FindBy(xpath = "//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[2]/a[1]")
	WebElement forgetPass;
	
	public LoginPage()
	{
		super();
		
		init();// to load URL from base page
		
		PageFactory.initElements(driver, this);
	}
	
	// main functions
	public void clickMyaccont()
	{
		Myaccont.click();
		}
	public void clickLogin()
	{
		LoginBtn.click();
		}
	
	public void enterUserName(String name)
	{ 
		username.sendKeys(name);
	}
	public void enterPassword(String passw)
	{
		password.sendKeys(passw);
	}
	public void clickSubmitButton()
	{
		submitbtn.click();
		}
	public void clickforgetPass()
	{
		forgetPass.click();
		}
	
	
	public void clickNav()
	{
		Navigation nav=driver.navigate();
		 nav.back();
		 
		}
	
	
	
	
	
	

}

	
	
	
	


