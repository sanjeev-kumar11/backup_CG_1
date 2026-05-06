@Registration
Feature: Registration feature 
@Sucessfull_Registration_01
Scenario: possitive regaration scenario(only the Mandatory fields)
Given user is on homepage
When user click register in My Account Drop menu
And user is on registration page
When user enters details
|First_Name|sanjeev|
|Last_Name|kumar|
|E-Mail|sanjiv.kumar1@gmail.com|
|Telephone|8989898998|
|Pass|Sanjiv123|
|Pass_con|Sanjiv123|
And confirm Privacy Policy Field
And user clicks on submint button
Then user is successfully registered

@Sucessfull_Registration_02
#all fields
Scenario Outline: possitive registion scenario
Given user is on homepage
When user click register in My Account Drop menu
And user is on registration page
When user enter details
|First_Name|raju|
|Last_Name|kumar|
|E_Mail|raju.kumar@gmail.com|
|Telephone|8989898919|
|Pass|Sanjiv123|
|Pass_con|Sanjiv123|
And user select Newsletter option
And confirm Privacy Policy Field
And user clicks on submint button
Then user is successfully registered


@Invalid_Registration_03
#all fields
Scenario Outline: do not provide any fields in the Register Account page
Given user is on homepage
When user click register in My Account Drop menu
And user is on registration page
And user clicks on continue button
Then page displayed with warning message

@Password_Not_Matched_04
Scenario: password not matched scenario
Given user is on homepage
When user click register in My Account Drop menu
And user is on registration page
When user enter details with unmatched password
|First_Name|sanjeev|
|Last_Name|kumar|
|E-Mail|sanjiv.kumar1@gmail.com|
|Telephone|8989898998|
|Pass|Sanjiv1234|
|Pass_con|Sanjiv123|
And confirm Privacy Policy Field
And user clicks on continue button
Then page displayed with warning message

@invalid_email_address_05 
Scenario: invalid_e-mailId_scenario
Given user is on homepage
When user click register in My Account Drop menu
And user is on registration page
When user enter details with wrong email
|First_Name|sanjeev|
|Last_Name|kumar|
|E-Mail|sanjiv.kumar1@gmail.com|
|Telephone|8989898998|
|Pass|Sanjiv1234|
|Pass_con|Sanjiv123|
And confirm Privacy Policy Field
And user clicks on continue button
Then page displayed with warning message


@invalid_phone_number_06
Scenario: invalid phone no scenario
Given user is on homepage
When user click register in My Account Drop menu
And user is on registration page
When user enter details with invalid telephone number
|First_Name|sanjeev|
|Last_Name|kumar|
|E-Mail|sanjiv.kumar1@gmail.com|
|Telephone|8989898998|
|Pass|Sanjiv1234|
|Pass_con|Sanjiv123|
And confirm Privacy Policy Field
And user clicks on continue button
Then page displayed with warning message



@Invalid_Registration_07
Scenario: without selecting the PrivacyPolicy checkbox option
Given user is on homepage
When user click register in My Account Drop menu
And user is on registration page
When user enters details
|First_Name|sanjeev|
|Last_Name|kumar|
|E-Mail|sanjiv.kumar1@gmail.com|
|Telephone|8989898998|                            
|Pass|Sanjiv1234|
|Pass_con|Sanjiv123|
And user clicks on continue button
Then page displayed with warning message

@Invalid_Registration_08
Scenario: by providing the existing account details (existing email Id) 
Given user is on homepage
When user click register in My Account Drop menu
And user is on registration page
When user enters details
|First_Name|sanjeev|
|Last_Name|kumar|
|E-Mail|sanjiv.kumar1@gmail.com|
|Telephone|8989898998|                            
|Pass|Sanjiv1234|
|Pass_con|Sanjiv123|                      
And confirm Privacy Policy Field
And user clicks on continue button
Then page displayed with warning message



@Invalid_Registration_09
Scenario: filling Password field and not filling Password Confirm field
Given user is on homepage
When user click register in My Account Drop menu
And user is on registration page
When user will not enter confirm password detail
|First_Name|sanjeev|
|Last_Name|kumar|
|E-Mail|sanjiv.kumar1@gmail.com|
|Telephone|8989898998|                            
|Pass|Sanjiv1234|                    
And confirm Privacy Policy Field
And user clicks on continue button
Then page displayed with warning message


@UI_RegistratioPage_10
Scenario: the UI of the Register Account page
Given user is on homepage
When user click register in My Account Drop menu
And user is on registration page

