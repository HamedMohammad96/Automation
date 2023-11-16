@Smoke

  Feature: Login using the newly created account

    Scenario: Need To Login with Valid Data
      Given User click on Account button
      And   User Click on Sign In Button
      And   User fills email "hamed.mohammad96@gmail.com"
      And   User click on continue button
      When  User Enter Valid Password "Hamed@12345"
      Then  User Click On Login Button