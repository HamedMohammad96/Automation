@Smoke

Feature: Need to test Slider in home page

  Scenario: It's expected when click on first slider to direct user to this url https://demo.nopcommerce.com/nokia-lumia-1020
    Given   user Click on Login button from home page
    And     user Enter valid email "test@example.com"
    And     user Enter valid Password "P@ssw0rd"
    And     user click on Login Button
    When    user click on first page home slider
      Then    there is no changing in the Url




    Scenario: It's expected when click on second slider to direct user to this url https://demo.nopcommerce.com/iphone-6
      Given   user Click on Login button from home page
      And     user Enter valid email "test@example.com"
      And     user Enter valid Password "P@ssw0rd"
      And     user click on Login Button
      When    user click on Second page home slider
      Then    The URL doesn't change