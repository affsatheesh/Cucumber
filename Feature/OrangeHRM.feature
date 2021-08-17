Feature: OrangeCRM Login Test
  Scenario: logo presence on OrangeCRM Homepage
    Given I Lunch chrome browser
    When I open HRM HomePage
    Then I Verify logo present on page
    And Close Browser

  Scenario Outline: Login DataDriven
    Given I Lunch chrome browser
    When user Opens the URL "https://opensource-demo.orangehrmlive.com/"
    And User Enters the Username as "<username>" and Password as "<password>"
    And Click on Login
    Then I Verify the Homepage Displyed or Not
    And Click on Logout
    And Close Browser

    Examples:
    |username|password|
    |Admin   |admin123|
    |admin   |admin334|


  Scenario Outline: Login DataDriven using POM
    Given I Lunch chrome browsers
    When user Opens the Test URL "https://opensource-demo.orangehrmlive.com/"
    And User Enters the Login Username as "<username>" and Login Password as "<password>"
    And Click on Login button
    Then I Verify the Homepage is Displyed or Not
    And Close The Browser

    Examples:
      |username|password|
      |Admin   |admin123|
      |admin   |admin334|