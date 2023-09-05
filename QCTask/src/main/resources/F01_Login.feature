@Smoke

  Feature:login to website with valid credentials

    Scenario: Need to login with valid credentials
      Given   Enter User Name "standard_user"
      And     Enter Password "secret_sauce"
      When    Click on Login Button
      Then    User logged in successfully