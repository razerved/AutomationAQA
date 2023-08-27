@gui
Feature: Validation login functionality

  Scenario: Success Login
    Given open login page
    When user enter username standard_user and password secret_sauce
    Then productsPage page is displayed
    * user choose goods 2
    Then basketPage page is displayed
    * user out of the basket goes to the deal
    Then checkoutPage is displayed
    * user fills data firstname Han lastname  Solo zipcode  12345
    Then finishPage is displayed
    * user click finishButton
    Then completePage is displayed



