#Author: sannithreddy075@gmail.com
#Keywords Summary : This to test Login functionality
Feature: Login

  Scenario Outline: Login with valid credentials
    Given Open browser
    When user enter <usname> and <psword>
    And click on login button
    When verify home page
    Then logout

    Examples: 
      | usname | psword   |
      | Admin  | admin123 |
