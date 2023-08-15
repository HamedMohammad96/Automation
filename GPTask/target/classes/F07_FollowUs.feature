@Smoke

  Feature: Click on Every follow us button

    Scenario: user opens facebook link
      Given   user Click on Login button from home page
      And     user Enter valid email "test@example.com"
      And     user Enter valid Password "P@ssw0rd"
      And     user click on Login Button
      When    user open facebook link
      Then    "https://www.facebook.com/nopCommerce" is opened in new tab 1

    Scenario: user opens twitter link
      Given   user Click on Login button from home page
      And     user Enter valid email "test@example.com"
      And     user Enter valid Password "P@ssw0rd"
      And     user click on Login Button
      When    user opens twitter link
      Then    "https://twitter.com/nopCommerce" is opened in new tab 2



    Scenario: user opens rss link
      Given   user Click on Login button from home page
      And     user Enter valid email "test@example.com"
      And     user Enter valid Password "P@ssw0rd"
      And     user click on Login Button
      When    user opens rss link
      Then    "https://demo.nopcommerce.com/new-online-store-is-open" is opened in new tab 3



    Scenario:user opens youtube link
      Given   user Click on Login button from home page
      And     user Enter valid email "test@example.com"
      And     user Enter valid Password "P@ssw0rd"
      And     user click on Login Button
      When    user opens youtube link
      Then    "https://www.youtube.com/user/nopCommerce" is opened in new tab
