Feature:  Validation login functionality

  @smoke
  Scenario: Success login
  Given open login page
    When user enter username atrostyanko@gmail.com and password Qwertyu_1
    * user click login button
    Then dashboard page is displayed

  @gui
  @regression
  Scenario: Incorrect login (invalid username)
    Given open login page
    When user enter username atrostyanko2@gmail.com and password Qwertyu_1
    * user click login button
    Then error Email/Login or Password is incorrect. id displayed

  @api
  Scenario: Incorrect login (invalid password)
    Given open login page
    When user enter username atrostyanko@gmail.com and password Qwertyu_2
    * user click login button
    Then error Email/Login or Password is incorrect. id displayed

