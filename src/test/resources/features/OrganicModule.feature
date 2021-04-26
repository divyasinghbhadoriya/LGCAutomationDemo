@Smoke_Test

Feature: To verify the organic order placing scenario

  Scenario: To verify the login functionality
    Given I navigate to the LGC WEBSITE URL
    When   I select Organic Order
    And   I click on Continue button
    And   I browse select the excel file into the Add component
    And   I click on Add to Components button
    Then  I verify Component section is displayed
    When  I set concentration for the components
    And   I select packaging type,volume,units,quality level
    Then I verify Additional notes section displayed
    When  I enter Additional notes regarding Order
    Then  I navigate to Customer Details Page
    And   I enter Customer Details
    When  I click on Save & Continue button
    Then  I verify Delivery information page is displayed
    When   I enter Delivery Details
    And  I click the View Summary Button
    Then  I get navigated to the customer information summary page

