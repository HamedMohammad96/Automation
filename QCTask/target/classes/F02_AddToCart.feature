@Smoke

  Feature: User Need to add item to the cart

    Scenario: Add one item to the cart
      Given   Enter User Name "standard_user"
      And     Enter Password "secret_sauce"
      When    Click on Login Button
      Then    Click on add to cart button for the first item
