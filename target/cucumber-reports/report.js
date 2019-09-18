$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("PrimusBankLogin.feature");
formatter.feature({
  "line": 1,
  "name": "Login Search",
  "description": "",
  "id": "login-search",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Title of your scenario",
  "description": "",
  "id": "login-search;title-of-your-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@primus"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I launch PrimusBankURL in Google Chrome",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I enter Username",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I enter Password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I validate title",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "I click on Logout",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.i_launch_PrimusBankURL_in_Google_Chrome()"
});
formatter.result({
  "duration": 5867620138,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitions.i_enter_Username()"
});
formatter.result({
  "duration": 160101393,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitions.i_enter_Password()"
});
formatter.result({
  "duration": 136404924,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitions.i_click_on_Login_button()"
});
formatter.result({
  "duration": 688370651,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitions.i_validate_title()"
});
formatter.result({
  "duration": 11766756,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitions.i_click_on_Logout()"
});
formatter.result({
  "duration": 740680539,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitions.close_the_browser()"
});
formatter.result({
  "duration": 1600772,
  "error_message": "cucumber.api.PendingException: TODO: implement me\r\n\tat stepDefinitions.stepDefinitions.close_the_browser(stepDefinitions.java:203)\r\n\tat ✽.And Close the browser(PrimusBankLogin.feature:11)\r\n",
  "status": "pending"
});
formatter.uri("UserCreation.feature");
formatter.feature({
  "line": 1,
  "name": "User Creation in OrangeHRM",
  "description": "",
  "id": "user-creation-in-orangehrm",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Verify UserCreation in Orangehrm",
  "description": "",
  "id": "user-creation-in-orangehrm;verify-usercreation-in-orangehrm",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@orange"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I Launch OrangeHRM on FireFox",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I Enter Username in UsernameField",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter password in PasswordField",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I click on LoginButton",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "I validate title of the page",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "I move mouse on Admin",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I click on Usermanagement",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "I Click Users",
  "keyword": "Then "
});
formatter.step({
  "line": 22,
  "name": "I Click Addbutton",
  "keyword": "Then "
});
formatter.step({
  "line": 24,
  "name": "I Select User Role",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "I Enter EmployeeName",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I Enter Username",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "I select status of the Employee",
  "keyword": "Then "
});
formatter.step({
  "line": 32,
  "name": "I Enter passwored",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "I Enter ConfirmPassword",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "I wait For Password matching",
  "keyword": "When "
});
formatter.step({
  "line": 38,
  "name": "I click On Save button",
  "keyword": "Then "
});
formatter.step({
  "line": 40,
  "name": "I am Close The Browser",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinitions.i_Launch_OrangeHRM_on_FireFox()"
});
formatter.result({
  "duration": 6791605044,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitions.i_Enter_Username_in_UsernameField()"
});
formatter.result({
  "duration": 150173931,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitions.i_enter_password_in_PasswordField()"
});
formatter.result({
  "duration": 117686067,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitions.i_click_on_LoginButton()"
});
formatter.result({
  "duration": 3337511585,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitions.i_validate_title_of_the_page()"
});
formatter.result({
  "duration": 15568204,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitions.i_move_mouse_on_Admin()"
});
formatter.result({
  "duration": 3294688098,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitions.i_click_on_Usermanagement()"
});
formatter.result({
  "duration": 158481600,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitions.i_Click_Users()"
});
formatter.result({
  "duration": 2620918198,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitions.i_Click_Addbutton()"
});
formatter.result({
  "duration": 1135924795,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitions.i_Select_User_Role()"
});
formatter.result({
  "duration": 529127733,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitions.i_Enter_EmployeeName()"
});
formatter.result({
  "duration": 678449359,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitions.i_Enter_Username()"
});
formatter.result({
  "duration": 181885570,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitions.i_select_status_of_the_Employee()"
});
formatter.result({
  "duration": 89609322,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitions.i_Enter_passwored()"
});
formatter.result({
  "duration": 263552717,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitions.i_Enter_ConfirmPassword()"
});
formatter.result({
  "duration": 213213722,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitions.i_wait_For_Password_matching()"
});
formatter.result({
  "duration": 2000811182,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitions.i_click_On_Save_button()"
});
formatter.result({
  "duration": 145910346,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinitions.i_am_Close_The_Browser()"
});
formatter.result({
  "duration": 734942639,
  "status": "passed"
});
});