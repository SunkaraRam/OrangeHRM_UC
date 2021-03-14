Feature: Login Search

@primus1234
 Scenario Outline: Title of your scenario
    Given I launch PrimusBankURL in Google Chrome
    When I enter username <username>
    And I enter password <password>
    And I click on Login button
    Then I validate title
    Then I click on Logout
    And Close the browser
Examples: 
	
	|username|password|
	|Admin	   | Admin  |
	|Admin     | RamSunkara|