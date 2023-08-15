@Smoke
  Feature: User can select Currencies

    Scenario: User can select Currencies to make all product with EURO
      Given   user Click on Login button from home page
      And     user Enter valid email "test@example.com"
      And     user Enter valid Password "P@ssw0rd"
      And     user click on Login Button
      When    User can select Euro currency from the dropdown list on the top left of home page
      Then    Make sure that the four products in the home page has been changed from US to Euro