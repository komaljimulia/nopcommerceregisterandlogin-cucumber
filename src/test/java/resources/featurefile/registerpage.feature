Feature: Register functionality test
  As a user i should register successfully

  Scenario: User should able to register successfully
    Given I m on homepage of nopcommerce
    When I navigate to RegisterLink
    And I select gender 'Male'
    And I select Firstname "Tinker"
    And I select Lastname "Bell"
    And I select Date "11"
    And I select Month "November"
    And I select Year "2011"
    And I enter Email "emailId"
    And I enter password "tinker"
    And I enter confirmPassword "tinker"
    And I click on 'Registration Button'
    Then I should see message "Your registration completed"
    And I click on logoutLink
