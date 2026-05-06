package com.opencart.stepdef;

import org.junit.Assert;

import com.opencart.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDef {
	 
	 LoginPage page2;
	
	@Given("user is on login page")
	public void user_is_on_login_page() throws InterruptedException {
		page2= new LoginPage();
		page2.clickMyaccont();
		Thread.sleep(500);
	    page2.clickLogin();
	   
	}
	@When("user enters {string} and {string}")
	public void user_enters_and(String name, String pass) {
	   page2.enterUserName(name);
	   page2.enterPassword(pass);
	}
	@When("user click on submit")
	public void user_click_on_submit() {
		page2.clickSubmitButton();
	 
	}
	@Then("Account is logged in")
	public void account_is_logged_in() throws InterruptedException {
	    Assert.assertTrue(page2.driver.getTitle().contains("My Account"));
	    Thread.sleep(700);
		   page2.close();
	}

// 2nd scenario
	@Then("Remains on same page with warning message")
	public void remains_on_same_page_with_warning_message() throws InterruptedException {
		Assert.assertTrue(page2.driver.getTitle().contains("Account Login"));
		 Thread.sleep(700);
		   page2.close();
	}
	
	
	// 3rd scenario
	@When("user click Forgotten Password")
	public void user_click_forgotten_password() throws InterruptedException {
		page2.clickforgetPass();
		 Thread.sleep(700);
		   page2.close();
	
	}
	
	
	// 7th scenario
	@Then("Browser back to previous page")
	public void browser_back_to_previous_page()  {
	   page2.clickNav();
//	   Thread.sleep(500);
//	   page2.close();
	}

	
}
