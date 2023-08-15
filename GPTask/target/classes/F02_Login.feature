@Smoke

  Feature: User can login with his email and password

    Scenario: user login with email and password
      Given   user Click on Login button from home page
      And     user Enter valid email "test@example.com"
      And     user Enter valid Password "P@ssw0rd"
      When    user click on Login Button
      Then    User login into the system successfully


      Scenario: user could login with invalid email and password
        Given   user Click on Login button from home page
        And     user Enter invalid email "wrong@example.com"
        And     user Enter invalid Password "P@ssw0rd"
        When    user click on Login Button
        Then    User could not login to the system