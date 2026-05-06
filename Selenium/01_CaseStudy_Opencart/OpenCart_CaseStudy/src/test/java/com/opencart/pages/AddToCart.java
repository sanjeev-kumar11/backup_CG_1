package com.opencart.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.opencart.page.BasePage;

public class AddToCart extends BasePage{
	
	@FindBy(xpath = "//header/div[1]/div[1]/div[2]/div[1]/input[1]")
	WebElement searchBox;
	@FindBy(xpath = "//header/div[1]/div[1]/div[2]/div[1]/span[1]/button[1]")
	WebElement searchBoxClk;
	@FindBy(xpath = "//span[contains(text(),'Add to Cart')]")
	WebElement addToCart;
	@FindBy(xpath = "//span[contains(text(),'Shopping Cart')]")
	WebElement ShoppingCart;
	@FindBy(xpath = "//body/div[@id='product-search']/div[1]/div[1]/div[3]/div[1]/div[1]/div[2]/div[2]/button[2]")
	WebElement wishList;
	@FindBy(xpath = "//*[@id=\"wishlist-total\"]/span")
	WebElement wishListBtn;
	@FindBy(xpath = "//*[@id=\"content\"]/div[1]/table/tbody/tr/td[6]/button/i")
	WebElement wishShopCart;
	@FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/div/div[3]/button[1]")
	WebElement homeAddToCart;
	
	
	
	@FindBy(xpath = "//input[@id='input-email']")
	WebElement username;
	@FindBy(xpath = "//input[@id='input-password']")
	WebElement password;
	@FindBy(xpath = "//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]")
	WebElement submitbtn;
	
	public AddToCart()
	{
		super();
		
		init();// to load URL from base page
		
		PageFactory.initElements(driver, this);
	}
	
	// main functions
	public void clickSearchBox(String prod)
	{
		searchBox.sendKeys(prod);
		
		}
	public void clickBox()
	{
		searchBoxClk.click();
		}
	public void clickAddToCart()
	{
		addToCart.click();
		}
	public void clickShoppingCart()
	{
		ShoppingCart.click();
		}
	public void clickwishList()
	{
		wishList.click();
		}
	public void clickwishListBtn()
	{
		wishListBtn.click();
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
	public void clickwishShopCart()
	{
		wishShopCart.click();
		}
	public void clickhomeAddToCart()
	{
		homeAddToCart.click();
		}
	
	
	
	
	

}
