Feature: Login Functionalities

  @smoke
  Scenario: Valid Admin Login
  # Given open the browser and launch HRMS application
  When user enters valid email and password
  And click on login button
  Then user is logged in successfully
  # Then close the browser

  #Please check the example of Regular Expression below
  @smoke2
  Scenario: Valid Admin Login
  # Given open the browser and launch HRMS application
  When user enters valid "ADMIN" and "Hum@nhrm123"
  And click on login button
  Then user is logged in successfully
  # Then close the browser

