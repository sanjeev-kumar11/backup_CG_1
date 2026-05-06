@Login
Feature: Login feature
@positive_Login_01
Scenario: Positive login scenario
Given  user is on login page
When user enters "<un>" and "<pass>"
And user click on submit
Then Account is logged in
Examples:
|un|pass|
|sanjiv.kumara75@gmail.com|Sanjiv123|



@Negative_Login_02
Scenario: Negative login scenario
Given  user is on login page
When user enters "<un>" and "<pass>"
And user click on submit
Then Remains on same page with warning message
Examples:
|un|pass|
|sanjiv.kura75@gmail.com|Saiv123|


@Negative_Login_03
Scenario: Negative login scenario (using invalid email address and valid Password)
Given  user is on login page
When user enters "<un>" and "<pass>"
And user click on submit
Then Remains on same page with warning message
Examples:
|un|pass|
|sanjiv.kura75@gmail.com|Sanjiv123|


@Negative_Login_04
Scenario: Negative login scenario (using valid email address and invalid Password)
Given  user is on login page
When user enters "<un>" and "<pass>"
And user click on submit
Then Remains on same page with warning message
Examples:
|un|pass|
|sanjiv.kumar75@gmail.com|Sanefs|


@Negative_Login_05
Scenario: Negative login scenario ( without providing any credentials)
Given  user is on login page
When user enters "<un>" and "<pass>"
And user click on submit
Then Remains on same page with warning message
Examples:
|un|pass|
|||



@Forgottten_password_06
Scenario: Forgotten Password link is available in the Login page and is working
Given  user is on login page
When user click Forgotten Password


@Positive_Login_07
Scenario: Positive login scenario and use of browser back
Given  user is on login page
When user enters "<un>" and "<pass>"
And user click on submit
Then Account is logged in
Then Browser back to previous page
Examples:
|un|pass|
|sanjiv.kumara75@gmail.com|Sanjiv123|


@UI_Of_Login_Page_09
Scenario: UI of the Login page
Given  user is on login page


