Feature: OrangeCRM Login page Test
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