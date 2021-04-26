@Smoke_Test

Feature: To verify the Inorganic order placing scenario

  Scenario: To verify the login functionality
    Given I navigate to the LGC WEBSITE URL
    And   I select Inorganic Order
    And   I click on Continue button
    Then I verify Configure custom solution section displayed
    And   I click on Add element Button
    Then I click on Elements section displayed
    And   I select elements from the periodic table
    And   I click on Add to Component List button
    When  I set concentration for the components
    When  I set concentration as "10ml" for the components
    And   I select packaging type,volume,units,analytical technique
    And   I enter Additional notes regarding Order
    Then  I navigate to Customer Details Page
    And   I enter Customer Details
    When  I click on Save & Continue button
    Then  I verify Delivery information page is displayed
    And   I enter billing address details in the Delivery information page
    When  I click the View Summary Button
    Then  I get navigated to the customer information summary page