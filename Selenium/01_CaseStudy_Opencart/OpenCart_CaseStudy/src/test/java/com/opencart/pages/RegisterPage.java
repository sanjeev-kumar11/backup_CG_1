package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.opencart.page.BasePage;

public class RegisterPage extends BasePage {
	
	
	
	
	// Data members: all ui web ele on the login page
	
		@FindBy(xpath = "//span[contains(text(),'My Account')]")
		WebElement Myaccont;
		@FindBy(xpath = "//a[contains(text(),'Register')]")
		WebElement Register;
		@FindBy(xpath = "//input[@id='input-firstname']")
		WebElement Firstname;
		@FindBy(xpath = "//input[@id='input-lastname']")
		WebElement Lastname;
		@FindBy(xpath = "//input[@id='input-email']")
		WebElement E_mail;
		@FindBy(xpath = "//input[@id='input-telephone']")
		WebElement Telephone;
		@FindBy(xpath = "//input[@id='input-password']")
		WebElement password;
		@FindBy(xpath = "//input[@id='input-confirm']")
		WebElement ConfirmPassword;
		@FindBy(xpath = "//input[@type=\"checkbox\"]")
		WebElement Checkbox;
		@FindBy(xpath = "//input[@type=\"submit\"]")
		WebElement ContinueButton;
		@FindBy(xpath = "//div/a[@class=\"btn btn-primary\"]")
		WebElement AfterContinue;
		@FindBy(xpath = "//input[@type=\"radio\"][@value=\"0\"]")
		WebElement Newsletter;
			
			
		public RegisterPage()
		{
			super();
			//username=driver.findElement(By.xpath(""));
			init(); // to load url from base page
			
			PageFactory.initElements(driver, this);
		}
		
		
		// main functions
		public void clickMyaccont()
		{
			Myaccont.click();
			}
		public void clickRegister()
		{
			Register.click();
			}
		public void enterFirstname(String fname)
		{ 
			Firstname.sendKeys(fname);
		}
		public void enterLastname(String lname)
		{ 
			Lastname.sendKeys(lname);
		}
		public void enterE_mail(String mail)
		{ 
			E_mail.sendKeys(mail);
		}
		public void enterTelephone(String number)
		{ 
			Telephone.sendKeys(number);
		}
		public void enterPassword(String passw)
		{
			password.sendKeys(passw);		
		}
		public void enterConfirmPassword(String passwrd)
		{
			ConfirmPassword.sendKeys(passwrd);		
		}
		public void clickCheckbox()
		{
			Checkbox.click();
			}
		public void clickContinueButton()
		{
			ContinueButton.click();
			}
		public void clickNewsletter()
		{
			Newsletter.click();
			}
	
		public void clickAgainContinueButton()
		{
			AfterContinue.click();
			}
}
