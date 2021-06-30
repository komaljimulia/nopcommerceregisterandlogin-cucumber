Feature: Login functionality test
  As a user i want to login successfully
@Smoke
Scenario: User should navigate to login page successfully
  Given I m on homepage of nopcommerce
  When I click on login link
  Then I should navigate to login page successfully

@Sanity
  Scenario: User should login successfully with valid credentials
    Given I m on homepage of nopcommerce
    When I click on login link
    And I enter email "primetime@gmail.com"
    And I enter password of login "abc123"
    And I click on login button
    Then I should login successfully

  @Regression
    Scenario Outline: verify the error message with invalid credentials
      Given I m on homepage of nopcommerce
      When I click on login link
      And I enter email "<email>"
      And I enter password "<password>"
      And I click on login button
      Then I should see the error message "<errorMessage>"
      Examples:
        |email|password|errorMessage|
        |abcd123@gmail.com|xyz123|Login was unsuccessful. Please correct the errors and try again.|
        |xyz123@gmail.com | |Login was unsuccessful. Please correct the errors and try again.|
        |adfafasd@gmail.com|xyz123|Login was unsuccessful. Please correct the errors and try again.|


