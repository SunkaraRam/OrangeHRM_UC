Feature: User Creation in OrangeHRM

@orange112233
Scenario Outline: Verify UserCreation in Orangehrm

When I Launch OrangeHRM on FireFox

And I Enter Username <username1> in UsernameField

And I enter password <password1> in PasswordField 

When I click on LoginButton

Then I validate title of the page

When I move mouse on Admin

Then I click on Usermanagement

Then I Click Users

Then I Click Addbutton

Then I Select User Role

And I Enter EmployeeName

And I Enter Username

Then I select status of the Employee

And I Enter passwored

And I Enter ConfirmPassword

When I wait For Password matching

Then I click On Save button

And I am Close The Browser

Examples: 
	
	|username1|password1|
	|sunkar1332  |Qedge123!@#|
	

