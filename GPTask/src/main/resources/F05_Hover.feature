@Smoke

Feature: User need to select random one of the three main categories

  Scenario: User need to hover random one of the three main categories and select random one of the three sub-categories

    Given   user Click on Login button from home page
    And     user Enter valid email "test@example.com"
    And     user Enter valid Password "P@ssw0rd"
    And     user click on Login Button
    When    User Hover random main category and Click on one random Sub-Category
    Then    User get text of the page title