package com.opencart.stepdef;

import org.junit.Assert;

import com.opencart.pages.RegisterPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterStepDef {
	

	RegisterPage page;
		
	@Given("user is on homepage")
	public void user_is_on_homepage() {
	 
		page= new RegisterPage();
	}
	@When("user click register in My Account Drop menu")
	public void user_click_register_in_my_account_drop_menu() throws InterruptedException {
		page.clickMyaccont();
		Thread.sleep(500);
	    page.clickRegister();
	}
	@When("user is on registration page")
	public void user_is_on_registration_page() {
		Assert.assertTrue(page.driver.getTitle().contains("Register Account"));   
	}
	@When("user enters details")
	public void user_enters_details(io.cucumber.datatable.DataTable dataTable) {
		page.enterFirstname("Sanjiv");
		page.enterLastname("kumar");
		page.enterE_mail("sanjiv.kumara485@gmail.com");
	    page.enterTelephone("8889678956");
	    page.enterPassword("Sanjiv123");
	    page.enterConfirmPassword("Sanjiv123");
	    
		
	}
	@When("confirm Privacy Policy Field")
	public void confirm_privacy_policy_field() {
		page.clickCheckbox();
	    
	}
	@When("user clicks on submint button")
	public void user_clicks_on_submint_button() {
		page.clickContinueButton();
		page.clickAgainContinueButton();
	 
	}
	@Then("user is successfully registered")
	public void user_is_successfully_registered() {
		Assert.assertTrue(page.driver.getTitle().contains("My Account"));
		page.close();
	  
	}
	
	// for 2nd scenario by putting all values 
	@When("user enter details")
	public void user_enter_details(io.cucumber.datatable.DataTable dataTable) {
		page.enterFirstname("raju");
		page.enterLastname("kumar");
		page.enterE_mail("raju.kumar@gmail.com");
	    page.enterTelephone("8989898919");
	    page.enterPassword("Sanjiv123");
	    page.enterConfirmPassword("Sanjiv123");
	
	}

	
	@When("user select Newsletter option")
	public void user_select_newsletter_option() {
	    page.clickNewsletter();
	   
	}
	
	// 3rd scenario
	@When("user clicks on continue button")
	public void user_clicks_on_continue_button() {
		page.clickContinueButton();
	}
	
	@Then("page displayed with warning message")
	public void page_displayed_with_warning_message() {
	   Assert.assertTrue(page.driver.getTitle().contains("Register Account"));
	}

	// 4th scenario
	@When("user enter details with unmatched password")
	public void user_enter_details_with_unmatched_password(io.cucumber.datatable.DataTable dataTable) {
		page.enterFirstname("raju");
		page.enterLastname("kumar");
		page.enterE_mail("raju.kumar@gmail.com");
	    page.enterTelephone("8989898919");
	    page.enterPassword("Sanjiv1234");
	    page.enterConfirmPassword("Sanjiv123");
	}

// 5th scenario
	@When("user enter details with wrong email")
	public void user_enter_details_with_wrong_email(io.cucumber.datatable.DataTable dataTable) {
		page.enterFirstname("raju");
		page.enterLastname("kumar");
		page.enterE_mail("rajua.raj@gmailcom");
	    page.enterTelephone("8989898919");
	    page.enterPassword("Sanjiv123");
	    page.enterConfirmPassword("Sanjiv123");
	}


//6th scenario
	@When("user enter details with invalid telephone number")
	public void user_enter_details_with_invalid_telephone_number(io.cucumber.datatable.DataTable dataTable) {
		page.enterFirstname("raju");
		page.enterLastname("kumar");
		page.enterE_mail("raju.kumar@gmailcom");
	    page.enterTelephone("89898913");
	    page.enterPassword("Sanjiv1234");
	    page.enterConfirmPassword("Sanjiv1234");
	}
	
	// 9th scenario
	
	@When("user will not enter confirm password detail")
	public void user_will_not_enter_confirm_password_detail(io.cucumber.datatable.DataTable dataTable) {
		page.enterFirstname("raju");
		page.enterLastname("kumar");
		page.enterE_mail("rajua.raj67@gmail.com");
	    page.enterTelephone("89898913");
	    page.enterPassword("Sanjiv1234");
	 
	}

	
	
}
