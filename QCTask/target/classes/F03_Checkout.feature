@Smoke

  Feature: Checkout the item from my cart and logout

    Scenario: Checkout the item and logout
      Given   Enter User Name "standard_user"
      And     Enter Password "secret_sauce"
      And     Click on Login Button
      And     Click on My Cart Button
      And     Click on Checkout Button
      And     Enter First, Last name and Zip Code
      And     Click on Button Continue
      When    Click on Button Finish
      Then    Click on Logout Button