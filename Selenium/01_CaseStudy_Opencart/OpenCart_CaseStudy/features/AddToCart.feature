@AddToCart
Feature: Addind product to cart
@Successful_Adding_01
Scenario: adding the product to Cart from Product Display Page
Given  user is on Homepage 
When user enter any existing Product name <prod> into the Search text box field
And click on the button having search icon and Product displayed in the Search results
Then user click on Add to Cart button in the displayed Product Display page
And click on the shopping cart to show your product in cart
Examples:
|prod|
|"iMac"|

@Successful_Adding_02
Scenario: adding the product to Cart from Wish List Page
Given  user is on Homepage 
When user enter any existing Product name <prod> into the Search text box field
And click on the button having search icon and Product displayed in the Search results
And user click on wishlist button and go wishlist page
And user enters "<un>" and "<pass>" 
And click on the shopping cart in wishcart to show your product in cart
Examples:
|prod|un|pass|
|"iMac"|"sanjiv.kumar@gmail.com"|"Sanjiv123"|


@Successful_Adding_03
Scenario: adding the product to Cart from the Products displayed in the Featured in homepage
Given  user is on Homepage 
When user go to feature section and click add to cart 
Then click on the shopping cart to show your product in cart


















