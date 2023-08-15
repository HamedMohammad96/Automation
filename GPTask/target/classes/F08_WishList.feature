@Smoke
  Feature: Adding product to wishlist

    Scenario: click on wishlist button on this product "HTC One M8 Android L 5.0 Lollipop"
      Given   user Click on Login button from home page
      And     user Enter valid email "test@example.com"
      And     user Enter valid Password "P@ssw0rd"
      And     user click on Login Button
      When    user click on wishlist button of product
      Then    user found success message



    Scenario: click on wishlist button on same this product "HTC One M8 Android L 5.0 Lollipop"
      Given   user Click on Login button from home page
      And     user Enter valid email "test@example.com"
      And     user Enter valid Password "P@ssw0rd"
      And     user click on Login Button
      And     user click on wishlist button of product
      When    user click on wishlist tab on the top of the page
      Then    user check that the qty of list is bigger than zero