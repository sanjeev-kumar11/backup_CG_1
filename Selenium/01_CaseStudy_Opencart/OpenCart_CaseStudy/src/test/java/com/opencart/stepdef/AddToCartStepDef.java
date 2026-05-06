package com.opencart.stepdef;

import com.opencart.pages.AddToCart;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCartStepDef {
	
	AddToCart Page3;

	@Given("user is on Homepage")
	public void user_is_on_homepage() {
		Page3=new AddToCart();
	  
	}
	@When("user enter any existing Product name {string} into the Search text box field")
	public void user_enter_any_existing_product_name_into_the_search_text_box_field(String prod) {
	   Page3.clickSearchBox(prod);
	}

	@When("click on the button having search icon and Product displayed in the Search results")
	public void click_on_the_button_having_search_icon_and_product_displayed_in_the_search_results() {
		Page3.clickBox();

	}
	@Then("user click on Add to Cart button in the displayed Product Display page")
	public void user_click_on_add_to_cart_button_in_the_displayed_product_display_page() {
		Page3.clickAddToCart();
	    
	}
	@Then("click on the shopping cart to show your product in cart")
	public void click_on_the_shopping_cart_to_show_your_product_in_cart() {
		Page3.clickShoppingCart();
	   
	}

	// 2nd scenario
	
	@When("user click on wishlist button and go wishlist page")
	public void user_click_on_wishlist_button_and_go_wishlist_page() {
     Page3.clickwishList();
     Page3.clickwishListBtn();

	}
	@When("user enters \"\"sanjiv.kumar@gmail.com\"\" and \"\"Sanjiv123\"\"")
	public void user_enters_sanjiv_kumara_gmail_com_and_sanjiv123() {
		Page3.enterUserName("sanjiv.kumar@gmail.com");
		Page3.enterPassword("Sanjiv123");
		Page3.clickSubmitButton();
	   
	}
	@Then("click on the shopping cart in wishcart to show your product in cart")
	public void click_on_the_shopping_cart_in_wishcart_to_show_your_product_in_cart() {
       Page3.clickwishShopCart();
	}

	
	@When("user go to feature section and click add to cart")
	public void user_go_to_feature_section_and_click_add_to_cart() {
		Page3.clickhomeAddToCart();
	}
	
	
	
	
	
	
	
}
