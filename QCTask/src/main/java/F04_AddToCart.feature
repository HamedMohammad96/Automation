@Smoke

  Feature: Add two Items And verify the Cart and subtotal of these items

    Scenario: Need to Add two items to the cart and verify it happen correctly
      Given User Click On Add to Cart Button For two Items
      When  User Click On Cart Button To Verify adding the two items
      Then  Calculate the two items price and compare with subtotal